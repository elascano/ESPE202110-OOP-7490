/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class FarmAnimal {
   private int id;
    private String breed;
    private LocalDate bornOn;
//    private ArrayList<Chicken> chickens;
//    private ArrayList<Cow>cows;
//    private ArrayList<Pig>pigs;
//    private ArrayList<Sheep>sheeps;
//
//    
    
//    public FarmAnimal(int id, String breed, LocalDate bornOn, ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
//        this.id = id;
//        this.breed = breed;
//        this.bornOn = bornOn;
//        this.chickens = chickens;
//        this.cows = cows;
//        this.pigs = pigs;
//        this.sheeps = sheeps;
//    }
    
//     public void addChicken(Chicken chicken) {
//        getChickens().add(chicken);
//    }
//     
//     public void addCow(Cow cow){
//        getCows().add(cow);
//     }
//     
//     public void addPig(Pig pig){
//        getPigs().add(pig);
//     }
//     
//     public void addSheep(Sheep sheep){
//         getSheeps().add(sheep);
//     }
//     

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the chickens
     */
//    public ArrayList<Chicken> getChickens() {
//        return chickens;
//    }
//
//    /**
//     * @param chickens the chickens to set
//     */
//    public void setChickens(ArrayList<Chicken> chickens) {
//        this.chickens = chickens;
//    }
//
//    /**
//     * @return the cows
//     */
//    public ArrayList<Cow> getCows() {
//        return cows;
//    }
//
//    /**
//     * @param cows the cows to set
//     */
//    public void setCows(ArrayList<Cow> cows) {
//        this.cows = cows;
//    }
//
//    /**
//     * @return the pigs
//     */
//    public ArrayList<Pig> getPigs() {
//        return pigs;
//    }
//
//    /**
//     * @param pigs the pigs to set
//     */
//    public void setPigs(ArrayList<Pig> pigs) {
//        this.pigs = pigs;
//    }
//
//    /**
//     * @return the sheeps
//     */
//    public ArrayList<Sheep> getSheeps() {
//        return sheeps;
//    }
//
//    /**
//     * @param sheeps the sheeps to set
//     */
//    public void setSheeps(ArrayList<Sheep> sheeps) {
//        this.sheeps = sheeps;
//    }
//    
    
    
    

    
}
