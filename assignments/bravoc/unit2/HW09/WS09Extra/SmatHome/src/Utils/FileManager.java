package Utils;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Christian Bravo
 */
public class FileManager {

    public static String read(String fileName) {
        String recoveredData = "";
        try {

            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
        } catch (Exception ex) {

            System.out.println("An error occuured while opening" + fileName
                    + "/n file not found. /n Please make sure that your"
                    + "file is in the project folder" + "Please contact the program manager and provide the log of the system");
            ex.printStackTrace();
        }

        return recoveredData;
    }

    public static boolean save(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("hola, this is going to the file");
            fileWriter.close();
            return true;

        } catch (IOExceptions ex) {
            System.out.println("An error occuured" + fileName + "could not be updated");
            ex.printStackTrace();
            return false;
        }    
    }

}
