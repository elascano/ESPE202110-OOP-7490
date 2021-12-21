package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Joel
 */
public class SmartHome {
   
public static void main(String[] args){
    System.out.println("List of devices from my home");
    String devices;
    String fileName = "data/devices.csv";
    devices = FileManager.read(fileName);
    System.out.println(" --> DEVICES \n " + devices);
    
    String device = "{\"id\":\"03\",\"description\":\"fridge\",\"room\":\"bedroom\",\"status\":\"true\",\"workingData\":10";
        FileManager.save(fileName, device);
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
         
        Device device;
        device = new Device(01, "printer","study room",true,120);

        Gson gson;
        gson = new Gson();

        String jsonDevice= gson.toJson(device);
        FileManager.save(fileName, jsonDevice);
        
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

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(devicesList);
        
        String devicesListJson;
        devicesListJson = gson.toJson(devicesList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(devicesListJson);
   }
}



