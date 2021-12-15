//removing previous lines
package ec.edu.espe.farm.model;

/**
 *
<<<<<<< HEAD
 * @author Christian Bravo
 */
public class Chicken {

    private int id;
=======
 * @author Bravo Cristian // author name is not OK
 */
public class Chicken {

>>>>>>> a3f3e222ddea96ae9091c947c91578ea1ba5c540
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
<<<<<<< HEAD
    
    public void doStuff() {
        cluck();
        wander();
        eat();
    }

    private void cluck() {
        System.out.println("This chicken is clucking");
=======

    public void doStuff() {

    }

    private void cluck() {
>>>>>>> a3f3e222ddea96ae9091c947c91578ea1ba5c540

    }

    private void wander() {
<<<<<<< HEAD
        System.out.println("This chicken is wandering...");
=======
>>>>>>> a3f3e222ddea96ae9091c947c91578ea1ba5c540

    }

    private void eat() {
<<<<<<< HEAD
        System.out.println("This chicken is eating...");

    }

    private void drink() {
        System.out.println("This chicken is drinking");

    }

    private Poop poop() {

        return new Poop();

    }

    private Egg layAnEgg() {

        return new Egg();

    } 

    public Chicken() {
        id= 0;
        name = "ch";
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
     * @return the isMolting
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
=======

    }

    private void drink() {

    }

    private Poop poop() {

        return new Poop();

    }

    private Egg layAnEgg() {

        return new Egg();

    }
} 
//} one extra curly brace
>>>>>>> a3f3e222ddea96ae9091c947c91578ea1ba5c540
