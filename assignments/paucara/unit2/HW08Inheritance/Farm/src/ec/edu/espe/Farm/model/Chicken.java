package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    private ArrayList<Chicken> chickens;
    
     public void add(Chicken chicken){
        chickens.add(chicken);
    }

    public Chicken(boolean isMolting, ArrayList<Chicken> chickens, int id, String breed, LocalDate bornOn, ArrayList<FarmAnimal> farmAnimals) {
        super(id, breed, bornOn, farmAnimals);
        this.isMolting = isMolting;
        this.chickens = chickens;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
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

}
