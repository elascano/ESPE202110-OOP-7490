/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;


import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author Daniel Lincango
 */
public class FarmSystem {
    public static void main(String[] args) {
    Egg egg= new Egg();
    Poop poop = new Poop();
    Chicken chicken = new Chicken();  
    
        System.out.println("the egg");
        System.out.println("-->"+ egg);
        
        System.out.println("the popp");
        System.out.println("-->"+poop);
        
        System.out.println("the chiken");
        System.out.println("-->"+chicken);
        
        System.out.println("Chicken activities");
        System.out.println("this chicken is clucking....");
        System.out.println("this chicken is wandering....");
        System.out.println("this chicken is eating....");
    
    
    }
   
    
  
    
    
}
