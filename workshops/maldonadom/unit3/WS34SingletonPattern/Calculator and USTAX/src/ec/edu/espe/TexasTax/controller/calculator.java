
package ec.edu.espe.TexasTax.controller;

import ec.edu.espe.TexasTax.model.TexasTax;

/**
 *
 * @author Mateo Maldonado
 */
public class calculator {
    public static void main(String[] args) {
        TexasTax tax = TexasTax.getInstance();
        tax.salesTotal();
        
    }
}
