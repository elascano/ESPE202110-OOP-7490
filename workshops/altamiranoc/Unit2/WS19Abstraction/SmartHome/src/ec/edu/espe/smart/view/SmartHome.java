
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TvBox;
import utils.FileManager;
import java.util.ArrayList;
/**
 *
 * @author Altamirano Cristhian
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList();
        TvBox tvBox;
        String status = "";
        
        tvBox = new TvBox(100, 50,channels, 1, "samsung 52 inches", "bedroom", true, 5);
        System.out.println("device class -> " + tvBox.getClass());
        System.out.println("Device id --> " + tvBox.getId());
        System.out.println("Device Description --> " + tvBox.getDescription());
        if(tvBox.isStatus()){
            status = "on";
        }else{
            status = "off";
        }
        
        System.out.println("Device status"+ tvBox.getClass().getSimpleName()+" is --> "+ status);
        
        System.out.println("Device volumen --> " + tvBox.getVolume());
        System.out.println("tv is sleeping");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven = new MicrowaveOven(0, 0, 0, 0, "", "", true, 0);
        System.out.println("microwave is sleeping");
        microwaveOven.sleep(20);
        
        

    }
    
}
