
package ec.edu.espe.smart.view;



import ec.edu.espe.smart.model.Device;
import ec.edu.espe.smart.model.MicrowaveOven;
import ec.edu.espe.smart.model.TvBox;
import java.util.ArrayList;

/**
 *
 * @author Andy Calderon
 */
public class SmartHome {
    
     public static void main(String[] args){
         ArrayList<String> channels = new ArrayList();
         TvBox tvBox;
         tvBox =new TvBox(100,50,channels,1,"samsung 52 inches", "bedroom", true,50);
         String status="";
         
     
     System.out.println("Device class      -->"  +tvBox.getClass());
     System.out.println("Device id         -->"  +tvBox.getId());
     System.out.println("Device Descrption -->"  +tvBox.getDescription());
     
     if(tvBox.isStatus()){
       status = "on";
     }else{
        status = "off";
     }
     
     System.out.println("Device " +tvBox.getClass().getSimpleName()  + "is -->"  +tvBox.isStatus());
     System.out.println("Device volumen    -->"  +tvBox.getVolume());
     
     
     tvBox.sleep(20);
     
     MicrowaveOven microwaveOven = new MicrowaveOven(0,0,0,0,"","",true,0);
         System.out.println("microwave is sleeping");
         microwaveOven.sleep(20);

     }
}
    