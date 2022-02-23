
package ec.edu.espe.view;

import ec.edu.espe.model.Coffee;
import ec.edu.espe.model.Mate;
import ec.edu.espe.model.Tea;

/**
 *
 * @author Alex Andrango
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Mate mate = new Mate();
        
        System.out.println("\n Making tea...");
        tea.prepareRecipient();
        
        System.out.println("\n Making coffee...");
        coffee.prepareRecipient();
        
        System.out.println("\n Making mate...");
        mate.prepareRecipient();
        
    }
    
}
