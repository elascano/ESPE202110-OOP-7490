package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guitarra Jhon
 */
public class FileManager {
    public static ArrayList<String> read(String fileName){
        ArrayList<String> recoveredData = new ArrayList<>();
        
        try{//code to try 
            File file = new File(fileName);
            Scanner reader = new Scanner(file);        
            while(reader.hasNextLine()){
                recoveredData.add(reader.nextLine());
            }
            reader.close();
            
        }catch(Exception ex){
            //code to manage
            System.out.println(" An error occurred opening: \n"+ fileName +" in File not found.");
            ex.printStackTrace();
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
            ex.printStackTrace();
            return false;
        }
    }
}
