package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Alan
 */
public class FarmSystem {
    private int id;
    private String breed;
    private LocalDate born0n;

    public FarmSystem(int id, String breed, LocalDate born0n) {
        this.id = id;
        this.breed = breed;
        this.born0n = born0n;
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
     * @return the born0n
     */
    public LocalDate getBorn0n() {
        return born0n;
    }

    /**
     * @param born0n the born0n to set
     */
    public void setBorn0n(LocalDate born0n) {
        this.born0n = born0n;
    }

    public String getisMolting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
