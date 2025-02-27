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
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
        this.isProducingMilk = isProducingMilk;
    }

        
    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    
}
