package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Salma VIllegas
 */
public class Pig extends FarmAnimal {
    float weight;

    public Pig(float weight, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    
}
