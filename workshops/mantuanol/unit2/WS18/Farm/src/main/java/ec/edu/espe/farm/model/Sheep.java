package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Leonel Mantuano
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(int id, String breed, LocalDate bornOn,LocalDate lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering=lastSheering;
    }
    
    

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
}