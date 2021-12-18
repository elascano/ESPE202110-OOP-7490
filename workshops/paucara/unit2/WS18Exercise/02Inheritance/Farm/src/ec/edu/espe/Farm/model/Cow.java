package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Javier Paucar
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIaProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

}
