
package ec.edu.espe.caffeineBeverage.model;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class BeverageTest {
    
    public static void main(String[] args) {
        
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Cappuccino cappuccino = new Cappuccino();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
        
        System.out.println("Making cappuccino...");
        cappuccino.prepareRecipe();
        
    }
    
}
