
package ec.edu.espe.ustax.controller;

import ec.edu.espe.ustax.model.FloridaTax;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        FloridaTax tax = FloridaTax.getInstance();
        tax.salesTotal();

    }
    
}
