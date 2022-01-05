/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HWFarm.model;
import java.time.LocalDate;

/**
 *
 * @author Jose Guzman
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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
