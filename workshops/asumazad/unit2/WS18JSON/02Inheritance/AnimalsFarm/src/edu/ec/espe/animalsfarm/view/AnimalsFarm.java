package edu.ec.espe.animalsfarm.view;

import edu.ec.espe.animalsfarm.model.Chicken;
import edu.ec.espe.animalsfarm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author dylanasumaza
 */
public class AnimalsFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021, 12, 15);

        farmAnimal = new FarmAnimal(0, breed, bornOn);
        System.out.println("farmAnimal ->");
        System.out.println("id ->" + farmAnimal.getId());
        System.out.println("breed ->" + farmAnimal.getBreed());
        System.out.println("born on ->" + farmAnimal.getBorOn());

        id = 1;
        breed = "Playmouth";
        bornOn = LocalDate.of(2020, 06, 20);
        boolean isMolting = true;
        
        farmAnimal= new Chicken  (isMolting, id, breed, bornOn);
        System.out.println("farmAnimal is a "+ farmAnimal.getClass());
        
        Chicken chicken = new Chicken(isMolting, id, breed, bornOn);
        System.out.println("farmAnimal is a "+ chicken.getClass());
        
        System.out.println("farmAnimal ->");
        System.out.println("id ->" + chicken.getId());
        System.out.println("breed ->" + chicken.getBreed());
        System.out.println("born on ->" + chicken.getBorOn());
        System.out.println("isMolting ->"+chicken.isIsMolting());

    }

}
