<<<<<<< HEAD
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
 */
public class Sheep extends FarmAnimal {

    LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.lastSheering = lastSheering;
    }

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }

}
=======
package edu.ec.espe.animalsfarm.model;

import java.time.LocalDate;

/**
 *
 * @author dylanasumaza
 */
public class Sheep extends FarmAnimal {

    LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.lastSheering = lastSheering;
    }

    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }

}
>>>>>>> 466fcee97c9470e8d3d0c4ffc518fa7f80e38b4c
