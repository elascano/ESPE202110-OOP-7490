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
 * @author mateo
 */
public class FarmSystem {
    public static void main(String[] args) {
        System.out.println("WS10 Associoations ---> Mateo Landazuri");
        Egg egg= new Egg();
        Poop poop= new Poop();
        Chicken chicken = new Chicken();
        
        System.out.println("The egg");
        System.out.println("--->" + egg);
        
        System.out.println("The poop");
        System.out.println("--->" + poop);
        
        System.out.println("The chicken");
        System.out.println("--->" + chicken);
        
        System.out.println("Chicken activities");
        chicken.doStuff(0);
    }
}
