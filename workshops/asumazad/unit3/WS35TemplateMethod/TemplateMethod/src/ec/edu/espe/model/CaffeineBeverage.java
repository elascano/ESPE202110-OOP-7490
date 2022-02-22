<<<<<<< HEAD

package ec.edu.espe.model;

/**
 *
 * @author Dylan Asumaza
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
=======

package ec.edu.espe.model;

/**
 *
 * @author Dylan Asumaza
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
>>>>>>> ae7d89acb2e025d477c15b0b6c0f0f787722c643
