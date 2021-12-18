
package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Maisincho Richar
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(int id, String breed, LocalDate born0n,boolean isMolting) {
        super(id, breed, born0n);
        this.isMolting=isMolting;
        
        
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
