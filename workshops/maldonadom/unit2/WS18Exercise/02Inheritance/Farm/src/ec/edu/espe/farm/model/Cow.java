package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author MateoMaldonado
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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
    
    
}
