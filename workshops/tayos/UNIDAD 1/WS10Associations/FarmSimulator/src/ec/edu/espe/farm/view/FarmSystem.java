package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chicken;

/**
 *
 * @author SETayoRuiz
 */
public class FarmSystem {

    public static void main(String[] args) {
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        System.out.println("Author Sebastian Tayo");
        System.out.println("the egg");
        System.out.println("---->" + egg);

        System.out.println("the poop");
        System.out.println("---->" + poop);

        System.out.println("the chicken");
        System.out.println("---->" + chicken);

        System.out.println("Chicken activities");
        Chicken.doStuff(0);

    }

}
