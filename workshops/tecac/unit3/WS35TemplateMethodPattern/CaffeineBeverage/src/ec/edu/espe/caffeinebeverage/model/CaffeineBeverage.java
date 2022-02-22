
package ec.edu.espe.caffeinebeverage.model;

/**
 *
 * @author Camila Teca, DEEE-ESPE
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
        System.out.println("1. Boiling water");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void pourInCup(){
        System.out.println("3. Pouring into cup");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
    
}
