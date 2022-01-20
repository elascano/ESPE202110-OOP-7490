package smarthome;

import utils.FileManager;

/**
 *
 * @author MiASUS
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("list of devices from my home");
        String devices;
        String fileName = "data/device .csv";
        devices = FileManager.read(fileName);
        System.out.println("-->DEVICES \n" + devices);
        String device = "06,home theater , living room"
       
        
    }
        
        
    
    
}
