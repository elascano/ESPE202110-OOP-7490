
package farm;
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Maisincho Richar
 */
public class farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "any";
        LocalDate born0n = LocalDate.of(2021,12,15);
        
        
        farmAnimal = new FarmAnimal(0, breed, born0n);
        
        System.out.println("farAnimal->");
        System.out.println("id -> "+ farmAnimal.getId());
        System.out.println("breed -> "+ farmAnimal.getBreed());
        System.out.println("born On -> "+ farmAnimal.getBorn0n());
        
        id = 1;
         breed = "Playmount";
        born0n = LocalDate.of(2020,06,20);
        boolean isMolting = true;
        LocalDate bornOn = null;
        farmAnimal=new Chicken(id, breed, bornOn, isMolting);
        
        System.out.println("\nfarmAnimal is a " + farmAnimal.getClass());
        
        
        Chicken chicken= new Chicken(id, breed, bornOn, isMolting);
   
        System.out.println("farmAnimal is a "+ chicken.getClass());
        
        System.out.println("farAnimla ->");
        System.out.println("farAnimal->");
        System.out.println("id -> "+ chicken.getId());
        System.out.println("breed -> "+ chicken.getBreed());
        System.out.println("born On -> "+ chicken.getBorn0n());
        System.out.println("isMolting ->"+ chicken.isIsMolting());
        
                
    }
    
}
