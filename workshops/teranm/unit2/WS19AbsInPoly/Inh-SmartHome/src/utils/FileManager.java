package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Melanie
 */
public class FileManager {
    //CRUD opretacions
    //C - create
    //R - read
    //U - update
    //D - delete

    public static String read(String fileName) {
        String recoveredData = "";
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error while opening " + fileName
                    + "\n file not found. \n Please make sure that your"
                    + "file is in the project.\n Please contact the program manager and provide the log of the system");

            ex.printStackTrace(); //--> log <--

        }
        return recoveredData;
    }

    public static boolean save(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data + "\n");
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("An error ocurred " + fileName + "could not be updated");
            ex.printStackTrace();

        }
        return false;
    }
}
