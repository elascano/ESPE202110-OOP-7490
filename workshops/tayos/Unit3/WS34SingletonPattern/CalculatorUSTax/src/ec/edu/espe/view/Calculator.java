package ec.edu.espe.view;

import ec.edu.espe.model.TexasTax;

/**
 *
 * @author --> Tayo Sebastian
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("author Sebastian Tayo");
        TexasTax tax = TexasTax.getInstance();
        tax.salesTotal();

    }

}
