
package ec.edu.espe.view;

import ec.edu.espe.model.USTax;

/**
 *
 * @author Alexander Ruano, DEEL-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Alexander Ruano");
        USTax tax = USTax.getInstance();
        System.out.println("Iva in Texas of 15.00= "+tax.salesTotal());

    }

}
