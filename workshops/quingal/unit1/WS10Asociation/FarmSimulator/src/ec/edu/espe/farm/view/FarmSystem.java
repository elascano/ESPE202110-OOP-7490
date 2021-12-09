/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chicken;



/**
 *
 * @author Leandro Quinga
 */
public class FarmSystem {
    public static void main(String[] args) {
        System.out.println("WS10 Associations -->Leandro Quinga<--");
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        
        int id=1;
        String name="Lucy";
        String color="white and brown";
        int age=3;
        boolean isMolting=false;
        
        System.out.println("The egg");
        System.out.println("-->"+egg);
        
        System.out.println("The poop");
        System.out.println("-->"+poop);
        
        System.out.println("The chicken");
        System.out.println("-->"+chicken);
        
        Chicken chicken2=new Chicken(id, name, color, age, isMolting);
        System.out.println("Chicken2-->"+chicken2);
        
        id=2;
        name="Juana";
        color="black and red ";
        age=3;
        isMolting=true;
        chicken2=new Chicken(id,name,color,age,isMolting);
        
        System.out.println("Chicken activities");        
        chicken.doStuff();
    }
    
}
