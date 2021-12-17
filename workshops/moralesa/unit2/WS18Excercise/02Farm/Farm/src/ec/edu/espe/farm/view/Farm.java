
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Anthony Morales
 */
public class Farm {

    public static void main(String[] args) {
        System.out.println("WS18 --> Anthony Morales <--");
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021, 12, 15);

        farmAnimal = new FarmAnimal(id, breed, bornOn);

        System.out.println("farmAnimal is a -->" + farmAnimal.getClass());
        System.out.println("id -->" + farmAnimal.getId());
        System.out.println("breed -->" + farmAnimal.getBreed());
        System.out.println("born on -->" + farmAnimal.getBornOn());

        id = 1;
        breed = "Playmount";
        bornOn = LocalDate.of(202, 06, 20);
        boolean isMolting = true;
        farmAnimal = new Chicken(isMolting, id, breed, bornOn);
        System.out.println("farmAnimal is a -->" + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(true, id, breed, bornOn);
        System.out.println("farmAnimal is a -->" + farmAnimal.getClass());

        System.out.println("farmAnimal -->");
        System.out.println("id -->" + chicken.getId());
        System.out.println("breed -->" + chicken.getBreed());
        System.out.println("born on -->" + chicken.getBornOn());
        System.out.println("is molting -->" + chicken.isIsMolting());

    }
}