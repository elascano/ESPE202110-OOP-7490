package farm;

import ec.edu.espe.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Joel
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FarmAnimal farmAnimal;
       int id = 0;
       String breed = "any";
       LocalDate bornOn = LocalDate.of(2021,12,15);
              
       farmAnimal = new FarmAnimal(0,breed, bornOn);
       
        System.out.println("farmAnimal ->");
        System.out.println("id -> " + farmAnimal.getId());
        System.out.println("breed -> " + farmAnimal.getBreed());
        System.out.println("born On -> " + farmAnimal.getBornOn());
        
        farmAnimal = new 
    }
    
}
