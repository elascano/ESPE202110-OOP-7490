/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartHome.view;

import com.google.gson.Gson;
import ec.edu.espe.smartHome.model.Device;
import ec.edu.espe.smartHome.model.TvBox;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Quinga Leandro
 */
public class SmartHome {
    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList<>();
        TvBox device;
        device = new TvBox(100, 50, channels, 1,"samsung 52 inches","bedrom",true,5);
        String satatus = "";
        System.out.println("device class"+tvBox.getClass());
        System.out.println("Device Description"+tvBox.getDescription());
        
        if(device.isStatus()){
            status = "on";    
        }else{
            status = "off";
        }
        System.out.println("Device-->"+tvBox.getClass().getSimpleName()+"is-->"+status);
        
        System.out.println("Device volumen-->"+tvBox.getVolumem); 
        System.out.println("Device id"+device.getId());
        
    }
        public static void oldMain(){
        System.out.println("list of devices from my home ");
        ArrayList<String> devices = new ArrayList<>();
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        
        fileName = "data/animals.csv";
        ArrayList<String> animals = FileManager.read(fileName);
        System.out.println(" --> ANIMALS \n "+ animals);

        //Todo menu
        //TODO code to read from keyboard 
        //String device= "06,home theater,living room,on,80";
        //FileManager.save("data/devices.csv", device);
        
//      String device = "";
        System.out.println("list of devices from my home json format ");
        devices = new ArrayList<>();
        fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        
//        device = "{\"id\";\"01\",\"description\";\"tv box\",\"room\";\"bedroom\",\"status\":\"true\",\"wo kingData\":10}";
//        FileManager.save(fileName, device);
//        devices = FileManager.read(fileName);
//         System.out.println(" --> DEVICES \n "+ devices);
         
        Device device;
        device = new Device(01,"printer","study room",true,120) {};
        
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

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(devicesList);
        
        String devicesListJson;
        devicesListJson = gson.toJson(devicesList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(devicesListJson);
    }
}
    /*public static void main(String[] args) {
        System.out.println("lis of devices from my home");
        String devices;
        String fileName = "data/device.csv";
        devices = FileManager.read(fileName);
        System.out.println("-->DEVICES \n"+devices);
        
        fileName = "data/animals.csv";
        String animals=FileManager.read(fileName);
        System.out.println("-->ANIMALS"+animals);
        
        String device = "06,home theater,living room,on,80";
        FileManager.save("data/devices.csv", device);
    }
   
}
*/