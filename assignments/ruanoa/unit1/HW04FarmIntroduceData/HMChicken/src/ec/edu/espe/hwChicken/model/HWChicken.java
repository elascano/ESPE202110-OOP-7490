
package ec.edu.espe.hwChicken.model;

import java.util.Scanner;

/**
 *
 * @author Alexander Ruano
 */
public class HWChicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }
    
    

    public void doStuff(int forTime) {
        cluck();
        wander();
        eat();

    }

    private void cluck() {
        System.out.println("This chicken is clucking .....");

    }

    private void wander() {
        System.out.println("This chicken is wandering .....");

    }

    private void eat() {
        System.out.println("This chicken is eating .....");

    }

    private void drink() {
        System.out.println("This chicken is drinking .....");

    }

    private HWPoop poop() {
        return new HWPoop();

    }

    private HWEgg layAnEgg() {
        return new HWEgg();

    }

    public HWChicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }

    public HWChicken() {
        
        System.out.println("\n---------------> DATA CHICKEN1 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- id  --> ");
        id = scanner.nextInt();
        System.out.println("- name --> ");
        name = scanner.next();
        System.out.println("enter molting status");
        isMolting = scanner.nextBoolean();
        System.out.println("- color --> ");
        color = scanner.next();
        System.out.println("- age --> ");
        age = scanner.nextInt();
        
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

   