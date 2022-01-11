package ec.edu.espe.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alex_
 */
public class FarmAnimal {
    private int id;
    private String breed ;
    private LocalDate bornOn;
    private ArrayList<Chicken> chickens; 

    public int getAgeInMonths(){
        return 0;
    } 
    
    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    public void add(Chicken chicken){
        chickens.add(chicken);
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
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }
    
    
    
}
