package ec.edu.espe.farm.model;


/**
 *
 * @author Javier Paucar
 */
public class Pig {

    private int id;
    private String breed;
    private String bornOn;
    private float weight;

    public Pig(int id, String breed, String bornOn, float weight) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + ", weight=" + weight + '}';
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

}
