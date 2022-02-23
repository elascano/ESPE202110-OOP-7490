
package ec.edu.espe.caffeineBeverage.model;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public abstract class CaffeineBeverage {
    
    abstract void brew();
    abstract void addCondiments();
    
    public final void prepareRecipe(){
        boilWater();
        brew(); 
        pourlnCup();
        
        if (wantsCondiments()){
            addCondiments();
        }  
    }
    
    void boilWater(){
        System.out.println("Boiling water");
        brew();
    }
    
    void pourlnCup(){
        System.out.println("Pouring into cup");
        addCondiments();
    }
        
    boolean wantsCondiments(){
           return true;
        }
 
}
