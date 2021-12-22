/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class FileManager {
    //CRUD operations
    //C- create
    // r - READ
    //U - update
    //D - delete 
    
    public static String read(String fileName){
        String recoveredData="";
        
        //Exceptions
         try {
            //code to try 
             File file = new File(fileName);
             Scanner reader = new Scanner(file);
             while (reader.hasNextLine()) {
                 recoveredData = recoveredData+ reader.nextLine()+"\n";           
             }
             
            reader.close();
             
        } catch (FileNotFoundException ex) {
            //code to manage the error
             System.out.println("An error occured while opening"+fileName+
                     "/n File not found , \nPlease make sure that your");
             ex.printStackTrace();
        
        }
         
        return recoveredData;
        
    }
}
