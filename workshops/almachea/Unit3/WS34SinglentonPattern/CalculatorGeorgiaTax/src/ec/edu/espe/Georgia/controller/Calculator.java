
package ec.edu.espe.Georgia.controller;

import ec.edu.espe.Georgia.model.GeorgiaTax;

/**
 *
 * @author Anderson
 */
public class Calculator {
    public static void main(String[] args) {
        GeorgiaTax tax = GeorgiaTax.getInstance();
        tax.salesTotal();
        
    }
    
}

