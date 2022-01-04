
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author Ajshuguli
 */
public class FarmSystem {
    public static void main(String[] args) {
        System.out.print("WS10 Associations --> Alan Shuguli <--");
        Egg egg=new Egg();
        Poop poop=new Poop();
        Chicken chicken=new Chicken();
        
        System.out.println("The egg");
        System.out.println("-->" + egg);
        
        System.out.println("The poop");
        System.out.println("-->" + poop);
        
        System.out.println("The chicken");
        System.out.println("-->" + chicken);
        
        System.out.println("chicken activities");
        chicken.doStuff(0);
        
         
    }
}
