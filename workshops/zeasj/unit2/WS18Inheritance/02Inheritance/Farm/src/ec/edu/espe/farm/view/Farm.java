package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Joel Zeas
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2020, 12, 15);
        farmAnimal = new FarmAnimal(0, breed, bornOn);

        System.out.println("Joel Zeas HW08");
        System.out.println("farmAnimal -> ");
        System.out.println("id -> " + farmAnimal.getId());
        System.out.println("breed -> " + farmAnimal.getBreed());
        System.out.println("born On -> " + farmAnimal.getBornOn());

        id = 1;
        breed = "Playmount";
        bornOn = LocalDate.of(2020, 06, 20);
        boolean isMolting = true;

        farmAnimal = new Chicken(isMolting, id, breed, bornOn);

        System.out.println("farmAnimal is a " + farmAnimal.getClass());

        Chicken chicken = new Chicken(isMolting, id, breed, bornOn);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());

        System.out.println("farmAnimal ->");
        System.out.println("id ->" + chicken.getId());
        System.out.println("breed ->" + chicken.getBreed());
        System.out.println("born On ->" + chicken.getBornOn());
        System.out.println("isMolting ->" + chicken.isIsMolting());

    }
}
