package ec.edu.espe.farm.model;

/**
 *
 * @author MateoMaldonado
 */
public class Chicken {
    
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    int is_running;
    int inrunning; //lower case
    int ISRUNNING; //capital case
    int Isrunning; //
    
    int numberOfWheels; //java          lower camel case
    int NumberOFWheels; //class         upper camel case
    int numberofwheels;    //packages   lower case
    int number_of_wheels;   //C or phyton       snake case
    int NUMBEROFWHEELS; // constant   upper case
    int NUMBER_OF_WHEELS; //constant   upper snake case
    
    int a; // small case letter
    int A; // capital letter
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
