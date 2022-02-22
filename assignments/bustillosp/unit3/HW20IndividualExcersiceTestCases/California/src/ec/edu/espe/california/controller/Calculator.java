
package ec.edu.espe.california.controller;

import ec.edu.espe.california.model.CaliforniaTax;


public class Calculator {
    
    public static void main(String[] args) {
        CaliforniaTax tax = CaliforniaTax.getInstance();
        tax.salesTotal();
        
    }
    
}
