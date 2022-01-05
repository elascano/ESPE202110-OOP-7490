/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author José
 */
public class FileManager {

    public static String read(String fileName) {
        String recoveredData = "";
        try {
            File file = new File(fileName);
            try (Scanner reader = new Scanner(file)) {
                while (reader.hasNextLine()) {
                    recoveredData = recoveredData + reader.nextLine() + "\n";
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("An error occured while opening  " + fileName + "\n File not found. \n Please make sure that your"
                    + "file is in the project folder "
                    + "please contact the program manager and provide the log of the system");
            // esto se borra version final
        }

        return recoveredData;
    }

    public static boolean save(String fileName, String data){
        try{
            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(data+"\n");
            }
            return true;
        }catch(IOException ex){
            System.out.println("An error occurred, " + fileName + " could not be updated");
            
        return false;
        }
    }     
}  
