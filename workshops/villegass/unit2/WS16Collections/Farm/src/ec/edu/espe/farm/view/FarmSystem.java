
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Salma Villegas
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        chicken = new Chicken(0, "Lucy", "White and Brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken ->" + chicken);
        System.out.println("chicken coop -> + " + chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("chicken coop -> + " + chickenCoop);
    }
    
}
