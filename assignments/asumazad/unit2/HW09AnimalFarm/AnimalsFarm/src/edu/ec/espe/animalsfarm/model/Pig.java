<<<<<<< HEAD
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
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
=======
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
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
>>>>>>> 466fcee97c9470e8d3d0c4ffc518fa7f80e38b4c
