
package ec.edu.espe.farm.model;

/**
 *
 * @author melig
 */
public class Chicken {
    int id;
    String name;
    String color;
    int age;
    boolean molting;
    private boolean Molting;

    public Chicken(int id, String name, String color, int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", Molting=" + Molting + '}';
    }
    

    
    public void doStuff(int forTime){ 
        cluck();
        wander();
        eat();
    }
    private void cluck(){     
        System.out.println("This chicken is clucking...");
    } 
    private void wander(){    
        System.out.println("This chicken is wandering...");
    }
    private void eat(){
        System.out.println("This chicken is eating...");
    }
    private void drink(){
        System.out.println("This chicken is drinking...");
    }
    private Poop poop(){
        return new Poop();
    }
    private Egg layAnEgg(){
        return new Egg();
    }    
    
    public Chicken() {
        id=0;
        name="ch";
        color="white";
        age=0;
        Molting=false;
    }
    
    public Chicken(int id, String name, String colour, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = colour;
        this.age = age;
        this.Molting = isMolting;
    }
      
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return color;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.color = colour;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return Molting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.Molting = isMolting;
    }
    }
