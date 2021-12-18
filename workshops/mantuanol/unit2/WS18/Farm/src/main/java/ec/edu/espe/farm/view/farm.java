package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;

/**
 *
 * @author Leonel Mantuano
 */
public class farm {
    public static void main(String[] argas){
        FarmAnimal farmAnimal;
        
       int id=0;
       String breed="any";
       LocalDate bornOn = LocalDate.of(2021,12,15);
            
        
        farmAnimal =new FarmAnimal(0,breed,bornOn);
    
        System.out.println("farmAnimal is a "+farmAnimal.getClass());
        System.out.println("\nfarmAnimal->");
        System.out.println("id      ->" +farmAnimal.getId());
        System.out.println("breed   ->" +farmAnimal.getBreed());
        System.out.println("born On ->" +farmAnimal.getBornOn());
    
        id=1;
        breed="Playmount";
        bornOn = LocalDate.of(2020,06,20);
        boolean isMolting = true;
        farmAnimal=new Chicken(id, breed, bornOn, isMolting);
        
        System.out.println("\nfarmAnimal is a " + farmAnimal.getClass());
        
        Chicken chicken= new Chicken(id, breed, bornOn, isMolting);
        
        System.out.println("\nfarmAnimal is a" + chicken.getClass());
        
        System.out.println("\nfarmAnimal2 ->");
        System.out.println("id         ->" +chicken.getId());
        System.out.println("breed      ->" +chicken.getBreed());
        System.out.println("born On    ->" +chicken.getBornOn());
        System.out.println("isMolting: ->"+chicken.isIsMolting());
    }
    
}
