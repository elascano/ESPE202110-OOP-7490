package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;
    private ArrayList<Cow> cows;
    
     public void add(Cow cow){
        cows.add(cow);
    }

    public Cow(boolean isProducingMilk, ArrayList<Cow> cows, int id, String breed, LocalDate bornOn, ArrayList<FarmAnimal> farmAnimals) {
        super(id, breed, bornOn, farmAnimals);
        this.isProducingMilk = isProducingMilk;
        this.cows = cows;
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIaProducingMilk(boolean isProducingMilk) {
        this.setIsProducingMilk(isProducingMilk);
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
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

}
