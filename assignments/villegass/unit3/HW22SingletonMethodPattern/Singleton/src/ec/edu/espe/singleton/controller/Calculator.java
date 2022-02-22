
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class Calculator {
        public static float salesTotal(String base,float total) {
        float taxRate=6.25F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
        
        }
    
}
