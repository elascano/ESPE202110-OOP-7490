package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Device;
import ec.edu.espe.farm.model.TvBox;
import java.util.ArrayList;
import utils.FileManager;
import static utils.FileManager.read;

/**
 *
 * @author darling.cruz 
 */
public class SmartHome {
    public static void main(String[] args){
        
        ArrayList<String> channels  = new ArrayList();
        TvBox device;
        device = new TvBox(100,50,channels,1,"samsung 52 inches","bedroom",true,5);
        System.out.println("device class  -->"+device.getClass());
        System.out.println(" " + device.getId());
        System.out.println("Device Description  --->    " + device.getDescription());
        System.out.println("Device status   --->  " + device.isStatus());
        System.out.println("Device Volume --->"+device.getVolume());
        device.getVolume();

        }
}

