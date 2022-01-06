package ec.edu.espe.farm.model;


/**
 *
 * @author Javier Paucar
 */
public class Chicken {

    private int id;
    private String breed;
    private String bornOn;
    private boolean isMolting;

    public Chicken(int id, String breed, String bornOn, boolean isMolting) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + ", isMolting=" + isMolting + '}';
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
