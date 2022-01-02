/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author José
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        
        chicken = new Chicken(0, "Lucy", "White and Broen", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken-->" + chicken);
        System.out.println("chicken coop ->" + chickenCoop);
        
        
       
    }
}
