package ec.edu.espe.farm01.model;

import java.time.LocalDate;

/**
 *
 * @author mealvarez
 */
public class Pig01 extends FarmAnimal01 {
    float weight;

    public Pig01(float weight, int id, String breed) {
        super(id, breed);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
