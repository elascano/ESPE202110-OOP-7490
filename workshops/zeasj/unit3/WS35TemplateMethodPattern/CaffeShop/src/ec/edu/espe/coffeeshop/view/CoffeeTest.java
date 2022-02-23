package ec.edu.espe.coffeeshop.view;

import ec.edu.espe.coffeeshop.model.AmericanoCoffee;
import ec.edu.espe.coffeeshop.model.Coffee;
import ec.edu.espe.coffeeshop.model.Tea;

/**
 *
 * @author Joel Zeas, DEEL-ESPE
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        AmericanoCoffee americano= new AmericanoCoffee();
        
        System.out.println("-->    WS35 - Template Method Pattern    <--");
        System.out.println("Author: Joel Zeas    -    Course: OPP-7490\n");
        System.out.println("     Welcome to Coffee Shop Test   ");
        
        System.out.println("\n--> Making tea <---");
        tea.prepareRecipe();
        
        System.out.println("\n--> Making coffee <---");
        coffee.prepareRecipe();
        
        System.out.println("\n--> Making cappuccino <---");
        americano.prepareRecipe();
        
        System.out.println("\n Thank you for preferring us, come back soon");
        
    }
    
}
