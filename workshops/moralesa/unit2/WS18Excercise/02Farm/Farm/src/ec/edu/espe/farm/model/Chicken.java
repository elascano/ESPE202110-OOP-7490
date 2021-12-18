
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Anthony Morales
 */
public class Chicken extends FarmAnimal {
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }
    
    

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}