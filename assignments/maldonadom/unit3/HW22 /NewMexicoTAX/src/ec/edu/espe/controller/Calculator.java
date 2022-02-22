
package ec.edu.espe.controller;

/**
 *
 * @author Mateo Maldonado
 */
public class Calculator {
    public static float salesTotal(String base,float total) {
        float taxRate=7.88F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
        
        }
}
