
package ec.edu.espe.controller;

import ec.edu.espe.model.ColombiaTax;

/**
 *
 * @author Richar Maisincho ESPE
 */
public class CalculatorTaxColombia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColombiaTax tax = ColombiaTax.getInstance();
        tax.salesTotal();
    }
    
}
