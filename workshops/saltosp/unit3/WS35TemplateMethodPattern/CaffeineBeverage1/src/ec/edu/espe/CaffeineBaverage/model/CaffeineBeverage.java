/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.CaffeineBaverage.model;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
 */
public abstract class CaffeineBeverage {
    
    
    void prepareRecipe() { // template method
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondimentes();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    boolean wantsCondiments() {
        return true;
    } // a hook operation

    private void addCondimentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

