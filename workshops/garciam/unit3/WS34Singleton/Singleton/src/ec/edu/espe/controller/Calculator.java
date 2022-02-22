
package ec.edu.espe.controller;

import ec.edu.espe.model.StateofCaliforniaTax;



/**
 *
 * @author Mayerly Garcia
 */
 class Calculator  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StateofCaliforniaTax tax = StateofCaliforniaTax.getInstance();
        tax.salesTotal();
    }
 }
  
        