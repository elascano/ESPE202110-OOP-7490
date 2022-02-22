
package ec.edu.espe.caffeinebeverage.view;

import ec.edu.espe.caffeinebeverage.model.AmericanoCoffee;
import ec.edu.espe.caffeinebeverage.model.Coffee;
import ec.edu.espe.caffeinebeverage.model.Tea;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        AmericanoCoffee americano= new AmericanoCoffee();
        
        System.out.println("->Template Method Pattern - Camila Teca <-");
        System.out.println("\nWELCOME TO BEVERAGE TEST");
        
        System.out.println("\n--> Making Tea <---");
        tea.prepareRecipe();
        
        System.out.println("\n--> Making Coffee <---");
        coffee.prepareRecipe();
        
        System.out.println("\n--> Making Americano Coffee <---");
        americano.prepareRecipe();
        
        System.out.println("\nThank you for your visit, Come back soon");
        
    }
    
}
