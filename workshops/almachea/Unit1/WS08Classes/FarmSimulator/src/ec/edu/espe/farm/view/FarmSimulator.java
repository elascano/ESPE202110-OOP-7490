/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;


/**
 *
 * @author ASUS
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("WS10 Associations --> Anderson Almache <--");
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        
        System.out.println("The egg");
        System.out.println("-->" + egg);
        
        System.out.println("The poop");
        System.out.println("-->" + poop);
        
        System.out.println("The chicken");
        System.out.println("-->" + chicken);
        
        System.out.println("Chicken activities");
        chicken.doStuff(0);
    }
    
}
