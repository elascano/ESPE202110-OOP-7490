package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author  Angel Guaman
 */
public class FileManager {
    public static String  read(String fileName){
        String recoveredData="";
        
        try{
            File file =new File(fileName);
            Scanner reader = new Scanner (file);
            while (reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine()+ "\n";
            }
            reader.close();
        }catch (FileNotFoundException ex){
            System.out.println("An error occured while opening " +fileName +
                    " File not found. \n Please make sure that your " +
                    "file is in the project folder"
            +  "Please contact the program amager and provide the log oof the system");
            ex.printStackTrace();
        }
        return recoveredData;
    }
    
}