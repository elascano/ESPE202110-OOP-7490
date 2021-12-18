
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal
        
/**
 *
 * @author mayer
 */
import java.time.LocalDate;
public class Farm {
    
    public static void main(String[] args){
        FarmAnimal farmAnimal;
        int id=0;
        String breed="any";
        LocalDate bornOn= LocalDate.of(2021,12,15);
                
                farmAnimal = new FarmAnimal(0, breed,bornOn);
                
                System.out.println("farmAnimal ->");
                System.out.println("id ---->"+ farmAnimal.getId());
                System.out.println("breed --->"+farmAnimal.getBreed());
                System.out.println("born On --->"+farmAnimal.getBreed());
                
                
                
    }
    Chicken chicken = new Chicken(true, 0, breed, LocalDate.MIN)
}
