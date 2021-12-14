/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author Kathy
 */
public class FarmAssociations {
    public static void main(String[] args) {
        System.out.println("WS11 Associations --> Katherin Bravo <--");
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id =1;
        String name = "Lucy";
        String color = "white and brown";
        int age = 2;
        boolean isMolting = false;
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
        
       Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);
       
       id=2;
       name= "Maruja";
       color= "black";
       age=1;
       isMolting= true;
       chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);
       
       System.out.println("Please enter data for chicken");
       
       
                 
    }
   
}
