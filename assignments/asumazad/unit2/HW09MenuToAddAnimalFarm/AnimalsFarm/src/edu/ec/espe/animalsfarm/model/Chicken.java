<<<<<<< HEAD
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
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
=======
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
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
>>>>>>> 466fcee97c9470e8d3d0c4ffc518fa7f80e38b4c
