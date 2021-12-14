package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
/**
 *
 * @author KerlyCorrea
 */
public class FarmSystem {
    public static void main(String[] args){
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        chicken=new Chicken(0,"Lucy","White and brown",0,true);
        chickenCoop=new ChickenCoop(0, chickens);
        
        System.out.println("chicken->" +chicken);
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
        
        chickenCoop.add(new Chicken(1,"Daysi","White",0,false));
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
        
        chicken = new Chicken(2,"Renata","Black", 0, false);
        chickenCoop.add(chicken);
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
        
        chickenCoop.remove(chicken);
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
        
        chicken=new Chicken(0,"Lucy","White and brown",0,true);
        chickenCoop.remove(chicken);
        System.out.println("Chickens int the Chicken coop ->"+chickenCoop.countChickens());
        System.out.println("chicken coop->" + chickenCoop);
    }
   
}
