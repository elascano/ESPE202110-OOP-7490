package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class FarmAnimal {
    private ArrayList<Chicken> chickens;
    private ArrayList<Cow> cows;
    private ArrayList<Pig> pigs;
    private ArrayList<Sheep> sheeps;

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }

    public void add(Cow cow) {
        cows.add(cow);
    }

    public void add(Pig pig) {
        pigs.add(pig);
    }

    public void add(Sheep sheep) {
        sheeps.add(sheep);
    }

    public FarmAnimal(ArrayList<Chicken> chickens, ArrayList<Cow> cows, ArrayList<Pig> pigs, ArrayList<Sheep> sheeps) {
        this.chickens = chickens;
        this.cows = cows;
        this.pigs = pigs;
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "chickens=" + chickens + ", cows=" + cows + ", pigs=" + pigs + ", sheeps=" + sheeps + '}';
    }

    
 

    /**
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    /**
     * @return the cows
     */
    public ArrayList<Cow> getCows() {
        return cows;
    }

    /**
     * @param cows the cows to set
     */
    public void setCows(ArrayList<Cow> cows) {
        this.cows = cows;
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

    /**
     * @return the sheeps
     */
    public ArrayList<Sheep> getSheeps() {
        return sheeps;
    }

    /**
     * @param sheeps the sheeps to set
     */
    public void setSheeps(ArrayList<Sheep> sheeps) {
        this.sheeps = sheeps;
    }

   

}
