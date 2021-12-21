package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import utils.FileManager;

/**
 *
 * @author Camila
 */
public class SmartHome {

    public static void main(String[] args) {
        System.out.println("HW10 Files --> Camila Teca <--");
        System.out.println("List of devices from my home");
        String devices;
        String fileName = ("data/devices.csv");
        FileManager.read(fileName);
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n" + devices);

        //menu
        //codigo para ingresar datos
        // String device = "06;home theater;living room;on;80";
        //FileManager.save("data/devices.csv", device);
        
        //FILE IN JSON
        //    String device = "";
        System.out.println("List of devices from my home in json format");
        devices = "";
        fileName = ("data/devices.json");
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n" + devices);

//        device = "{\"id\":\"03\",\"description\":\"fridge\",\"room\":\"bedroom\",\"status\":\"true\",\"workingData\":\"10\"}";
//        FileManager.save("data/devices.json", device);
//        devices = FileManager.read(fileName);
//        System.out.println(" --> DEVICES \n" + devices);

        Device device;
        device = new Device(01,"printer", "study room ", true, 120);
        
        Gson gson;
        gson = new Gson();
        
        String jsonDevice = gson.toJson(device);
        FileManager.save(fileName, jsonDevice);
        
        
        
    }

}
