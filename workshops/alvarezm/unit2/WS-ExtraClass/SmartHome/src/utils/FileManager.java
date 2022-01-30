
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author malvarez
 */
public class FileManager {
    //CRUD operations
    //C - create
    //R - read
    //U - update
    //D - delete
    
    public static String read(String fileName){
        String recoveredData = "";
        
        //Exceptions
        try{
         // code to try
         
         File file = new File (fileName);
         Scanner reader = new Scanner (file);
         
            while (reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
         
         reader.close();
         
        }
        
        catch(FileNotFoundException ex){
            // code to manage the error
            
            System.out.println("An error occurred while opening " + fileName + 
                    "\n File not found. \n Please make sure that your file is in the project folder"+
                    "Please contact the program manager and provide the log of the system");
            
            ex.printStackTrace();      //it must be saved in a -log- que guarda los historicos
        }
        
        return recoveredData;
    }
    
    public static boolean save(String fileName, String data){
            
            try{
                FileWriter fileWriter = new FileWriter (fileName, true);
                fileWriter.write("Hello, this in going to the file");
                fileWriter.close();
                return true;
            }
            
            catch(IOException ex){
                System.out.println("An error occurred," + fileName + "could not be updated");
                ex.printStackTrace();
                return false;
                
    }
            
        }
        
        
        
}
    

