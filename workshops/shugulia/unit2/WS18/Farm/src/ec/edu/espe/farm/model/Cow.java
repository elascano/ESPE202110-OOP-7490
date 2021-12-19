
package ec.edu.espe.farm.model;

import java.time.LocalDate;



/**
 *
 * @author DARK
 */
public class Cow extends FarmSystem{
    private boolean isProducingMilk;

    public Cow(int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
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
