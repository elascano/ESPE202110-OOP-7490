

package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TvBox;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author malvarez
 */
public class SmartHome {
    public static void main(String[] args) {
        ArrayList<String>channels= new ArrayList<>();
        
        TvBox tvBox;
        
        tvBox=new TvBox(100, 50, channels, 1, "samsung 52 inches", "bedroom", true, 56);
        String status="";
        
        System.out.println("device class -->"+tvBox.getClass());
        System.out.println("Device id  ----->"+tvBox.getId());
        System.out.println("Device description  ----->"+tvBox.getDescription());
        
        if(tvBox.isStatus()){
            status="on";
        }else{
            status="off";
        }
        
        System.out.println("Device"+tvBox.getClass().getSimpleName()+"is  ----->"+tvBox.isStatus());
        System.out.println("Device volumen ---> "+tvBox.getVolume());
        System.out.println("Tv is sleeping");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven=new MicrowaveOven(0, 0, 0, 0, status, status, true, 0);
        System.out.println("Microwave is sleeping");
        microwaveOven.sleep(20);
    }
   /* public static void main(String[] args) {
        System.out.println("List of devices from my home in jason format");
        ArrayList<String> devices = new ArrayList<>();
        String fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n" + devices);   
        
        System.out.println("\n--------> DATA DEVICE <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> id <---");
        int id = scanner.nextInt();
        System.out.println("---> description <---");
        String description = scanner.next();
        System.out.println("---> room <---");
        String room = scanner.next();
        System.out.println("---> status <---");
        boolean status = scanner.nextBoolean();
        System.out.println ("---> working data <---");
        int workingData = scanner.nextInt();   

        Device device;
        device = new Device(id, description, room, status, workingData);
 
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
        
    }*/
    
}