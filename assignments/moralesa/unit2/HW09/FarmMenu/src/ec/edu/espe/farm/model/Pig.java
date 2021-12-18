
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Anthony Morales
 */
public class Pig extends FarmAnimal{
    private float weight;
    LocalDate bornOn1;

    public Pig(float weight, int idPig, String breedPig, LocalDate bornOnPig) {
        super(idPig, breedPig, bornOnPig);
        this.weight = weight;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getBornOn1() {
        return bornOn1;
    }


    public void setBornOn1(LocalDate bornOn1) {
        this.bornOn1 = bornOn1;
    }    
}
