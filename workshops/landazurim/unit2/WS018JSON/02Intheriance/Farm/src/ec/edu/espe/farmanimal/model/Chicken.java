/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmanimal.model;

import java.time.LocalDate;


/**
 *
 * @author Mateo Israel Landazuri Segovia OOP
 */
public class Chicken extends FarmAnimal {
    private boolean isMolting;

    public Chicken(int id, String breed, LocalDate bornOn,boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting=isMolting;
    }

    
    
    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
    
}
