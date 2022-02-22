
package ec.edu.espe.newyork.controller;

import ec.edu.espe.newyork.model.NewYorkTax;

/**
 *
 * @author Andy Calderon 
 */
public class Calculator {
    
    public static void main(String[] args) {
        NewYorkTax tax = NewYorkTax.getInstance();
        tax.salesTotal();
        
    }
    
}
