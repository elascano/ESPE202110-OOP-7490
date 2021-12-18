package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Leonel Mantuano
 */
public class FarmAnimal {
    private int id ;
    private String breed;
    private LocalDate bornOn;

    public int getAgeInMonths(){
        return 0;
    }
    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBornOn() {
        return bornOn;
    }

    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }
    
    
}
