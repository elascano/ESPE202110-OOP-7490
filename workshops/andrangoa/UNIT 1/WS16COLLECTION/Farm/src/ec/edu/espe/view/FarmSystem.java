package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author alex_
 */
public class FarmSystem {
    public static void main(String[] args) {
       Chicken chicken;
       ChickenCoop chickenCoop;
       ArrayList<Chicken> chickens = new ArrayList<>();
       
       chicken = new Chicken(0, "Lucy", "White and brown", 0, true);
       chickenCoop = new ChickenCoop(0,chickens);
       
        System.out.println("chicken ->" + chicken);
        System.out.println("chicken coop ->" + chickenCoop );
       
       chickenCoop.add(chicken);
       System.out.println("chicken coop ->" + chickenCoop);
       
       chickenCoop.countChickens();
       System.out.println("chickens in the chicken coop-> "+ chickenCoop.countChickens());
       System.out.println("chicken coop ->" + chickenCoop);
       
       chickenCoop.add(new Chicken(1, "Daysi", "White", 0, true));
       System.out.println("chickens in the chicken coop-> "+ chickenCoop.countChickens());
       System.out.println("chicken coop ->" + chickenCoop);
       
       chicken = new Chicken(2, "Lala", "Yellow", 0, true);
       chickenCoop.add(chicken);
       System.out.println("chickens in the chicken coop-> "+ chickenCoop.countChickens());
       System.out.println("chicken coop ->" + chickenCoop);
       
       chickenCoop.remove(chicken);
        System.out.println("Chickens in the Chicken coop -> " + chickenCoop.countChickens());
        System.out.println("chicken coop -> " + chickenCoop);
       
        
       
       
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      /* int a;
       Integer i=58;
       float b;
       Float f=3.9F;
       double c;
       Double d=12.4D;
       String s= "Alex";
       
        System.out.println("the int of the float -->" + f. intValue());
        b=7.9F;
       
        System.out.println("float b --> " + b);
        System.out.println("float b --> " + (int)b);
        
        a=10;
        System.out.println("int a -> " + a);
        System.out.println("int a -> " +(float)a);
        System.out.println("int a -> " + a);
        
        System.out.println("String s + Integer i ->" + (s + i.toString()));
        
        System.out.println("int a + Integer i ->" + (a + i.toString()));
        System.out.println("int a + Integer i ->" + (a + i.intValue()));*/
    }
    
    
    
}
