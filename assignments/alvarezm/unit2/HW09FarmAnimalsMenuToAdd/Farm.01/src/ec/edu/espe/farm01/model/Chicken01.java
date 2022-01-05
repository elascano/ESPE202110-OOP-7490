package ec.edu.espe.farm01.model;

import java.time.LocalDate;

/**
 *
 * @author mealvarez
 */
public class Chicken01 extends FarmAnimal01{
    private boolean isMolting;

    public Chicken01(boolean isMolting, int id, String breed, LocalDate borOn) {
        super(id, breed);
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