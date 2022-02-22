
package ec.edu.espe.view;

import ec.edu.espe.model.Coffee;
import ec.edu.espe.model.Tea;

/**
 *
 * @author  Maldonado Mateo
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        
        System.out.println("\n Making tea...");
        tea.prepareRecipient();
        
        System.out.println("\n Making coffee...");
        coffee.prepareRecipient();
        

        
    }
    
}
