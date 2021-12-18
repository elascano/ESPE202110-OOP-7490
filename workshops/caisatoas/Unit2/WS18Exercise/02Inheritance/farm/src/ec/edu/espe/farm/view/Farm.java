
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;

/**
 *
 * @author Caisatoa
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        System.out.println("------->Sebastian Caisatoa<-------");
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        System.out.println("\n farmAnimal --> ");
        System.out.println("id --> " + farmAnimal.getId());
        System.out.println("breed --> " + farmAnimal.getBreed());
        System.out.println("born On --> " + farmAnimal.getBornOn());
        
        id = 1;
        breed = "Holstein";
        bornOn = LocalDate.of(2020,12,12);
        boolean isMolting = true;
        farmAnimal = new Cow(isMolting, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + farmAnimal.getClass());
        Cow cow = new Cow(false, id, breed, bornOn);
        
        System.out.println(" farmAnimal is a " + cow.getClass());
        System.out.println("\n farmAnimal --> ");
        System.out.println("id --> " + cow.getId());
        System.out.println("breed --> " + cow.getBreed());
        System.out.println("born On --> " + cow.getBornOn());
        System.out.println("isMolting --> " +cow.isIsProducingMilk());
        
        id = 2; ///----------
        breed = "Plymouth";
        bornOn = LocalDate.of(2020,06,27);
        boolean isMolting1 = false;
        farmAnimal = new Chicken(isMolting1, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + farmAnimal.getClass());
        Chicken chicken = new Chicken(false, id, breed, bornOn);
        
        System.out.println(" farmAnimal is a " + chicken.getClass());
        System.out.println("\n farmAnimal --> ");
        System.out.println("id --> " + chicken.getId());
        System.out.println("breed --> " + chicken.getBreed());
        System.out.println("born On --> " + chicken.getBornOn());
        System.out.println("isMolting --> " +chicken.isIsMolting());
        
        id = 3;    //-----
        LocalDate lastSheering = LocalDate.of(2019,01,30);
        breed = "Dorper";
        bornOn = LocalDate.of(2021,10,10);
        farmAnimal = new Sheep(lastSheering, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + farmAnimal.getClass());
        Sheep sheep = new Sheep(lastSheering, id, breed, bornOn);
        
        System.out.println("farmAnimal is a " + sheep.getClass());
        System.out.println("\n farmAnimal --> ");
        System.out.println("id --> " + sheep.getId());
        System.out.println("breed --> " + sheep.getBreed());
        System.out.println("born On --> " + sheep.getBornOn());
        System.out.println("last Sheering --> " + sheep.getLastSheering());
                
        id = 4; ///////-------
        breed = "Dorper";
        bornOn = LocalDate.of(2021,10,10);
        float weight = 50;
        farmAnimal = new Pig(weight, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + farmAnimal.getClass());
        Pig pig = new Pig(weight, id, breed, bornOn);
        
        System.out.println("farmAnimal is a " + pig.getClass());
        System.out.println("\n farmAnimal --> ");
        System.out.println("id --> " + pig.getId());
        System.out.println("breed --> " + pig.getBreed());
        System.out.println("born On --> " + pig.getBornOn());
        System.out.println("Weight --> " + pig.getWeight());
    }
    
}
