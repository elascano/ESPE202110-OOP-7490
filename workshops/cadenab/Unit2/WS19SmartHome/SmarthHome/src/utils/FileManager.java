/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class FileManager {
    //CRU operations
    //C- create
    //R-read
    //U-update
    //D-delete
    
    public static String read( String fileName){
        String recoveredData="";
        
        try{
            //code to try
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData = recoveredData +reader.nextLine();
            }
        }catch(FileNotFoundException ex){
            System.out.println("An error ocurred while opening" + fileName + 
                           "/n File not found.\n Please make sure that your"
                            + "file is in the project folder"
                            + "Please contact the program manager and provide the log of the system");
            ex.printStackTrace();//it must be saved in a --> log <--
        }
        return recoveredData;
    }
}
