/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Sheep extends FarmAnimal {

    /**
     *
     * @param lastSheerting
     * @param id
     * @param breed
     * @param born0n
     * @param lastSheerting
     */
    public Sheep(int id, String breed, LocalDate born0n, LocalDate lastSheerting) {
        super(id, breed, born0n);
        this.lastSheerting = lastSheerting;
    }
    
    private LocalDate lastSheerting;

    /**
     * @return the lastSheerting
     */
    public LocalDate getLastSheerting() {
        return lastSheerting;
    }

    /**
     * @param lastSheerting the lastSheerting to set
     */
    public void setLastSheerting(LocalDate lastSheerting) {
        this.lastSheerting = lastSheerting;
    }
    
    
}
