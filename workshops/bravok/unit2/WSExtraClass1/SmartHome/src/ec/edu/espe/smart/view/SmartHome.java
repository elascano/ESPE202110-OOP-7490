
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Device;
import java.util.ArrayList;
import utils.FileManager;
/**
 *
 * @author Katherin Bravo
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List of devices of the home ");
        String devices;
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        
        System.out.println("  -->DEVICES \n"+ devices);
        
        fileName = "data/animals.csv";
        String animals = FileManager.read(fileName);
        ArrayList<String>animals = FileManager.read(fileName);
        System.out.println("--->ANIMALS\n" + animals);
        
        String device = "";
        System.out.println("list of devices from my home in json format");
        devices = new ArrayList<>();
        fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println("---> DEVICES \n" + devices);
        
        device = "{\"id\":\"03\"\"description\":\"fridge\";\"room\":\"bedroom\",\"status";
        FileManager.save(fileName, device);
        devices = FileManager.read(fileName);
        System.out.println("---> DEVICES \n" + devices);
       
        Device device;
  
        device = new Device (01, "printer", "study room", true, 120);
        
        Gson gson();
        
        String jsonDevice= gson.taJson(device);
        FileManager.save(fileName, jsonDevice);
        
        
        
    }
}


    


