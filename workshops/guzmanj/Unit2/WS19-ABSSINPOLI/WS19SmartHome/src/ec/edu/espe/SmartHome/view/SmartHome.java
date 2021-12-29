/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.SmartHome.view;

import ec.edu.espe.SmartHome.model.TvBox;
import ec.edu.espe.SmartHome.model.MicrowaveOven;
import java.util.ArrayList;

/**
 *
 * @author Jose Guzman
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> channels= new ArrayList<>(); 
        TvBox tvBox;
        tvBox= new TvBox(100,50,channels,2,"samsung","bedroom",true,5);
        
        String status="";
        
        System.out.println("Device class -> " + tvBox.getClass());
        System.out.println("Device id -> " + tvBox.getId());
        System.out.println("Device description -> " + tvBox.getDescription());
        
        if(tvBox.isStatus()){
            status="on";
        }else{
            status="off";
        }
        
        System.out.println("Device" +tvBox.getClass().getSimpleName() + "is -> " + status);
        
        System.out.println("Device volume -> " + tvBox.getVolume());
        System.out.println("tv is sleeping");
        tvBox.sleep(20);
        
        MicrowaveOven microwaveOven=new MicrowaveOven(0,0,0,0,"","",true,0);
        System.out.println("microwave is sleeping");
        microwaveOven.sleep(20);
    }
}
