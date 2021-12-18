package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastSheering;
    private ArrayList<Sheep> sheeps;
    
     public void add(Sheep sheep){
        sheeps.add(sheep);
    }

    public Sheep(LocalDate lastSheering, ArrayList<Sheep> sheeps, int id, String breed, LocalDate bornOn, ArrayList<FarmAnimal> farmAnimals) {
        super(id, breed, bornOn, farmAnimals);
        this.lastSheering = lastSheering;
        this.sheeps = sheeps;
    }

    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
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
