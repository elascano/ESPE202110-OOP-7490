/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author ALEXA
 */
public class Pig extends FarmAnimal{
    private float weinght;

    public Pig(int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
    }

    /**
     * @return the weinght
     */
    public float getWeinght() {
        return weinght;
    }

    /**
     * @param weinght the weinght to set
     */
    public void setWeinght(float weinght) {
        this.weinght = weinght;
    }
}
