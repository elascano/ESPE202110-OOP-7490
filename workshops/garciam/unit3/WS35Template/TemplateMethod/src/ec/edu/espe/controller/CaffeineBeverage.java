package ec.edu.espe.controller;

/**
 *
 * @author Mayerly Garcia
 */
public abstract class CaffeineBeverage {

   abstract void addCondiments();
   abstract void brew();
   
   public final void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (wantsCondiments()) {
            addCondiments();
        }

    }

    void boilWater() {
        System.out.println("Boilin water");
    }

    

    void pourlnCup() {
        System.out.println("Pouring into cup");
    }

    

    boolean wantsCondiments() {
        return true;
    }
}
