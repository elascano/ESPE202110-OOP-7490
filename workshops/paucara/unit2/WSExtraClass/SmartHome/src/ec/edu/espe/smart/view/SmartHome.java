
package ec.edu.espe.smart.view;

import utils.FileManager;

/**
 *
 * @author Javier Paucar
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List of devices form my home");
        String devices;
        String fileName = "data/devices.csv";
        FileManager.read(fileName);
        devices = FileManager.read(fileName);
        
        System.out.println(" --> \n" + devices);
        
        String device = "6;home theater;living room;on;80";
        FileManager.save("data/devices.csv" , device);
    }
    
}
