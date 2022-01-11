
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal ;
        int id=0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        farmAnimal = new FarmAnimal(id, breed, bornOn);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        System.out.println("farmAnimal -->");
        System.out.println("id         -->" + farmAnimal.getId());
        System.out.println("breed      -->" + farmAnimal.getBreed());
        System.out.println("bornOn     -->" + farmAnimal.getBornOn());
        
        farmAnimal = new Chicken(true, id, breed, bornOn);
        
        
        
        
  
    }
    
}
