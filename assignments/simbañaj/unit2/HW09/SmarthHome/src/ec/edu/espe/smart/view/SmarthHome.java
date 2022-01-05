
package ec.edu.espe.smart.view;

import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Simbaña J 
 */
public class SmarthHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("list of devices from my home ");
         ArrayList<String> devices = new ArrayList<> ();
         String fileName = "data/device.csv";
         devices = FileManager.read(fileName);
         System.out.println(" ---> DEVICES \n"+ devices);
         
         fileName = "data/animals.csv";
         ArrayList<String> animals = FileManager.read(fileName);
         System.out.println(" --> ANIMALS \n" + animals);
         
         //String device = "06,home theater,living room,on,80";
         //FileManager.save("data/device.csv", device);
        
         
         String device = "" ;
         System.out.println("list of devices from my home in json format");
         devices = new ArrayList<>();
         fileName = "data/devices.json";
         devices = FileManager.read(fileName);
         System.out.println("--> DEVICES \n" + devices);
         
         device = "{\"id\":\"01\",\"description\":\"tv box\",\"room\":\"bedroom\",\"status\":\"true\",\"workingData\":10}";
         FileManager.save(fileName, device);
         devices = FileManager.read(fileName);
         System.out.println("--> DEVICES\n"+ devices);
         
         
    }
    
}
