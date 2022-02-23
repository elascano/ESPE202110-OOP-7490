package esec.edu.espe.calculatorUsTax.control;

import esec.edu.espe.calculatorUsTax.model.OregonTax;

/**
 *
 * @author GUITARRA JHON, ESPE
 */
public class calculatorTax {
        public static void main(String[] args) {
        OregonTax tax = OregonTax.getInstance();
        tax.salesTotal();
    }
}
