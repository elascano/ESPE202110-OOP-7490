/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author MateoMaldonado
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        
        this.isMolting = isMolting;
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
