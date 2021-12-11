
package eceduespe.Farm.view;

import eceduespe.Farm.model.Egg;
import eceduespe.Farm.model.Poop;
import eceduespe.Farm.model.Chicken;

/**
 *
 * @author Simbaña J
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println ("WS10 Associations --->Gustavo Simbaña <---");
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        
        System.out.println("the egg");
        System.out.println("-->" + egg); 
        
        System.out.println("the poop");
        System.out.println("-->" + poop);
        
        System.out.println("the chicken");
        System.out.println("-->" + chicken);
    }
    
}
