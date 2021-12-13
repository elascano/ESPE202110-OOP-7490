/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ChickenCoop {
   private int id;
   private ArrayList<Chicken> chickens;
   
   public void add(Chicken chicken){
       chickens.add(chicken);
   }
   
   public void remove(Chicken hicken){
    chickens.remove(id);
}
   
   public int countChickens(){
       return chickens.size();
   }
   
   // arrays have a limited size 

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }

    
}
