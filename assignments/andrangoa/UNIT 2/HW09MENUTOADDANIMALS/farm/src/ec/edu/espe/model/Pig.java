
package ec.edu.espe.model;

import java.time.LocalDate;

/**
 *
 * @author alex_
 */
public class Pig extends FarmAnimal {
    private float weigth;

    public Pig(float weigth, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weigth = weigth;
    }

    
    
    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
    
    
    
}
