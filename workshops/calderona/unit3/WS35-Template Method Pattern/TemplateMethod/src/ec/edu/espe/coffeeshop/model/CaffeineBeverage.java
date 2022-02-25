
package ec.edu.espe.coffeeshop.model;

/**
 *
 * @author Andy Calderon 
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("- Boiling water");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void pourInCup(){
        System.out.println("- Pouring into cup");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
    
}
