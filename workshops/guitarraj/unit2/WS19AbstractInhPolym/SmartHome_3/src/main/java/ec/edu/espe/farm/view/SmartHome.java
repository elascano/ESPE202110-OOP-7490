package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.MicrowaveOven;
import ec.edu.espe.farm.model.TvBox;
import java.util.ArrayList;

/**
 *
 * @author Guitarra Jhon 
 */
public class SmartHome {
    public static void main(String[] args){
        
        ArrayList<String> channels  = new ArrayList();
        TvBox tvBox;
        
        tvBox = new TvBox(100,50,channels,1,"samsung 52 inches","bedroom",true,5);
        String status ="";
        
        System.out.println("tvBox class  -->"+tvBox.getClass());
        System.out.println(" " + tvBox.getId());
        System.out.println("tvBox Description  --->    " + tvBox.getDescription());
        if (tvBox.isStatus()) {
            status = "on";
        }else{
            status = "off";
        }
        
        System.out.println("tvBox status   --->  " + tvBox.getClass().getSimpleName()+"is -->" + status );
        
        System.out.println("tvBox Volume --->"+tvBox.getVolume());
        System.out.println("Tv is Sleeping");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven = new MicrowaveOven(0,0,0,0,"","",true,0);
        System.out.println("microwave is sleeping ");
        microwaveOven.sleep(20);
        }
}

