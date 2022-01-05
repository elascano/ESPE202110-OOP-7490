/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fram.model;

import java.util.Scanner;



/**
 *
 * @author Leandro Quinga
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    public Chicken(int id, String name, String color, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }

    
    
    @Override
    public String toString() {
        return "\n\t\tChicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", molting=" + isMolting() + '}';
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
