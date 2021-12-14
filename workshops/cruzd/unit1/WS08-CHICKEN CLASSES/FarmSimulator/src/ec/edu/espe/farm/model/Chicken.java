
package ec.edu.espe.farm.model;

/**
 *
 * @author darling.cruz
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    public void doSuff(int forTime){
        cluck();
        wander();
        eat();
    }
    public void cluck(){
        System.out.println(" This Chicken is clucklnkg");
    }
    public void wander(){
        System.out.println(" This Chicken is wandering");
    }
    public void eat(){
        System.out.println(" This Chicken is eating");
    }
    public void drink(){
        System.out.println(" This Chicken is drinking");
    }
    public Poop poop(){
        return new Poop();
    }
    public Egg LayAnEgg(){
        return new Egg();  
    }

         
    public Chicken() {
        id = 0;
        name ="ch";
        color = "white";
        age = 0;
        isMolting = false;
    }
    
    public Chicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the inMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}