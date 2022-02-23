
package ec.edu.espe.controller;

import ec.edu.espe.model.KansasRate;

/**
 *
 * @author Jaime Eivar DEEL-ESPE
 */
public class Calculator {
    
    public static void main(String[] args) {
        
        KansasRate rate = KansasRate.getInstance();
        
        rate.getSalesTotal();
        
    }
    
}