package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dylanasumaza
 */
public class FileManager {

    public static String Read(String fileName) {
        String recoveredData = "";
        //code to manage file
        //Exeptions
        try {
            //Code to try 
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            //code to manage the error
            System.out.println(" An eeror occuured while opening" + fileName
                    + "\n File not found. \n Please make sure that your"
                    + "file is in the project folder"
                    + "Please contact the program manager and provide the log of the system ");
            ex.printStackTrace();
        }
        return recoveredData;
    }

}
