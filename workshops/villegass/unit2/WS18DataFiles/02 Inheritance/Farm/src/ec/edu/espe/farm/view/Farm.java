
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Salma Villegas
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id=0;
        String breed= "any";
        LocalDate bornOn=LocalDate.of(2021,12,15);
        
        System.out.println("WS18 Salma Villegas");
        
        farmAnimal =new FarmAnimal(0, breed, bornOn);
        
        System.out.println("farmAnimal  -->");
        System.out.println("id  -->" + farmAnimal.getId());
        System.out.println("breed  -->" + farmAnimal.getBreed());
        System.out.println("bornOn  -->" + farmAnimal.getBornOn());
        
        id=1;
        breed= "Playmouth";
        bornOn=LocalDate.of(2020, 06, 20);
        boolean isMolting = true;
        Chicken chicken = new Chicken(true,id,breed,bornOn);
        
        System.out.println("farmAnimal  -->");
        System.out.println("id  -->" + chicken.getId());
        System.out.println("breed  -->" + chicken.getBreed());
        System.out.println("bornOn  -->" + chicken.getBornOn());
        System.out.println("isMolting  -->" + chicken.isIsMolting());
        
    }
    
}
