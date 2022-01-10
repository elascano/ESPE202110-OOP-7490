package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Sheep {

    private int id;
    private String breed;
    private String bornOn;
    private String lastSheering;

    public Sheep(int id, String breed, String bornOn, String lastSheering) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + ", lastSheering=" + lastSheering + '}';
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
    public String getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(String bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the lastSheering
     */
    public String getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(String lastSheering) {
        this.lastSheering = lastSheering;
    }

}
