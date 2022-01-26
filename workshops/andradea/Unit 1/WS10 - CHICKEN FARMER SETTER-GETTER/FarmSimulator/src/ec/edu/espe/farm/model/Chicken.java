/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Usuario
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    public Chicken(int id, int age, String name, String color, boolean molting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }
    
    
    
    public void doStuff(int forTime){
        cluck();
        wander();
        eat();
        
    }
    private void cluck(){
        System.out.println("this chiken is cluking...");
    }
    private void wander(){
        System.out.println("this chiken is wander...");
    }
    private void eat(){
        System.out.println("this chicken is eating...");
    }
    private void drink(){
        System.out.println("this chicken is drinking");
    }
    private Poop poop (){
        return new Poop();
    }
    private Egg layAnEgg(){
        return new Egg();
    }
    
    public Chicken() {
        id = 0;
        name = "ch";
        color = "white";
        age = 0;
        isMolting = true;
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

    
    