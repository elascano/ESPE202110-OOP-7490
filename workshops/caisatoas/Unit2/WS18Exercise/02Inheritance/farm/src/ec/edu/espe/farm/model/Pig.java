
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Caisatoa
 */
public class Pig extends FarmAnimal{
    private float weight;

    public Pig(float weight, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
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
    
}
