
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.devices;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Anderson
 */
public class SmartHouse {
    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList<>();
        Device device;
        Devices = new TvBox(1,"sansung 52 inches","Bedroom",true,5) {};
        System.out.println("Device");
        System.out.println("Device Description "+ devices.description);
        
        
        
        
        
        
        
        
        System.out.println("list of devices from my house ");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        
        System.out.println("--> \n " + devices);  
    }
    
}
