
package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Sebas
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;
    

    public Cow(int id, String breed, LocalDate bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk= isProducingMilk;
        
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
}
