
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Device;
import utils.FileManager;

/**
 *
 * @author Altamirano Cristhian
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("list of devices from my home");
        String devices;
        String fileName= "devices.csv";
        devices = FileManager.read(fileName);
        System.out.println(" -->DEVICES \n " + devices);
        
//        String device = "06,home theater,living room,on,80";
//        FileManager.save("devices.csv", device);
        Device device;
        device = new Device(01, "printer", "study room", true, 120);
        
        
        
        

    }
    
    
}
