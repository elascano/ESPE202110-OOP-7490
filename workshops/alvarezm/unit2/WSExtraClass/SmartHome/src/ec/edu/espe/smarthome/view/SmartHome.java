
package ec.edu.espe.smarthome.view;

import com.google.gson.Gson;
import ec.edu.espe.smarthome.model.Device;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author malvarez
 */
public class SmartHome {
    
    public static void main(String[] args) {
        Device device = new Device(1, "samsung 52 inches", "debroom", true, 5);
        System.out.println("Device description" + device.getDescription());
        
    }
    
    public static void oldmain(String[] args) {
        
        System.out.println("List of devices from my home");
        String devices;
        String fileName = "Data/devices.csv";
        devices = FileManager.read(fileName);
        System.out.println("-->DEVICES \n" +devices);
        
        String device = "06; home theater; living room; on; 80";
        FileManager.save("Data/devices.csv", device);
        
//        String device= "";
        System.out.println("List of devices from my home in json format");
        devices= new ArrayList<>();
        fileName = "Data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println("--> DEVICES \n" + devices);
        
//        device = "{\"id\": \"01\", \"description\": \"tv box\", \"room\": \"bedroom\", \"status\": \"true\", \"workingdata\": \"10\"}";
//        FileManager.save(fileName, device);
//        devices = FileManager.read(fileName);
//        System.out.println("--> DEVICES \n" + devices);

          Device = device;
          device = new Device(01,"printer", "study room", true, 120);
          
        Gson gson;
        gson = new Gson();

        //String jsonDevice= gson.toJson(device);
        //FileManager.save(fileName, jsonDevice);
        
        ArrayList<Device> devicesList = new ArrayList<>();
        
        devices = new ArrayList<>();
        fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        
        for(String deviceString : devices){
            System.out.println("device String --> " + deviceString + " <--");
            devicesList.add(device);
            device = gson.fromJson(deviceString, Device.class);
            System.out.println("device id -> " + device.getId());
            
        }
    
    }
    
    
}


