/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.ChickenCoop;
import java.util.ArrayList;

/**
 *
 * @author Angel Guaman
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        chicken = new Chicken(0, "Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken---->" + chicken);
        System.out.println("Chickens in the Chicken Coop --->" + chickenCoop.countChickens());
        
        System.out.println("chicken --->" +chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the Chicken Coop --->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        chickenCoop.add(new Chicken(1, "Deysi", "blue", 0, true));
        System.out.println("Chickens in the Chicken Coop --->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        
        chickenCoop.add(new Chicken(3, "Mary", "black", 0, true));
        System.out.println("Chickens in the Chicken Coop --->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
    }
    
    
}
