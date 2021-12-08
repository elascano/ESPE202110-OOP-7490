
package ec.edu.espe.farm.model;

/**
 *
 * @author elascano
 */
public class Chicken {
    private String name; 
    private String color;
    private int age;
    private boolean isMolting;
    
    boolean is_running; 
    boolean isrunning;
    boolean ISRUNNING;
    boolean Isrunning;

    int numberOfWheels; // -> Java          lower cammel case
    int NumberOfWheels;  // -> Class        upper cammel case
    int numberofwheels;   // -> packages    lower caswe
    int number_of_wheels; // -> C           snake case
    int NUMBEROFWHEELS;   // constant       upper case
    int NUMBER_OF_WHEELS; // constant       upper snake case
    
    int salary;
    
    int a; // small case letter
    int A; // capital letter
    
// case sensitive    
    
//lower case upper case
// small letter , capital letter
//snake_case cammelCase     
    public void doStuff(){
        
    }
    
    private void cluck(){
        
    }
    
    private void wander(){
        
    }
    
    private void eat(){
        
    }
    
    private void drink(){
        
    }
    
    private Poop poop(){
        
        return new Poop();
        
    }
    
    private Egg layAnEgg(){
        
        return new Egg();
    }
    

}
