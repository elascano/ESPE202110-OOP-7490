package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Device;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Javier Paucar
 */
public class SmartHome {

    public static void main(String[] args) throws IOException {
        int number;
        int option;
        int id = 0;
        String description = "";
        String room = "";
        boolean status = true;
        int workingData = 0;
        Scanner scanner = new Scanner(System.in);

        Device device;
        ArrayList<Device> devices1 = new ArrayList<>();
        ArrayList<String> devices = new ArrayList<>();
        device = new Device(id, description, room, status, workingData, devices1);

        System.out.println(" HW10 PROJECT FILES --> JAVIER PAUCAR <--- ");
        System.out.println("Do you want to enter the menu? ->  \n 1 --> YES \n 0 --> NO");
        number = scanner.nextInt();
        while (number == 1) {
            System.out.println("\n1--> Create a New Device\n2--> Read Device List\n3--> Updated List\n4--> Delete a Device\n5--> Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("--> Please enter the device data <--");
                System.out.println("ID           -->");
                id = scanner.nextInt();
                System.out.println("DESCRIPTION  -->");
                description = scanner.next();
                System.out.println("ROOM         -->");
                room = scanner.next();
                System.out.println("STATUS       -->");
                status = scanner.nextBoolean();
                System.out.println("WORKING DATA -->");
                workingData = scanner.nextInt();
                device = new Device(id, description, room, status, workingData, devices1);
                device.add(device);
                System.out.println("\n Device -->" + device);
                System.out.println("\n");
                FileManager.save("data/devices.csv", device);
            }

            if (option == 2) {
                System.out.println("DEVICE LIST");
                String fileName = "data/devices.csv";
                devices = FileManager.read(fileName);
                System.out.println("\n" + devices);
            }

            if (option == 3) {
                System.out.println("Updated List");
                String fileName = "data/devices.csv";
                devices = FileManager.read(fileName);
                System.out.println("\n" + devices);
            }

            if (option == 4) {
                System.out.println("Delete the Device for ID");
                id = scanner.nextInt();
                device.remove(id);
                System.out.println("Device has been removed");
                System.out.println("\n");
            }

            if (option == 5) {
                break;
            }
        }
    }

}
