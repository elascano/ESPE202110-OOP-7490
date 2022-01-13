package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author alex_
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id=0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("FarmAnimal is a  --->" + farmAnimal.getClass());
        System.out.println("Id ---->" + farmAnimal.getId());
        System.out.println("Breed ---->" + farmAnimal.getBreed());
        System.out.println("Born On ---->" + farmAnimal.getBornOn());
        
        id=1;
        breed="Playmouth";
        bornOn=LocalDate.of(2020,06,20);
        boolean isMolting = true;
        farmAnimal = new Chicken(isMolting, id, breed, bornOn);
        
        Chicken chicken = new Chicken(isMolting, id, breed, bornOn); 
        System.out.println("FarmAnimal is a  --->" + farmAnimal.getClass());              
        
        System.out.println("Chicken --->");
        System.out.println("Id ---->" + chicken.getId());
        System.out.println("Breed ---->" + chicken.getBreed());
        System.out.println("Born On ---->" + chicken.getBornOn());
        System.out.println("Is Molting --->" + chicken.isIsMolting());
    }
    
}
