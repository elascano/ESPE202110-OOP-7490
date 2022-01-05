package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author SETayoRuiz
 */
public class Pig extends FarmAnimal {

    private float weight;
    LocalDate bornOn1;

    public Pig(float weight, int idPig, String breedPig, LocalDate bornOnPig) {
        super(idPig, breedPig, bornOnPig);
        this.weight = weight;
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

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn1() {
        return bornOn1;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn1(LocalDate bornOn1) {
        this.bornOn1 = bornOn1;
    }
}
