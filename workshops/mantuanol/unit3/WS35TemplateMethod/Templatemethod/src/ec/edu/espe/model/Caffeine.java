package ec.edu.espe.model;


/**
 *
 * @author Leonel.M
 */
public abstract class Caffeine {
    
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("Water at warm temperature");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public void pourInCup(){
        System.out.println("- Pour into the vessel");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
}
