package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TvBox;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Camila
 */
public class SmartHome {

    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList<>();
        TvBox tvBox;
        
        tvBox = new TvBox(100, 50, channels, 1, "samsung 52 inches", "bedroom", true, 5);
        String status = "";
        
        System.out.println("WS19AbsInhPoly --> Camila Teca <--");
        System.out.println("Device class ----->" + tvBox.getClass());
        System.out.println("Device Id   ------>" + tvBox.getId());
        System.out.println("Device description " + tvBox.getDescription());
        
        if(tvBox.isStatus()){
            status= "on";
            
        }else{
            status ="off";
        }
        System.out.println("Device " + tvBox.getClass().getSimpleName() +" is --->" + status);
        
        System.out.println("Device volume --->" + tvBox.getVolume());
        System.out.println("Tv is sleeping ");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven = new  MicrowaveOven(0, 0, 0, 0, "", "", true, 0);
        System.out.println("Microwave is sleeping ");
        microwaveOven.sleep(20);
    }

   
}
