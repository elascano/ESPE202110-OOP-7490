/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melig
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken>chickens;

    public void add(Chicken chicken){
        chickens.add(chicken);
    }
    
    public void remove(Chicken chicken){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the chicken id for delete it ---> ");
        int dni=read.nextInt();
        for(int i=0; i<chickens.size(); i++){
            if(chickens.get(i).getId()== dni){
            } else {
                chickens.remove(i);
            }
        }
        
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
