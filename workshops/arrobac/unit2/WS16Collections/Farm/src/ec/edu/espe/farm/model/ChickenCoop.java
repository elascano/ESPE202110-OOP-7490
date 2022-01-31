/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Arroba
 */
public class ChickenCoop {
    private int id;
    //Chicken chickens[]; //arrays have a limited size
    private ArrayList<Chicken> chickens;

    public ChickenCoop(int i, ArrayList<Chicken> chickens) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(Chicken chicken){
        chickens.add
    }
            
     }       
            
            

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }
    
    

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
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
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    
    
    
    
    

