package ec.edu.espe.farm.model;

/**
 *
 * @author Javier Paucar
 */
public class Cow {

    private int id;
    private String breed;
    private String bornOn;
    private boolean isProducingMilk;

    public Cow(int id, String breed, String bornOn, boolean isProducingMilk) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + ", isProducingMilk=" + isProducingMilk + '}';
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
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

}
