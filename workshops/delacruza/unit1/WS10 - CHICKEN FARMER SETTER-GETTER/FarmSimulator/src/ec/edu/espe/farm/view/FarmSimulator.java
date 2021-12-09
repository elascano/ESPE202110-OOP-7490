
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author Alejandro Delacruz
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("WS10 Associations ---> Alejandro Delacruz <---");
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        
        System.out.println("The Egg..");
        System.out.println(" --->" + egg);
        System.out.println(" The Poop..");
        System.out.println("--->" + poop);
        System.out.println("The Chicken..");
        System.out.println("--->" + chicken);
        
        System.out.println("Chicken activities");
        chicken.doStuff();
    }
}
