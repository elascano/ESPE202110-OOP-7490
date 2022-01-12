
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.TvBox;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class SmarthHome {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        ArrayList<String> channels = new ArrayList<>();
        Device device;
        
        device = new TvBox(100, 50, channels, 1, "samsung 52 inches","bedroom",true,5);
        String status = "";
        
        System.out.println("device class      -->" + device.getClass());
        System.out.println("Device id         -->" + device.getId());
        System.out.println("Device Description-->" + device.getDescription());
        
        if(device.isStatus()){
            status = "on";
        }else {
            status = "off";
        }
        
        System.out.println("Device status     -->" + device.isStatus());
        System.out.println("Device volumen    -->" + device);
    }
   
    
    
}
