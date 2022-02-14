
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.MicrowaveOwen;
import ec.edu.espe.smart.model.TvBox;
import java.util.ArrayList;


//encontrar donde utilizar los metodos de la clase
/**
 *
 * @author Caisatoa
 */
public class SmartHome {
    public static void main(String[] args) {
        
        ArrayList<String> channels = new ArrayList<>();
        TvBox tvBox;
        
        tvBox = new TvBox(100, 50, channels,1, "samsung 52 inches", "bedroom", true, 5);
        String status = "";
        
        System.out.println("Device class ---> "+ tvBox.getClass());
        System.out.println("Device id --->" + tvBox.getId());    
        System.out.println("Device Description --->" + tvBox.getDescription());    
        
        if(tvBox.isStatus()){
            status = "on";
        } else {
            status = "off";
        }
        
        System.out.println("Device " +tvBox.getClass().getSimpleName()+ " is --->" + status);
        
        System.out.println("Device Volumen --->" + tvBox.getVolument());
        tvBox.sleep(20);
        MicrowaveOwen microwaveOwen = new MicrowaveOwen(0,0,0,0,"","",true,0);
        System.out.println("MicrowaveOwen is sleeping");
        microwaveOwen.sleep(20);
    }
    
}