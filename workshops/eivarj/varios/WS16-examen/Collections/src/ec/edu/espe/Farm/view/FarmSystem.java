
package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author JaimeEivar
 */
public class FarmSystem {
    
    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        chicken = new Chicken (0,"lucy","White and Brown",0,true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken--> "+chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chickenCoop.add(new Chicken(1,"Daysi","White",0,false));
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chicken = new Chicken (2,"Renata","black",0,false);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken--> "+chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
        chicken = new Chicken (0,"lucy","White and Brown",0,true);
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the ChickenCoop-->"+chickenCoop.countChickens());
        System.out.println("chickenCoop-->"+chickenCoop);
        
    }
    
    
}
