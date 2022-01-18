
package smathome;

import Utils.FileManager;

/**
 *
 * @author Christian Bravo
 */
public class SmartHome {

    public static void main(String[] args) { 
        System.out.println("List of devices from my home");
        
        String devices;
        String fileName = "data/device.csv";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        
        fileName = "data/animals.csv";
        String animals = FileManager.read(fileName);
        System.out.println("---> ANIMALS \n" + animals);
        
        String device = "06,home theater,living room,on,80";
        FileManager.save("data/devices.csv",device);
        
    } 
    
}
