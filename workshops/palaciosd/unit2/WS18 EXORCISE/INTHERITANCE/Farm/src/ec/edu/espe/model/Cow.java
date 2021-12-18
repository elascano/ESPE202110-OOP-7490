/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.time.LocalDate;


/**
 *
 * @author SEBASTIAN PALACIOS
 */
public class Cow extends FarmAnimal{
    private boolean isProducingmilk;

    public Cow(boolean isProducingmilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingmilk = isProducingmilk;
    }

    /**
     * @return the isProducingmilk
     */
    public boolean isIsProducingmilk() {
        return isProducingmilk;
    }

    /**
     * @param isProducingmilk the isProducingmilk to set
     */
    public void setIsProducingmilk(boolean isProducingmilk) {
        this.isProducingmilk = isProducingmilk;
    }
    
    
}
