
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;


/**
 *
 * @author alan
 */
public class Sheep extends FarmAnimal {
    LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.lastSheering = lastSheering;
    }

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    
}
