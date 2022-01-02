
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Tires;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sanchez Jose
 */
public class SmartHome {
     public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        Tires tires = new Tires(); 

    do{
	System.out.println("\n*******************Assigment 9*******************\n");
	System.out.println("******Sebastian Bernardo Caisatoa Ramirez******");
        System.out.println("\t\t Tire Data Management\n\n");
        
	System.out.println("1 ===> Add New Weapon ");
	System.out.println("2 ===> View All weapon ");	
	System.out.println("3 ===> Delete All weapon in CSV ");
	System.out.println("4 ===> Search weapon by ID ");
	System.out.println("5 ===> Update weapon Data ");	        
	    
	System.out.print("\n\n");
	System.out.println("Enter your choice: ");
        
        int option;
        option = read.nextInt();
	boolean opc = (option <= 5);
	if (opc) {
            switch(option){                
            case 1: 
                    tires.AddTires();
            break;
            case 2: 
                    tires.ViewAllTires();
            break;
            case 3:
                    tires.DeleteTire();
            break;
            case 4: 
                    tires.SearchTireID();
            break;
            case 5: 
                    tires.updateTireID();
            break;
            }
            } else {
            System.out.println("Enter a Number from 1 to 4."); 
            }
            System.out.println("\n\tDo you want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));                
    }        
}
/* System.out.println("list of devices from my home ");
        ArrayList<String> devices = new ArrayList<>();
        String fileName = "data/device.csv";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        /*
        String device= "05,home theater,living room,on,80";
        FileManager.save("data/device.csv", device);
        */
        
        /*
        System.out.println("list of devices from my home in json formet");
        devices = new ArrayList<>();
        fileName = "data/devices.json";
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);
        
        /*String device = "{\"id\":\"03\",\"description\":\"fridge\",\"room\":\"bedroom\",\"status\":\"true\",\"workingData\":10";
        FileManager.save(fileName, device);
        devices = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ devices);*/
        /* 
        Device device;
        device = new Device(01, "printer","study room",true,120);

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
*/
        