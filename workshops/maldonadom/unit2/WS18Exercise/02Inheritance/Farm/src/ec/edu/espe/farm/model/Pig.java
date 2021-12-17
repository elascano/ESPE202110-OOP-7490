package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author MateoMaldonado
 */
public class Pig extends FarmAnimal{
    private float weight;

    public Pig(float weight, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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
