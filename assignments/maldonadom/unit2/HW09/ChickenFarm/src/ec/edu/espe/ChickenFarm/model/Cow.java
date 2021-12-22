
package ec.edu.espe.ChickenFarm.model;
import java.time.LocalDate;
/**
 *
 * @author Mateo Maldonado
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String streed, LocalDate bornon) {
        super(id, streed, bornon);
        this.isProducingMilk = isProducingMilk;
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
