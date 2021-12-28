package ec.edu.espe.farm01.model;

import java.time.LocalDate;

/**
 *
 * @author Altamirano Cristhian
 */
public class Cow01 extends FarmAnimal01 {
    private boolean isProducingMilk;

    public Cow01(int id, String breed,boolean isProducingMilk ) {
        super(id, breed);
        this.isProducingMilk =  isProducingMilk;
        
        
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