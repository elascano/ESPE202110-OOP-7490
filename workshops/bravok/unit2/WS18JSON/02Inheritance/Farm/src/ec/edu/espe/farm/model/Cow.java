
package ec.edu.espe.farm.model;

import java.time.LocalDate;



/**
 *
 * @author Katherin Bravo
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;

    public Cow(int id, String breed, LocalDate bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    public Cow(boolean molting, int idCow, String breedCow, LocalDate bornOnCow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cow(boolean molting, int idCow, String breedCow, LocalDate bornOnCow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    
    
    
}
