package ec.edu.espe.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Egg;
import ec.espe.edu.farm.model.Poop;

/**
 *
 * @author Alan
 */
public class Farm {
   public static void main(String[] args){
       Egg egg = new Egg();
       Poop poop =new Poop();
       Chicken chicken = new Chicken();
       int id=1;
       String name ="Lucy";
       String color="White and brown";
       int age= 2;
       boolean isMolting = false;

       System.out.println("WS11 Association Alan Shuguli");
       System.out.println("Egg-->+"+egg);
        System.out.println("Poop-->+"+poop);
        System.out.println("Chicken-->+"+chicken);
        
       Chicken chicken2 = new Chicken(id,name,color ,age ,isMolting);
       System.out.println("chicken 2 -->" + chicken2);
       
       id = 2;
       name="maruja";
       color ="black";
       age =1;
       isMolting=true;
       chicken2 = new Chicken (id,name,color ,age ,isMolting);
       System.out.println("chicken 2 -->" + chicken2);
       
       System.out.println("Please enter the id of the chicken-->");
   }
   
}