/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
/**
 *
 * @author elascano
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Chicken chicken; //declaration
        chicken = new Chicken(); //instantiation
        
        System.out.println("chicken --> " + chicken);
        chicken.doStuff();
        
        Chicken chicken1 = new Chicken(); //declaration and instantiation
        Chicken chicken2;
        Chicken chickens[] = new Chicken[10];
    }
}
