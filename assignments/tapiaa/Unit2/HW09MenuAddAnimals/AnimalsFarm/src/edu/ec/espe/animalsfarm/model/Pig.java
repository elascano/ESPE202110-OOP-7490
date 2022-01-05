
package edu.ec.espe.animalsfarm.model;
import java.time.LocalDate;


/**
 *
 * @author Andrea Tapia
 */
public class Pig extends FarmAnimal {
    float weight;

    public Pig(float weight, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
