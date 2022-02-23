/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author KERLY CORREA
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
         boilWater();
         pourInCup();
         brew();
        
         if (wantsCondiments()) {
            addCondiment();
        } 
         
    }
    public void boilWater(){
        System.out.println("Boiling water ");
    }
    
    abstract void brew();
    
    abstract void addCondiment();
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    boolean wantsCondiments(){
        return true;
    }

}
