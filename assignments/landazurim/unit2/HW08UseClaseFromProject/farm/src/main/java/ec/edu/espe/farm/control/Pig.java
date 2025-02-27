package ec.edu.espe.farm.control

import java.time.LocalDate;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Pig extends FarmAnimal{
    private boolean weigth;

    public Pig(boolean weigth, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weigth = weigth;
    }
    
    /**
     * @return the weigth
     */
    public boolean isWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(boolean weigth) {
        this.weigth = weigth;
    }
    
}
