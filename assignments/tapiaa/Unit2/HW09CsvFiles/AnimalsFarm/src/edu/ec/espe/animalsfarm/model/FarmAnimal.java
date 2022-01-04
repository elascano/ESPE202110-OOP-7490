
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
    
    

    public FarmAnimal(int id, String breed) {
        this.id = id;
        this.breed = breed;
      
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
}
