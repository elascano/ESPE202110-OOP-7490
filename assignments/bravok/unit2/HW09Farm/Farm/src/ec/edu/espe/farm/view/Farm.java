package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Katherin Bravo
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-> HW09Farm - Bravo Katherin");
        ArrayList<Chicken> chickens= new ArrayList<>();        
        
        FarmAnimal farmAnimal;    
        int id= 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);
           
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
      
            System.out.println(" Bravo Katherin");
            System.out.println("Farm Menu");
            System.out.println("1 .-  Add chickens");
            System.out.println("2 .-  Show chickens");
            System.out.println("5 .-  Exit");

            Scanner read = new Scanner(System.in);
            int option = read.nextInt();
        
        System.out.println("farmAnimal is a" + farmAnimal.getClass());
        System.out.println("farmAnimal -> ");
        System.out.println("id      ->" + farmAnimal.getId());
        System.out.println("breed   ->" + farmAnimal.getBreed());
        System.out.println("born On ->" + farmAnimal.getBornOn());
        
        id = 1;
        breed = "Playmount";
        bornOn = LocalDate.of(2020,06,20);
        boolean isMolting = true;
        
        farmAnimal = new Chicken(isMolting, id, breed, bornOn);
        System.out.println(" farmAnimal is a" + farmAnimal.getClass());
                
        Chicken chicken = new Chicken(isMolting, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + chicken.getClass());
        
        System.out.println("farmAnimal ->");
        System.out.println("id         ->" + chicken.getId());
        System.out.println("breed      ->" + chicken.getBreed());
        System.out.println("born On    ->" + chicken.getBornOn());
        System.out.println("isMolting  ->" + chicken.isIsMolting());
        
        id = 2 ;
        breed = "Holstein";
        bornOn = LocalDate.of(2020,12,12);
        boolean isProducingMilk = true;
        
        farmAnimal = new Cow(isProducingMilk, id, breed, bornOn);
        System.out.println(" farmAnimal is a" + farmAnimal.getClass());
                
        Cow cow = new Cow(isProducingMilk, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + cow.getClass());
        
        System.out.println("farmAnimal ->");
        System.out.println("id         ->" + cow.getId());
        System.out.println("breed      ->" + cow.getBreed());
        System.out.println("born On    ->" + cow.getBornOn());
        System.out.println("isMolting  ->" + cow.isIsProducingMilk());
        
        id = 3 ;
        breed = "Dorper";
        bornOn = LocalDate.of(2019,01,30);
        LocalDate lastSheering=LocalDate.of(2021,10,10);
        
        
        farmAnimal = new Sheep(lastSheering, id, breed, bornOn);
        System.out.println(" farmAnimal is a" + farmAnimal.getClass());
                
        Sheep sheep = new Sheep(lastSheering, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + sheep.getClass());
        
        System.out.println("farmAnimal ->");
        System.out.println("id         ->" + sheep.getId());
        System.out.println("breed      ->" + sheep.getBreed());
        System.out.println("born On    ->" + sheep.getBornOn());
        System.out.println("isMolting  ->" + sheep.getLastSheering());
        
        id = 4 ;
        breed = "Llarge White";
        bornOn = LocalDate.of(2021,09,25);
        float weight = 50;
        
        
        farmAnimal = new Pig(weight, id, breed, bornOn);
        System.out.println(" farmAnimal is a" + farmAnimal.getClass());
                
        Pig pig = new Pig(weight, id, breed, bornOn);
        System.out.println(" farmAnimal is a " + pig.getClass());
        
        System.out.println("farmAnimal ->");
        System.out.println("id         ->" + pig.getId());
        System.out.println("breed      ->" + pig.getBreed());
        System.out.println("born On    ->" + pig.getBornOn());
        System.out.println("isMolting  ->" + pig.getWeight());
                  
       
    }
    
}