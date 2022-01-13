
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Sheep extends FarmAnimal {
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
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
