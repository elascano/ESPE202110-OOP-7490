/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartHome.view;

import com.google.gson.Gson;
import ec.edu.espe.smartHome.model.MicrowaveOven;
import ec.edu.espe.smartHome.model.TvBox;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Leandro Quinga 
 */
public class SmartHome {
    public static void main(String[] args) {
        ArrayList<String> channels = new ArrayList<>();
        TvBox tvBox;
        
        tvBox = new TvBox(100, 50, channels, 1,"samsung 52 inches","bedrom",true,5);
        String Status = "";
        
        System.out.println("device class       -->"+tvBox.getClass());
        System.out.println("Device id          -->"+tvBox.getId());
        System.out.println("Device Description -->"+tvBox.getDescription());
        
        if(tvBox.isStatus()){
            Status = "on";    
        }else{
            Status = "off";
        }
        System.out.println("Device-->"+tvBox.getClass().getSimpleName()+"is-->"+Status);
        
        System.out.println("Device volumen-->"+tvBox.getVolumen()); 
        System.out.println("tv is sleeping");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven = new MicrowaveOven(0, 0, 0, 0,"","", true, 0);
        System.out.println("microwave is sleeping");
        microwaveOven.sleep(20);
        
    }
}
        