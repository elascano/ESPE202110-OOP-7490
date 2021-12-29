package utils;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alexander Ruano
 */
public class FileManager {
    //CRUD operations
    //C -create
    //R -read
    //U -update
    //D -delete
    
    public static String read(String fileName){
        String recoveredData="";
        //Exceptions, manejan errores en tiempo de ejecucion
        try{
            File file = new File(fileName);
            Scanner reader= new Scanner(file);
            while(reader.hasNextLine()){
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        }catch(FileNotFoundException ex){
            //code to manage error
            System.out.println("An error occured while opening" + fileName);
            ex.printStackTrace();
        }
        return recoveredData;
    }
    
    
}