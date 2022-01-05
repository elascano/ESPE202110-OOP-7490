
package ec.edu.espe.farm.control

import java.util.ArrayList;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Coop{
    
    private ArrayList<FarmAnimal> farmAnimals ;

    public Coop(ArrayList<FarmAnimal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    /**
     * @return the farmAnimals
     */
    public ArrayList<FarmAnimal> getFarmAnimals() {
        return farmAnimals;
    }

    /**
     * @param farmAnimals the farmAnimals to set
     */
    public void setFarmAnimals(ArrayList<FarmAnimal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }
    
    
}
