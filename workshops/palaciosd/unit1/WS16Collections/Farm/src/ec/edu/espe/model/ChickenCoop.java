/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens;//is the solution 
    
    public void add(Chicken chicken){
        chickens.add(chicken);
    }
    
    public void remove(Chicken chicken){
        chickens.remove(chicken);
    }
    
    public int countChickens(){
        return chickens.size();
    }
    
    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }
    
    
}
