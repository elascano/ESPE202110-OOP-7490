
package ec.edu.espe.farm.model;

import java.time.LocalDate;


/**
 *
 * @author Alan
 */
public class Sheep extends FarmSystem{
    LocalDate lastSheering;

    public Sheep(int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
    }

  
    
}
