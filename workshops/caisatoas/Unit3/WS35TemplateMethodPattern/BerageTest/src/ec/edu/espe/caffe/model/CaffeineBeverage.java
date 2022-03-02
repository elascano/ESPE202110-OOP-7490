
package ec.edu.espe.caffe.model;

/**
 *
 * @author Sebastian Caisatoa
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        
        boilWater();
        brew();
        pourlnCup();
        if(wantsCondiments()){
            addCondiments();
        }
        
    }
    void boilWater(){
        
        System.out.println("Boiling water");
        
    }
    abstract void brew();
    void pourlnCup(){
        
        System.out.print("Pouring into cup");
        
    }  
    abstract void addCondiments();
    
    boolean wantsCondiments(){
        return true;
    }
}
