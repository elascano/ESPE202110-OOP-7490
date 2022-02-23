
package ec.edu.espe.coffee.model;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public abstract class CaffeineBeverage {
    public void prepareRecipient(){
    boilWater();
    brew();
    pourInCup();
        if(wantsCondiments()){addCondiments();}
    }

    private void boilWater() {
        System.out.println("1. Boiling water");
    }

    abstract void brew();     
   

    private void pourInCup() {
        System.out.println("3. Pouring into cup");
    }

    abstract void addCondiments();

    boolean wantsCondiments(){
        return true;
    };
}

