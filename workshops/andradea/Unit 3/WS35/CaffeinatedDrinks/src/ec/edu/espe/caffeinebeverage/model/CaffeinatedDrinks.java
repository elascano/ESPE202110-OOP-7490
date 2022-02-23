
package ec.edu.espe.caffeinebeverage.model;

/**
 *
 * @author Alan Andrade
 */
public abstract class CaffeinatedDrinks {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("1. Hot water");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void pourInCup(){
        System.out.println("3. Put in the  cup");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
    
}
