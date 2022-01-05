package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayer
 */
public class FileManager {

    //CRUD operations
    //C - create
    //R- read
    //U - update
    //D- delete
    public static ArrayList<String> read(String fileName) {
        ArrayList<String>  recoveredData = new ArrayList<>();
        //Exceptions- manejar errores en tiempo de ejecución 
        try {
            //code yo try

            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                recoveredData.add(reader.nextLine());
            }

            reader.close();
        } catch (FileNotFoundException ex) {
            //code to manage the error

            System.out.println("An error ocurred while opnening" + fileName
                    + "\nFile not found.\n Please make sure that your"
                    + "file is in the project folder"
                    + "please contact the program manager and provide the log of the system");
            ex.printStackTrace();// It must be saved in a -->log<--
        }
        return recoveredData;

    }

    public static boolean save(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data + "\n");
            fileWriter.close();
            return true;
        } catch (IOException ex) {
            System.out.println("An error ocurred," + fileName + "could not be updated");
            ex.printStackTrace();//this message should go to the log system
            return false;

        }

    }
}
