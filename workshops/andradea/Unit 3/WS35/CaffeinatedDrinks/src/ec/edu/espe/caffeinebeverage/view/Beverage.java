
package ec.edu.espe.caffeinebeverage.view;

import ec.edu.espe.caffeinebeverage.model.AmericanoCoffee;
import ec.edu.espe.caffeinebeverage.model.Coffee;
import ec.edu.espe.caffeinebeverage.model.Tea;

/** 
 *
 * @author Alan Andrade
 */
public class Beverage {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        AmericanoCoffee americano= new AmericanoCoffee();
        
        System.out.println(" Method Pattern ---> Alan Andrade");
        
        System.out.println("\n--> Make Drink "); 
        tea.prepareRecipe();
        
        System.out.println("\n--> Make Coffee Drin  <---");
        coffee.prepareRecipe();
        
        System.out.println("\n--> Make  Americano Coffee Drink <---");
        americano.prepareRecipe();
        
    }
    
}