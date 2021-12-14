<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> 4831ce890352d3db89b46ad54ac599ceaa0e4319
package ec.edu.espe.farm.model;

/**
 *
 * @author dylanasumaza
 */
public class Chicken {
<<<<<<< HEAD

    private String name;
    private String color;
    private int age;
    private boolean asMolting;

    public void doStuff(){
    
    }
    private void cluck() {

    }
    private void wander(){
        
    }
    private void eat(){
        
    }
    private void drink(){
        
=======
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
   
    
    public void doStuff(int forTime){
        cluck();
        wander();
        eat();
    }
    private void cluck() {
        System.out.println("This chicken is clucking");
    }
    private void wander(){
        System.out.println("This chicken is wandering");
    }
    private void eat(){
        System.out.println("This chicken is eating");
    }
    private void drink(){
        System.out.println("This chicken is drinking");
>>>>>>> 4831ce890352d3db89b46ad54ac599ceaa0e4319
    }
    private Poop poop(){
        
        return new Poop();
        
    }
    
    private Egg layAnEgg(){
        
        return new Egg();
        
    }
<<<<<<< HEAD
=======
    
    public Chicken() {
        id =0;
        name="ch";
        color="White";
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
     * @return the asMolting
     */
    public boolean isAsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the asMolting to set
     */
    public void setAsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
>>>>>>> 4831ce890352d3db89b46ad54ac599ceaa0e4319
}