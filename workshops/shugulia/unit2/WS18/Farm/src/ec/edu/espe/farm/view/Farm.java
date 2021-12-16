
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmSystem;
import java.time.LocalDate;

/**
 *
 * @author Alan
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmSystem farmAnimal;
        int id = 0;
        String breed = "any";
        LocalDate born0n = LocalDate.of(2021,12,15);
        
        FarmSystem farmSystem = new FarmSystem(0, breed, born0n);
        
        System.out.println("farmSystem is a " + farmSystem.getId());
        System.out.println("farmSystem ->");
        System.out.println("id         ->" + farmSystem.getId());
        System.out.println("breed      ->" + farmSystem.getBreed());
        System.out.println("born 0n    ->" + farmSystem.getBorn0n());
        
        id = 1;
        breed = "Playmount";
        born0n = LocalDate.of(2020,06,20);
        boolean isMolting = true;
        
        farmSystem = new Chicken(true, id, breed, born0n); 
        System.out.println("farmSystem is a " + farmSystem.getClass());
        
        Chicken chicken = new Chicken(isMolting, id, breed, born0n);
        
        System.out.println("farmSystem is a " + chicken.getClass());
        
        System.out.println("farmSystem ->");
        System.out.println("id         ->" + farmSystem.getId());
        System.out.println("breed      ->" + farmSystem.getBreed());
        System.out.println("born 0n    ->" + farmSystem.getBorn0n());
        System.out.println("isMolting  ->" + farmSystem.getisMolting());
    }
    
}
