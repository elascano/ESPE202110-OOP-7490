
package ec.edu.espe.view;

import ec.edu.espe.model.Coffee;
import ec.edu.espe.model.Tea;

/**
 *
 * @author Mayerly Garcia
 */
public abstract class BeverageTest {

    /**
     * @param args the command line arguments
     */
    public  static void main(String[] args) {
        
        Tea tea = new Tea() {};
        Coffee coffee = new Coffee() {};
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffe...");
        coffee.prepareRecipe();
        
    }
    
}
