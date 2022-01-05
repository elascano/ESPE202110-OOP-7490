package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 

/**
 *
 * @author Alan
 */
public class ChickenCoop {
   
    
    Scanner read = new Scanner(System.in);
    
    private int id;
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();


     public void AddChicken(int id, String name, String color, int age) {
         
        chickens.add(new Chicken(id, name, color, age));
        
    }


    public void Print(){
        
        for(int i=0; i < chickens.size(); i++){
            chickens.get(i).print();
        }
    
    }

    public void Remove(int id){

        chickens.removeIf(chicken -> chicken.getId() == id);

    }
    
    public void QuantityTotal(){
        int quantity = chickens.size();
        System.out.println("The quantity chickens is--> " + quantity);
    }
    /**
     * @return the id
    */ 
    public int getId() {
        return id;
    }

    /**
     * @param id to set
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
     * @param the chickens to set
    */ 
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }
    
    public int countChickens(){
        return chickens.size();
    }
    
}