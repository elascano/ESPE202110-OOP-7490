
package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chiken;
/**
 *
 * @author USUARIO
 */
public class FarmSystem {
   public static void main(String[] args){
       System.out.println("WS10 Association --> Kerly Correa");
       
       Egg egg = new Egg(); //es un constructor
       Poop poop = new Poop();
       Chiken chiken =new Chiken();
       
       System.out.println("the egg");
       System.out.println("-->"+egg);
       
       System.out.println("the poop");
       System.out.println("-->"+poop);
       
       System.out.println("the chicken ");
       System.out.println("-->"+chiken);
       
       System.out.println("Chiken activities ");
       chiken.doStuff(0);
                  
   }
}
