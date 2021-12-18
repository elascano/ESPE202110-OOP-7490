package ec.edu.espe.farm.model;

import java.time.LocalDate;




/**
 *
 * @author Sebas
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastCheering;

    public Sheep(LocalDate lastCheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastCheering = lastCheering;
    }

    /**
     * @return the lastCheering
     */
    public LocalDate getLastCheering() {
        return lastCheering;
    }

    /**
     * @param lastCheering the lastCheering to set
     */
    public void setLastCheering(LocalDate lastCheering) {
        this.lastCheering = lastCheering;
    }

}
