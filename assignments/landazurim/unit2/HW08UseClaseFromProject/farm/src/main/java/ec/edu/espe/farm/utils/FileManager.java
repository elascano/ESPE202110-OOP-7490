package ec.edu.espe.farm.utils

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class FileManager {
    public static String read(String fileName){
        String recoveredData = "";
                
        try{//code to try 
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            
            while(reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n" ;
            }
            reader.close();
            
        }catch(Exception ex){
            //code to manage
            System.out.println(" An error ocuured while opening " + fileName+
                    "\n File not found. \n a new file will be created with the following name: --> " + fileName );
            //ex.printStackTrace();
        }
        return recoveredData;
    }
    
    public static boolean save(String fileName, String data){
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data +"\n");
            fileWriter.close();
            return true;
        }catch(IOException ex){
            System.out.println("An error occurred, "+ fileName + "could not the updated");
            ex.printStackTrace();
            return false;
        }
    }
}
