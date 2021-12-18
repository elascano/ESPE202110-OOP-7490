package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Leonel Mantuano
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;
    
    public Cow(int id, String breed, LocalDate bornOn,boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk=isProducingMilk;
    }

    
    
}
