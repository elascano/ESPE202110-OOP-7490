
package ec.edu.espe.farm.model;

import java.time.LocalDate;



/**
 *
 * @author Katherin Bravo
 */
public class Sheep extends FarmAnimal {
    private LocalDate lastSheering;

    public Sheep(int id, String breed, LocalDate bornOn, LocalDate lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    public Sheep(LocalDate lastSheering, int idSheep, String breedSheep, LocalDate bornOnSheep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Sheep(LocalDate lastSheering, int idSheep, String breedSheep, LocalDate bornOnSheep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
