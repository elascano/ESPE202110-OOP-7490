package ec.edu.espe.ustax.view;

import ec.edu.espe.ustax.model.ArizonaTax;
/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("--> Singleton Pattern <--");
        ArizonaTax tax = ArizonaTax.getInstance();
        tax.salesTotal();
    }
}
