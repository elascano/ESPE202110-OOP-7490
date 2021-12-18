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
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    
}
