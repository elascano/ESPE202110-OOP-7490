
package ec.edu.espe.caffeinebeverage.view;

import ec.edu.espe.caffeinebeverage.model.AmericanoCoffee;
import ec.edu.espe.caffeinebeverage.model.Coffee;
import ec.edu.espe.caffeinebeverage.model.Tea;

/**
 *
 * @author GUITARRA JHON, DEEE-ESPE
 */
public class Drink {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        AmericanoCoffee americano= new AmericanoCoffee();
        
        System.out.println("->Template Method Pattern - Guitarra Jhon <-");
        
        System.out.println("\n--> Making Tea <---");
        tea.prepareRecipe();
        
        System.out.println("\n--> Making Coffee <---");
        coffee.prepareRecipe();
        
        System.out.println("\n--> Making Americano Coffee <---");
        americano.prepareRecipe();
        
    }
    
}