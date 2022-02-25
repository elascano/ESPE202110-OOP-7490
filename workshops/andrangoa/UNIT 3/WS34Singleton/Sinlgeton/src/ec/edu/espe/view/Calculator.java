
package ec.edu.espe.view;

import ec.edu.espe.model.USTax;

/**
 *
 * @author Alex Andrango
 */
public class Calculator {
    public static void main(String [] args){
        USTax tax = USTax.getInstance();
        tax.salesTotal(0);  
    }
    
}
