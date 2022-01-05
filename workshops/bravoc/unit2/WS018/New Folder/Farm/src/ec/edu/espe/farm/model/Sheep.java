package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Christian Bravo
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastSheeringDate;

    public Sheep(int id, String breed, LocalDate bornOn, LocalDate lastSheeringDate) {
        super(id, breed, bornOn);
        this.lastSheeringDate = lastSheeringDate;
    }

    /**
     * @return the lastSheeringDate
     */
    public LocalDate getLastSheeringDate() {
        return lastSheeringDate;
    }

    /**
     * @param lastSheeringDate the lastSheeringDate to set
     */
    public void setLastSheeringDate(LocalDate lastSheeringDate) {
        this.lastSheeringDate = lastSheeringDate;
    }

}
