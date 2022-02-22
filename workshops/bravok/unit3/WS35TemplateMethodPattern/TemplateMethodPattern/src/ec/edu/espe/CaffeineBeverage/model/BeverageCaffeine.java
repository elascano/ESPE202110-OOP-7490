
package ec.edu.espe.CaffeineBeverage.model;

/**
 *
 * @author Katherin Bravo DEEL-ESPE
 */
public abstract class BeverageCaffeine{
    public void prepareRecipe(){
        boilCream ();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilCream(){
        System.out.println(" Thick cream");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void pourInCup(){
        System.out.println(" Put in glass");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
    
}
