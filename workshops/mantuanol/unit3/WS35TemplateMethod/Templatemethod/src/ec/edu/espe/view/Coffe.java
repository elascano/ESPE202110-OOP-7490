
package ec.edu.espe.view;

import ec.edu.espe.model.ExpressoCoffe;
import ec.edu.espe.model.Tea;
import ec.edu.espe.model.Coffe;
        


/**
 *
 * @author Leonel.M
 */
public class Coffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        ExpressoCoffe expresso= new ExpressoCoffe();
        
        System.out.println("     Welcome to maid coffe   ");
        
        System.out.println("\n--> Making tea <---");
        tea.prepareRecipe();
        
        System.out.println("\n--> Making coffe <---");
        coffe.prepareRecipe();
        
        System.out.println("\n--> Making expresso <---");
        expresso.prepareRecipe();
        
        System.out.println("\n We thank you for your presence, until another time.");
        
    }
    
}
