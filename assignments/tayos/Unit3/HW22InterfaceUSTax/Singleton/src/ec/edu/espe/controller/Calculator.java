
package ec.edu.espe.controller;

/**
 *
 * @author Sebastian Tayo
 */
public class Calculator {
    public static float salesTotal(String base,float total) {
        float taxRate=6.25F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
        
        }
}
