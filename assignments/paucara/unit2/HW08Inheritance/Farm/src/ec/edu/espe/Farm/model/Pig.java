package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Pig extends FarmAnimal {

    private float weigth;
    private ArrayList<Pig> pigs;
    
     public void add(Pig pig){
        pigs.add(pig);
    }

    public Pig(float weigth, ArrayList<Pig> pigs, int id, String breed, LocalDate bornOn, ArrayList<FarmAnimal> farmAnimals) {
        super(id, breed, bornOn, farmAnimals);
        this.weigth = weigth;
        this.pigs = pigs;
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    /**
     * @return the pigs
     */
    public ArrayList<Pig> getPigs() {
        return pigs;
    }

    /**
     * @param pigs the pigs to set
     */
    public void setPigs(ArrayList<Pig> pigs) {
        this.pigs = pigs;
    }

}
