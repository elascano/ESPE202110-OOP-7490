
package es.edu.espe.smart.view;

import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author mayerly
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List of devices from my home");
        String devices;
        String fileName = "data/devices.csv";
        devices =FileManager.read(fileName);
        System.out.println("--->DEVICES \n"+devices);
        
        String device ="06,home theater,living room,on,80";
        FileManager.save("data/devices.csv",device);
          
        
    }
    
}
