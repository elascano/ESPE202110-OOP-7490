package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.Egg;
import ec.edu.espe.Farm.model.Poop;

/**
 *
 * @author Paul Saltos
 */
public class FarmSystem {
    public static void main(String[] args) {
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken ();
        
        System.out.println("The egg");
        System.out.println("-->" + egg);
        System.out.println("The poop");
        System.out.println("-->"+ poop);
        System.out.println("The chicken");
        System.out.println("-->"+ chicken);
        System.out.println("chicken activities");
        chicken.doStuff(0);
    }
  
}
