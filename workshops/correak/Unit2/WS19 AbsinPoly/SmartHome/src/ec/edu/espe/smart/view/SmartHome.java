/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// file manager que se guarde los datos 
package ec.edu.espe.smart.view;

import com.google.gson.Gson;
import ec.edu.espe.samrt.model.Device;
import ec.edu.espe.samrt.model.MicrowaveOven;
import ec.edu.espe.samrt.model.TvBox;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Kerly
 */
public class SmartHome {
    public static void main(String[] args){
        
        ArrayList<String> channels =new ArrayList<>();
        TvBox tvBox; 
        
        tvBox =new TvBox(100,50,channels ,1,"sansung 52inches","bedroom",true,5);
        String status="";
        
        System.out.println("device class      ->"+tvBox.getClass());
        System.out.println("Device Id         ->"+tvBox.getId());
        System.out.println("Device Description->"+tvBox.getDescription());
        
        if (tvBox.isStatus()) {
            status="on";
        
        }else{
            status ="off";
        }
        System.out.println("Device status"+tvBox.getClass().getSimpleName()+"is -->"+tvBox.isStatus());       
        System.out.println("Device volume     ->"+tvBox.getVolume());
        
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven;
        microwaveOven = new MicrowaveOven(0,0, 0);
        System.out.println("microwave is sleeping");
        microwaveOven.sleep(20);
    }
    

    
}
