/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Pig extends FarmAnimal{
    float weight;

    public Pig(float weight, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }
    

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
}
