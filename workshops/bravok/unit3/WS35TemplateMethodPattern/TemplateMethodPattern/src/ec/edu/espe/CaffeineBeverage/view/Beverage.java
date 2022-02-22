
package ec.edu.espe.CaffeineBeverage.view;

import ec.edu.espe.CaffeineBeverage.model.AmericanoCoffee;
import ec.edu.espe.CaffeineBeverage.model.Coffee;
import ec.edu.espe.CaffeineBeverage.model.Tea;

/**
 *
 * @author Katherin Bravo DEEL-ESPE
 */
public class Beverage{
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        AmericanoCoffee americano= new AmericanoCoffee();
        
        System.out.println("\nWELCOME TO BEVERAGE TEST");
        
        System.out.println(" Make Tea ");
        tea.prepareRecipe();
        
        System.out.println(" Make Coffee ");
        coffee.prepareRecipe();
        
        System.out.println(" Make Americano Coffee ");
        americano.prepareRecipe();
        
        System.out.println(" Thank you ");
        
    }
    
}
