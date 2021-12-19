package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class FarmAnimal {

    private int id;
    private String breed;
    private LocalDate bornOn;
    private ArrayList<FarmAnimal> farmAnimals;

    public int getAgeInMonths() {
        return 0;
    }

    public FarmAnimal(int id, String breed, LocalDate bornOn, ArrayList<FarmAnimal> farmAnimals) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.farmAnimals = farmAnimals;
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

    /**
     * @return the farmAnimals
     */
    public ArrayList<FarmAnimal> getFarmAnimals() {
        return farmAnimals;
    }

    /**
     * @param farmAnimals the farmAnimals to set
     */
    public void setFarmAnimals(ArrayList<FarmAnimal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

}
