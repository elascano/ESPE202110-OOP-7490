package ec.edu.espe.smart.view;

import utils.FileManager;

/**
 *
 * @author Javier Paucar
 */
public class SmartHome {

    public static void main(String[] args) {
        System.out.println("List of devices from my home");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        
        System.out.println("--> DEVICES \n" + devices);

    
        String device = "6;home theater;living room;on;80";
        FileManager.save("data/devices.csv", devices);
        
    }
}
