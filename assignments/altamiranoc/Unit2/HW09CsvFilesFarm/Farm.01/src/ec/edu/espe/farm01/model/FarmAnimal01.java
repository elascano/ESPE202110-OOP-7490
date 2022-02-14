package ec.edu.espe.farm01.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Altamirano Cristhian
 */
public class FarmAnimal01 {
    private int id;
    private String breed;
    
    

    public FarmAnimal01(int id, String breed) {
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