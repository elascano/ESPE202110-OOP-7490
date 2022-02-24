
package ec.edu.espe.coffee.view;

import ec.edu.espe.coffee.model.Coffee;
import ec.edu.espe.coffee.model.Tea;

/**
 *
 * @author  Anthony Morales, DEEL-ESPE
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\n --> Making tea <--\n");
        tea.prepareRecipient();
        
        System.out.println("\n --> Making coffee <--\n");
        coffee.prepareRecipient();
    }
}
