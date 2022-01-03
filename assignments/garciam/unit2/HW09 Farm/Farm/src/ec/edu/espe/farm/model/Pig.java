
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author mayerly
 */
public class Pig extends FarmAnimal{
    private float Weight;

    public Pig(float Weight, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.Weight = Weight;
    }

    /**
     * @return the Weight
     */
    public float getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(float Weight) {
        this.Weight = Weight;
    }
    
    
    
}
