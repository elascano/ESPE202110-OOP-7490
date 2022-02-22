package ec.edu.espe.newjerseytax.view;

import ec.edu.espe.newjerseytax.model.NewJerseyTax;

/**
 *
 * @author Joel Zeas, DEEL-ESPE
 */
public class TaxCalculator {
    
    public static void main(String[] args) {
        System.out.println("--> WS34 - Singleton Pattern <--");
        System.out.println("Author: Joel Zeas    -    Course: OPP-7490\n");
        NewJerseyTax tax = NewJerseyTax.getInstance();
        tax.salesTotal();
    }
}
