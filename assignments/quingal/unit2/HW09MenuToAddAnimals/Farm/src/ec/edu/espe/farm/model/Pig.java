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
public class Pig extends FarmAnimal{
    private float weight;

//    public Pig(float weight, int id, String breed, LocalDate bornOn, ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
//        super(id, breed, bornOn, chickens, cows, pigs, sheeps);
//        this.weight = weight;
//    }

    public Pig(float weight, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }

   
    
    
    
    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    
}
