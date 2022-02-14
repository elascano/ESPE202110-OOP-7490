/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author melig
 */
public class Chicken {
    private int id;
    private String name;
    private String colour;
    private int age;
    private boolean isMolting;

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
        colour="white";
        age=0;
        isMolting=false;
    }
    
    public Chicken(int id, String name, String colour, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.colour = colour;
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
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
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
