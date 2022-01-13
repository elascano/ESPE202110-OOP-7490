/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens;//is this the solution
    //arrays have a limited size

    public void add(Chicken chicken){
        chickens.add(chicken);
    }
    
    public int countChickens(){
        return chickens.size();
    }
    
    public void remove(Chicken chicken){
         chickens.remove(chicken);
         chickens.remove(id);
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
    
    
}
