
package ec.edu.espe.ChickenFarm.model;
import java.time.LocalDate;

/**
 *
 * @author MateoMaldonado
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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
