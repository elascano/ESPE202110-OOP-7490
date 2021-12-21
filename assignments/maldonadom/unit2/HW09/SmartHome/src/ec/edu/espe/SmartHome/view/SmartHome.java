
package ec.edu.espe.SmartHome.view;

import com.google.gson.Gson;
import ec.edu.espe.SmartHome.model.Device;
import ec.edu.espe.SmartHome.model.TvBox;
import java.util.ArrayList;
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
        ArrayList<String> channels = new ArrayList<>();
        TvBox tvBox;

        tvBox = new TvBox(100, 50, channels ,1 ,"samsung 52 inches", "bedroom",true,5);
        String status = "";
        
        System.out.println("device class ---> " + tvBox.getClass());
        System.out.println("Decice id ---> " +tvBox.getId());
        System.out.println("Device Description ---> " + tvBox.getDescription());
        
        if(tvBox.isStatus()){
            status = "on";
        } else {
            status = "off";
        }
        
        System.out.println("Device" + tvBox.getClass().getSimpleName()+ "+is --- " + status) ;
        
        System.out.println("Device volume ---> "+tvBox.getVolume());
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven = new MicrowaveOven(0, 0, 0, 0, "", "", true, 0);
        
        /*System.out.println("list of devices from my home");
        String devices;
        String fileName="data/devices.csv";
        devices=FileManager.read(fileName);
        
        System.out.println("--> \n" + devices);
        
        fileName="data/animals.csv";
        String animals=FileManager.read(fileName);
        
        System.out.println("--> \n" + animals);
        
        //String device="06,home theater,living room,on,80";
        //FileManager.save("data/devices.csv", device);
        
        Gson gson;
        gson=new Gson(); */

    }
}
