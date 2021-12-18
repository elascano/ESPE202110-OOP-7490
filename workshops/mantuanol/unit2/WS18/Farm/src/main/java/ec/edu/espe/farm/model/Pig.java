package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Leonel Mantuano
 */
public class Pig extends FarmAnimal {
    float weight;

    public Pig(int id, String breed, LocalDate bornOn,float weight) {
        super(id, breed, bornOn);
        this.weight=weight;
               }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    
    
    
}
