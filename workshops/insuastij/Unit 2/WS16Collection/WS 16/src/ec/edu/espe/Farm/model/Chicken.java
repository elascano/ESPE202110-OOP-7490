package ec.edu.espe.farm.model;

import java.util.Scanner;



/**
 *
 * @author Jonathan Insuasti
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;


    @Override
    public String toString() {
        return "\nChicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }
    
    public Chicken() {
        System.out.println("\n--------> DATA CHICKEN <--------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---> id: ");
        id = scanner.nextInt();
        System.out.println("---> name:");
        name = scanner.next();
        System.out.println("---> color:");
        color = scanner.next();
        System.out.println("---> age:");
        age = scanner.nextInt();
        System.out.println("---> isMolting:");
        molting = scanner.nextBoolean();
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
     * @return the Color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.color = Color;
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
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }
    
    
    
}
