package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author SETayoRuiz
 */
public class SmartHome {

    public static void main(String[] args) {

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
        System.out.println("---> working data <---");
        int workingData = scanner.nextInt();

        Device device;
        device = new Device(id, description, room, status, workingData);

        Gson gson;
        gson = new Gson();

        String jsonDevice = gson.toJson(device);
        FileManager.save(fileName, jsonDevice);

        ArrayList<Device> devicesList = new ArrayList<>();

        devices = new ArrayList<>();
        fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n " + devices);

        for (String deviceString : devices) {
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
