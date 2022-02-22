
package ec.edu.espe.oregonTaxe.controller;

import ec.edu.espe.oregonTaxe.model.OregonTaxe;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class Calculator {
    
    public static void main(String[] args) {
        
        OregonTaxe tax = OregonTaxe.getInstance();
        
        tax.getSalesTotal();
        
    }
    
}
