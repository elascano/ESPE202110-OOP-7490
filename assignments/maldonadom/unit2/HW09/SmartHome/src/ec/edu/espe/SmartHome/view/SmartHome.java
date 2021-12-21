
package ec.edu.espe.SmartHome.view;

import com.google.gson.Gson;
import utils.FileManager;

/**
 *
 * @author MateoMaldonado
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("list of devices from my home");
        String devices;
        String fileName="data/devices.csv";
        devices=FileManager.read(fileName);
        
        System.out.println("--> \n" + devices);
        
        fileName="data/animals.csv";
        String animals=FileManager.read(fileName);
        
        System.out.println("--> \n" + animals);
        
        String device="06,home theater,living room,on,80";
        FileManager.save("data/devices.csv", device);
        
        Gson gson;
        gson=new Gson();
    }
}
