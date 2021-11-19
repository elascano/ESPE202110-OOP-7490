
package ec.edu.espe.farm.model;

/**
 *
 * @author Kathy
 */
public class Chicken {
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    public void doSuff(){
    
    }
    public void cluck(){
    
    }
    public void wander(){
    
    }
    public void eat(){
    
    }
    public void drink(){
    
    }
    public Poop poop(){
        return new Poop();
    }
    public Egg LayAnEgg(){
        return new Egg();  
    }
    
}
