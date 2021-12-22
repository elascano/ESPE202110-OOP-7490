
package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MateoMaldonado
 */
public class FileManager {
    public static String read(String fileName){
        String recoveredData="";
        
        try{
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        }catch(Exception ex){
            System.out.println("An error ocurred while opening" + fileName
                    + "\n File not found. "
                            + "\n Please make sure that your file is in the project folder");
            ex.printStackTrace(); //it most be saved in a -->log<--
        }
     
        return recoveredData;
    }
    
    public static boolean save(String fileName, String data) {
        try{
            
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data+"\n");
            fileWriter.close();
            return true;
        } catch(IOException ex){
            System.out.println("An error ocurred"+ fileName+ "could not be updated");
            ex.printStackTrace();
            return false;
        }
        
    }
}  
