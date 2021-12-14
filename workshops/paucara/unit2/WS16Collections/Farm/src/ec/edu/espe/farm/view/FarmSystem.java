package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class FarmSystem {

    public static void main(String[] args) {

        int a;
        Integer i = 58;
        float b;
        Float f = 3.9F;
        double c;
        Double d = 12.40;
        String s = "Javier Paucar";

        System.out.println("WS16 COLLECTIONS ---> JAVIER PAUCAR <---");
        System.out.println("the int of the float -->" + f.intValue());
        b = 7.9F;

        System.out.println("float b -->" + b);
        System.out.println("float b -->" + (int) b);

        a = 10;
        System.out.println("int a -->" + a);
        System.out.println("int a -->" + (float) a);
        System.out.println("int a -->" + a);

        System.out.println("String s + Integer i -->" + (s + i.toString()));

        System.out.println("int a + Integer i -->" + (a + i.toString()));
        System.out.println("int a + Integer i -->" + (a + i.intValue()));

        System.out.println("---------------------------------------------");

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();

        System.out.println("WS016 COLLECTIONS -->JAVIER PAUCAR <--");

        chicken = new Chicken(0, "Lucy", "White and Brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);

        System.out.println("chicken -->" + chicken);
        System.out.println("chickens in the Chicken Coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chickenCoop.add(new Chicken(1, "Daysi", "white", 0, false));
        System.out.println("Chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

        chicken = new Chicken(2, "Renata", "black", 0, false);
        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);

    }

}
