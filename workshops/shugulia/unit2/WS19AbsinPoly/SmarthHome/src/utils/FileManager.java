
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Simabaña J
 */
public class FileManager {
    
    public static ArrayList<String> read(String fileName){
        ArrayList<String> recoveredData=new ArrayList<>();
        //Exceptions
        try{
            //code to try
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData.add ( reader.nextLine()) ;
            }
            reader.close();
        } catch (FileNotFoundException ex ) {
            //code to mnage theerror
            System.out.println("An error occuured while opening" + fileName + 
                    "/n File not found. \n Please make sure that your "
                     +"file is in the project folder\n "
                     +"Please contact the rogram manager and provide the log of the system" );
            ex.printStackTrace();
        }
        return recoveredData;
        
    }
    
    public static boolean save(String fileName, String data){
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data+"\n");
            fileWriter.close();
            return true;
        }catch(IOException ex){
            System.out.println("An error occured, " + fileName + "could not be updated");
            ex.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
}




  
