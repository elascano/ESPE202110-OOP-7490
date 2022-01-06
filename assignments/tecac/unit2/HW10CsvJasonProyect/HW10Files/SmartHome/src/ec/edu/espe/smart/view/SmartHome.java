package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TxBox;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Camila
 */
public class SmartHome {

    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList<>();
        TxBox txBox;
        
        txBox = new TxBox(10, 50, channels, 1, "samsung 52 inches", "bedroom", true, 5);
        String status = "";
        
        System.out.println("WS19AbsInhPoly --> Camila Teca <--");
        System.out.println("Device class ----->" + txBox.getClass());
        System.out.println("Device Id   ------>" + txBox.getId());
        System.out.println("Device description " + txBox.getDescription());
        
        if(txBox.isStatus()){
            status= "on";
            
        }else{
            status ="off";
        }
        System.out.println("Device " + txBox.getClass().getSimpleName() +" is --->" + status);
        
        System.out.println("Device volume --->" + txBox.getVolume());
        System.out.println("Tv is sleeping ");
        txBox.sleep(20);
        
        MicrowaveOven microwaveOven = new  MicrowaveOven(0, 0, 0, 0, "", "", true, 0);
        System.out.println("Microwave is sleeping");
        microwaveOven.sleep(20);
    }

   
}
