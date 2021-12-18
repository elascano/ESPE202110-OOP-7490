
package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author malvarez
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(int id, String breed, LocalDate bornOn, LocalDate lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
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
    
}
