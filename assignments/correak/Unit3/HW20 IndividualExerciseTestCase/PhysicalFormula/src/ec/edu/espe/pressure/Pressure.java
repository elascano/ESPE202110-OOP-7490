/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.pressure;
import java.text.DecimalFormat;

/**
 *
 * @author KERLY CORREA
 */
public class Pressure {
    public float pressure(float force,float area){
        float pressure ;
        float total;
        
        total = force/area;
        
        DecimalFormat df = new DecimalFormat("$.00");
        pressure=(float)Math.round(total*1000f)/1000;
        
                
        return pressure;
        
    }
    
}
