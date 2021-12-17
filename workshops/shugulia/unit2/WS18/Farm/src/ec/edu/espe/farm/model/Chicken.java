
package ec.edu.espe.farm.model;

import java.time.LocalDate;



/**
 *
 * @author Alan
 */
public class Chicken extends FarmSystem{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
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
