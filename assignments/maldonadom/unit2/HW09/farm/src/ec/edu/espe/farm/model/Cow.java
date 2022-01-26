
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author MaldonadoMateo
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;
    LocalDate bornOnCow;

    public Cow(boolean isProducingMilk, int idCow, String breedCow, LocalDate bornOnCow) {
        super(idCow, breedCow, bornOnCow);
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
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    /**
     * @return the bornOn
     */
    public LocalDate getBornOnCow() {
        return bornOnCow;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOnCow(LocalDate bornOnCow) {
        this.bornOnCow = bornOnCow;
    }

}
