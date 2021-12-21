
package ec.edu.espe.ChickenFarm.model;
import java.time.LocalDate;

/**
 *
 * @author MateoMaldonado
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
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