
package ec.espe.edu.CalculadorTax;

import ec.espe.edu.EcuadorTax.OrangeTax;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         OrangeTax tax = OrangeTax.getInstance();
         tax.salesTotal();
    }
    
}
