/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chicken;
/**
 *
 * @author WINDOWS 10
 */
public class FarmSystem {
    public static void main(String[] args){
        System.out.println("WS10 Associations ->Jose Guzman<-");
        Egg egg=new Egg();
        Poop poop=new Poop();
        Chicken chicken= new Chicken();
        
        System.out.println("the egg");
        System.out.println("->" + egg);
        
        System.out.println("the poop");
        System.out.println("->" + poop); 
        
        System.out.println("the Chicken");
        System.out.println("->" + chicken);
        
        System.out.println("Chicken activities");
        chicken.doStuff(0);
    }
}
