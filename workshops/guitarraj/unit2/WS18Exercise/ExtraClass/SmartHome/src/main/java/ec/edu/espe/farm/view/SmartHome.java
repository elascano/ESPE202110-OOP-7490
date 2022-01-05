package ec.edu.espe.farm.view;

import utils.FileManager;

/**
 *
 * @author Guitarra Jhon 
 */
public class SmartHome {
    public static void main(String[] args){
        System.out.println("List of devices of the home ");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        System.out.println("  --> DEVICES \n"+ devices);      
        
        String device = "06, home teater,living room, on, 80";
        FileManager.save(fileName, device);
    }
}

