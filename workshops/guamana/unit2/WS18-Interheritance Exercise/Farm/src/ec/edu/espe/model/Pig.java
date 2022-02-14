/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.time.LocalDate;

/**
 *
 * @author Angel Guaman
 */
public class Pig extends FarmAnimal{
private float weigth;  

    public Pig(float weigth, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weigth = weigth;
    }


    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
    
}
