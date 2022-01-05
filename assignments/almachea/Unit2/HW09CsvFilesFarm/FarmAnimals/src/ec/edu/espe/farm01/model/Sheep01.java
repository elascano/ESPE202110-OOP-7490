package ec.edu.espe.farm01.model;

import java.time.LocalDate;


/**
 *
 * @author Anderson
 */
public class Sheep01 extends FarmAnimal01 {
    LocalDate lastSheering;

    public Sheep01(LocalDate lastSheering, int id, String breed) {
        super(id, breed);
        this.lastSheering = lastSheering;
    }

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    
}

