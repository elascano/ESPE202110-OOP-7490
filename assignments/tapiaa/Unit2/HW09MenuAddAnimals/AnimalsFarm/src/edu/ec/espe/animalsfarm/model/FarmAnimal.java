
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Andrea Tapia
 */
public class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate borOn;
    
    

    public FarmAnimal(int id, String breed, LocalDate borOn) {
        this.id = id;
        this.breed = breed;
        this.borOn = borOn;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the borOn
     */
    public LocalDate getBorOn() {
        return borOn;
    }

    /**
     * @param borOn the borOn to set
     */
    public void setBorOn(LocalDate borOn) {
        this.borOn = borOn;
    }
}
