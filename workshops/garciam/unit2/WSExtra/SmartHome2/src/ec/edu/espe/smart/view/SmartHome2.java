package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author mayerly
 */
public class SmartHome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        System.out.println("List of devices from my home");
        ArrayList<String> devices = new ArrayList<>();
        String fileName = "data/devices.csv";
        devices = FileManager.read(fileName);
        System.out.println("--->DEVICES \n" + devices);

        Scanner read = new Scanner(System.in);
        boolean Exit = false;

  
        
        int id;
        String description;
        String room;
        boolean status;

        while (!Exit) {
            System.out.println("1.add data ");
            System.out.println("2.remove data");
            System.out.println("3.update data");
            System.out.println("4. Exit");

            System.out.println("Please, choose any option");
            int option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("-please enter the information");
                    System.out.println("Enter the id ");
                    id = read.nextInt();
                    System.out.println("Enter the description ");
                    description = read.next();
                    System.out.println("Enter the room ");
                    room = read.next();
                    System.out.println("Enter true or false:");
                    status = read.nextBoolean();
                    
                Device device = new Device(id, description, room, status, option);
                     device.add(device);
                    break;

                case 2:
                    System.out.println("-please enter the information");
                    System.out.println("Enter the id ");
                    id = read.nextInt();
                    System.out.println("Enter the description ");
                    description = read.next();
                    System.out.println("Enter the room ");
                    room = read.next();
                    System.out.println("Enter true or false:");
                    status = read.nextBoolean();
                    
                    device = new Device(id, description, room, status, option);
                    device.remove(id);
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    Exit = true;

                    break;
            }

            //Todo menu
            //code to read from keyboard
            //String device ="06,home theater,living room,on,80";
            //FileManager.save("data/devices.csv",device);
            //String device = "";
            System.out.println("list of devices from my home in json format ");
            devices = new ArrayList<>();
            fileName = "data/devices.json";
            devices = FileManager.read(fileName);
            System.out.println("--->DEVICES \n" + devices);

//        device = "{\"id\":\"03\", \"description\" :\"fridge\",\"room\":\"bedroom\", \"status\":\"true\",\"workingdata\":10}";
//        FileManager.save(fileName, device);
//        devices = FileManager.read(fileName);
//        System.out.println("--->DEVICES \n" + devices);
            Device device;
            device = new Device(01, "printer", "study room", true, 120);

            Gson gson;
            gson = new Gson();

            //String jsonDevice= gson.toJson(device);
            //FileManager.save(fileName, jsonDevice);
            ArrayList<Device> devicesList = new ArrayList<>();

            devices = new ArrayList<>();
            fileName = "data/devices.json";
            devices = FileManager.read(fileName);
            System.out.println(" --> DEVICES \n " + devices);

            for (String deviceString : devices) {
                System.out.println("device String --> " + deviceString + " <--");
                devicesList.add(device);
                device
                        = gson.fromJson(deviceString, Device.class
                        );
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
}
