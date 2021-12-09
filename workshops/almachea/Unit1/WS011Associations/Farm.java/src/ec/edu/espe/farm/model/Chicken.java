
package ec.edu.espe.farm.model;

/**
 *
 * @author ASUS
 */
public class Chicken {
    private int id; 
    private String name;
    private String color;
    private int age;
    private boolean isMolting; 

    

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }
    
    
    
    public void doStuff(int forTime){
        cluck();
        wander();
        eat();
    }
    private void cluck() {
        System.out.println("This Chicken is Clucking");
    }
    private void wander(){
        System.out.println("Thhis Chicken is wandering...");
    }
    private void eat(){
        System.out.println("This Chicken is eating...");
    }
    private void drink(){
        System.out.println("This chicken is drinking");
    }
    private Poop poop(){
        
        return new Poop();
        
    }
    
    private Egg layAnEgg(){
        
        return new Egg(1);
        
    }   
    
    public Chicken() {
        id=0;
        name="ch";
        color="white";
        age=0;
        isMolting=false;
    }

     public Chicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
    
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}
