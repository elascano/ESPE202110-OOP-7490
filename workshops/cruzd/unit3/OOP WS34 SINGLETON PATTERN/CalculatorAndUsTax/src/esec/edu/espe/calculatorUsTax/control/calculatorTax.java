package esec.edu.espe.calculatorUsTax.control;

import esec.edu.espe.calculatorUsTax.model.NewYork;

/**
 *
 * @author darling.cruz
 */
public class calculatorTax {
        public static void main(String[] args) {
        NewYork tax = NewYork.getInstance();
        tax.salesTotal();
    }
}
