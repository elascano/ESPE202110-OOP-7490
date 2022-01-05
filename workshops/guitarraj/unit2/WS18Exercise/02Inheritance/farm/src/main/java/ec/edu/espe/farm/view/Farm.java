
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.control.Chicken;
import ec.edu.espe.farm.control.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Guitarra Jhon
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "anny";
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        farmAnimal = new FarmAnimal(0,breed,bornOn);
        
        System.out.println("farmAnimal is a "+farmAnimal.getClass());
        System.out.println("farAnimal  ->");
        System.out.println("id      ->"+farmAnimal.getId());
        System.out.println("breed   ->"+farmAnimal.getBreed());
        System.out.println("born On ->"+farmAnimal.getBornOn());
        
        id = 0;
        breed = "anny";
        bornOn = LocalDate.of(2021,12,15);
        boolean isMolting = true;
        
        farmAnimal = new Chicken(id,breed,bornOn,isMolting);
        
        System.out.println("farmAnimal is a "+farmAnimal.getClass());
        System.out.println("parte 1");
        Chicken chicken = new Chicken(id,breed,bornOn,isMolting);
        System.out.println("farmAnimal is a "+chicken.getClass());       
        
        System.out.println("farAnimal  ->");
        System.out.println("id      ->"+chicken.getId());
        System.out.println("breed   ->"+chicken.getBreed());
        System.out.println("born On ->"+chicken.getBornOn());
        System.out.println("isMolting ->"+chicken.isIsMolting());
        
    }
}
