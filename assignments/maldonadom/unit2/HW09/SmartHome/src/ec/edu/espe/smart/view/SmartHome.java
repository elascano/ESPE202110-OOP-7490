/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.smart.view;

import utils.FileManager;

/**
 *
 * @author andresmaldonado
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code to manage devices files
        System.out.println("List of devices from my home");
        String devices;
        String fileName = "devices.csv";
        devices = FileManager.read(fileName);
        
        System.out.println("--- \n" + devices);
        
        fileName = "animals.csv";
        String animals = FileManager.read(fileName);
        System.out.println("--- Animals \n"+ animals);
        
        String device ="06,home theather,living room,on,80";
        FileManager.save("devices.csv",device);
    }      
    
}
 