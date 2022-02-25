
package ec.edu.espe.ustax.controller;

/**
 *
<<<<<<< HEAD
 * @author Paul Saltos , DEEL-ESPE
=======
 * @author Paul Saltos , DEEE-ESPE
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
 */
public class Calculator {
    public static float salesTotal(String base,float total) {
        float taxRate=8.00F;
        total = Float.parseFloat(base)+Float.parseFloat(base)*taxRate/100; 
        return total;
    }
}
