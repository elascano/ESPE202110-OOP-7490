
package ec.edu.espe.template.model;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public abstract class CaffeineBeverage {

    void prepareRecipe() {        //this is the template method
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    ;
    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    ;
    abstract void addCondiments();

    boolean wantsCondiments() {   // a hook operation 
        return true;
    } 

}
