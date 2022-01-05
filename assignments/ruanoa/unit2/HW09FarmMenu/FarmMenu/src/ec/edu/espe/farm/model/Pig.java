
package ec.edu.espe.farm.model;

import java.time.LocalDate;




/**
 *
 * @author Alexander Ruano
 */
public class Pig extends FarmAnimal{
    private float whigth;

    public Pig(float whigth, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.whigth = whigth;
    }



    /**
     * @return the whigth
     */
    public float getWhigth() {
        return whigth;
    }

    /**
     * @param whigth the whigth to set
     */
    public void setWhigth(float whigth) {
        this.whigth = whigth;
    }
    
    
    
}

