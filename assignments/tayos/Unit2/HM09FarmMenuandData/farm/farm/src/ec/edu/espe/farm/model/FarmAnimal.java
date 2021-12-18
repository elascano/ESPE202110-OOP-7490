package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author SETayoRuiz
 */
public class FarmAnimal {

    int id;
    String breed;
    LocalDate bornOn;
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public void AddChicken(int id, String name, LocalDate bornOn) {

        chickens.add(new Chicken(id, name, bornOn));

    }

    public void Print() {

        for (int i = 0; i < chickens.size(); i++) {
            chickens.get(i).print();
        }

    }

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

}
