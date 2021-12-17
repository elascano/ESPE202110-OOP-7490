/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenCoopMenu.model;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jose Guzman
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens;
    //Chicken chickens[];
    
    public void add(Chicken chicken){
        chickens.add(chicken);
    }
 
    public void remove(Chicken chicken){
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the chicken id");
        int dni=read.nextInt();
        for(int i=0; i<chickens.size();i++){
            if (chickens.get(i).getId()==dni){
                chickens.remove(i);
            }
        }
    }
    
    public int countChickens(){
        return chickens.size();
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
