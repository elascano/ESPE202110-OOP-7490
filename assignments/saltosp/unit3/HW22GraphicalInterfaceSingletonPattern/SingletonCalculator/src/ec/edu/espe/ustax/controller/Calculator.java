
package ec.edu.espe.ustax.controller;

/**
 *
 * @author Paul Saltos , DEEL-ESPE
 */
public class Calculator {
    public static float salesTotal(String base,float total) {
        float taxRate=8.00F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
    }
}
