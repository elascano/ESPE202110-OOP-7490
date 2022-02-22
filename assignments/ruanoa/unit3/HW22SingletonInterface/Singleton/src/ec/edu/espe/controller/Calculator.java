
package ec.edu.espe.controller;

/**
 *
 * @author Alexander Ruano, DEEL-ESPE
 */
public class Calculator {
    public static float salesTotal(String base,float total) {
        float taxRate=6.25F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
        
        }
}
