
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author JaimeEivar
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;
    private LocalDate bornOnSheep;
    
    public Sheep(LocalDate lastSheering, int idSheep, String breedSheep, LocalDate bornOnSheep) {
        super(idSheep, breedSheep, bornOnSheep);
        //this.bornOnSheep = bornOnSheep;
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

    /**
     * @return the bornOnSheep
     */
    public LocalDate getBornOnSheep() {
        return bornOnSheep;
    }

    /**
     * @param bornOnSheep the bornOnSheep to set
     */
    public void setBornOnSheep(LocalDate bornOnSheep) {
        this.bornOnSheep = bornOnSheep;
    }
    
}
