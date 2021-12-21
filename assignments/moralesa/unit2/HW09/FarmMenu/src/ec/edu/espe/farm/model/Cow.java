
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Anthony Morales
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;
    LocalDate bornOnCow;

    public Cow(boolean isProducingMilk, int idCow, String breedCow, LocalDate bornOnCow) {
        super(idCow, breedCow, bornOnCow);
        this.isProducingMilk = isProducingMilk;
    }

    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    public LocalDate getBornOnCow() {
        return bornOnCow;
    }

    public void setBornOnCow(LocalDate bornOnCow) {
        this.bornOnCow = bornOnCow;
    }

}
