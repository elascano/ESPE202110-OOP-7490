
package ec.edu.espe.oregonTax.controller;

import ec.edu.espe.oregonTax.model.OregonTax;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class Calculator {
    
    public static void main(String[] args) {
        OregonTax tax = OregonTax.getInstance();
        tax.salesTotal();
        
    }
    
}
