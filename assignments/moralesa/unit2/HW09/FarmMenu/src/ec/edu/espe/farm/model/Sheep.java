
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Anthony Morales
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;
    private LocalDate bornOnSheep;
    
    public Sheep(LocalDate lastSheering, int idSheep, String breedSheep, LocalDate bornOnSheep) {
        super(idSheep, breedSheep, bornOnSheep);

        this.lastSheering = lastSheering;
    }


    public LocalDate getLastSheering() {
        return lastSheering;
    }


    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }


    public LocalDate getBornOnSheep() {
        return bornOnSheep;
    }


    public void setBornOnSheep(LocalDate bornOnSheep) {
        this.bornOnSheep = bornOnSheep;
    }
    
}
