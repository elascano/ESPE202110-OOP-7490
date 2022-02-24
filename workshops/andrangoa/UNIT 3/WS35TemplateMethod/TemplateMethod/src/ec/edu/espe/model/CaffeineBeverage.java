
package ec.edu.espe.model;

/**
 *
 * @author Alex Andrango
 */
public abstract class CaffeineBeverage {
    public void prepareRecipient(){
    boilWater();
    brew();
    pourInCup();
        if(wantsCondiments()){addCondiments();}
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();     
   

    private void pourInCup() {
        System.out.println("Pouring inro cup");
    }

    abstract void addCondiments();

    boolean wantsCondiments(){
        return true;
    };

 
}
