
package utils;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class FileManager {
    //CRUD operations
    //C - create
    //R - read
    //U - update
    //D - delete
    
    public static String read(String fileName){
        String recoveredData="";
        //Exceptions
        try{
            //code to try 
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        
        }catch(Exception ex) {
            System.out.println("An error ocurred while opening" + fileName);
            ex.printStackTrace();
        }
        
        return recoveredData;
        
   }
}