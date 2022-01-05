package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.TvBox;
import utils.FileManager;
import java.util.ArrayList;

/**
 *
 * @author Melanie
 */
public class SmartHome {

    public static void main(String[] args) {

        ArrayList<String> channels = new ArrayList<>();
        TvBox device;
        device = new TvBox(100, 50, channels, 1, "samsung 52 inches", "bedroom", true, 5);
        System.out.println("device class --> " + device.getClass());
        System.out.println("Device id --> " + device.getId());
        System.out.println("Device Description " + device.getDescription());
        System.out.println("Device status --> " + device.isStatus());
        System.out.println("Device volume --> " + device.getVolume());
    }

    public static void oldMain() {
        System.out.println("list of devices from my home ");
        String devices;
        String fileName = "devices.csv";
        devices = FileManager.read(fileName);

        System.out.println("--> \n" + devices);

//        String device = "06, home theater, living room,on,80";
//        FileManager.save("data/devices.csv", device);
        Device device;
        //device = new Device(01, "printer", "study room", true, 120);

        Gson gson;
        gson = new Gson();

        //String jsonDevice= gson.toJson(device);
        //FileManager.save(fileName, jsonDevice);
        ArrayList<Device> devicesList = new ArrayList<>();

        //devices = new ArrayList<>();
        fileName = "devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n " + devices);

        /*for(String deviceString : devices){
            System.out.println("device String --> " + deviceString + " <--");
            devicesList.add(device);
            device = gson.fromJson(deviceString, Device.class);
            System.out.println("device id -> " + device.getId());
            
        }*/
        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(devicesList);

        String devicesListJson;
        devicesListJson = gson.toJson(devicesList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(devicesListJson);

    }

}
