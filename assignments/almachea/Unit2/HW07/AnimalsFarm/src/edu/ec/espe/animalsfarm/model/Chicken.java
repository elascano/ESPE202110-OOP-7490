
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author Anderson Almache
 */
public class Chicken extends FarmAnimal {

private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
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
