package ec.edu.espe.newjerseytax.view;

import ec.edu.espe.oklahomatax.model.OklahomaTax;



/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class TaxCalculator {
    
    public static void main(String[] args) {
        System.out.println("--> WS34 - Singleton Pattern <--");
       
        OklahomaTax tax = OklahomaTax.getInstance();
        tax.salesTotal();
    }
}
