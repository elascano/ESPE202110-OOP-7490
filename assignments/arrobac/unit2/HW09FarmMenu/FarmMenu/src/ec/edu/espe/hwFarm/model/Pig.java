
package ec.edu.espe.hwFarm.model;

import java.time.LocalDate;




/**
 *
 * @author Cristian Arroba
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
