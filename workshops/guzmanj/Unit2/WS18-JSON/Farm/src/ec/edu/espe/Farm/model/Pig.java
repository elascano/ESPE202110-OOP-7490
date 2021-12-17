/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jose Guzman
 */
public class Pig extends FarmAnimal{
    private float weight;

    public Pig(float weight, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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
