package ec.edu.espe.farm.control;

import java.time.LocalDate;

/**
 *
 * @author Guitarra Jhon
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(int id, String breed,LocalDate bornOn,boolean isMolting) {
        super(id,breed,bornOn);
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
