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
 * @author MiASUS
 */
public class FileManager {
    //CRUS Operations
    //C-create
    //r-read
    //u- update
    //d- delete
    public static String read (String fileName) {
        String recoveredData="";
        //Exceptions
        try{
            //code to try
            File file =new File (fileName);
            Scanner reader = new Scanner (file);
            while (reader.hasNextLine()){
                recoveredData = recoveredData +reader.nextLine()+"\n";
            }
            reader.close();
        }catch(FileNotFoundException ex){
            //code to manage the error
            System.out.println("An error occured while opening"+fileName +
                    "/n File not found.\n Please make sure that your "
                    + "file is in the project folder "
                    + "Please contact the rogram and provide the log of the system");
            ex.printStackTrace();//it must be saved in a  -> log <-
        }
        return recoveredData;
                
    }
    
    public static void save(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter (fileName , true);
            fileWriter.write("hola , this is going to the file");
            fileWriter.close();
            return true;
            
        } catch (IOException ex){
            
        }
        
    }
}
