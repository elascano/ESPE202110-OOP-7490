package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;

/**
 *
 * @author SETayoRuiz
 */
public class FarmSystem {

    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();

        chicken = new Chicken(0, "Lucy", "White and Brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);

        System.out.println("chicken -->" + chicken);
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chickenCoop.add(chicken);
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chickenCoop.add(new Chicken(1, "Daisy", "white", 0, false));
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chicken = new Chicken(2, "Renata", "black", 0, true);
        chickenCoop.add(chicken);
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chickenCoop.remove(chicken);
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chicken = new Chicken(0, "Lucy", "White and brown", 0, true);
        chickenCoop.remove(chicken);
        System.out.println("chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

    }
}
