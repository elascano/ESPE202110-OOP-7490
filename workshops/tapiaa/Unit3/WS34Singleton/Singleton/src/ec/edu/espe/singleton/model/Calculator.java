package ec.edu.espe.singleton.model;
/**
 *
 * @author Andrea Tapia
 */
public class Calculator {

    public static void main(String args[]) {
        UsTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
