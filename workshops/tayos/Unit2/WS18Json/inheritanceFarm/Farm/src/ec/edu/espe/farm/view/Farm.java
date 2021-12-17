
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;

/**
 *
 * @author Sebas
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Chicken chiken;
        
        int id =0;
        String breed ="any"; 
        LocalDate bornOn=LocalDate.of(2021,12,12);
        boolean isProductMilk =true;
        float weigth = 10;
        LocalDate lastSheering =LocalDate.of(2021,12,10); 
        
        
        System.out.println("author Sebastian Tayo");
        cow = new Cow(id, breed, bornOn, isProductMilk);
        System.out.println("farmAnimal is a --->" +cow.getClass());
        System.out.println("Farm animal es a --->"+cow.getClass());
        System.out.println("Farm Animal--> ");
        System.out.println(" id---> "+cow.getId());    
        System.out.println(" breed--->"+cow.getBreed());
        System.out.println(" bornOn--->" +cow.getBornOn());
        System.out.println("isProductMilk--->" +cow.isIsProducingMilk());
        
        pig = new Pig(weigth, id, breed, bornOn);
        System.out.println("farmAnimal is a --->" +pig.getClass());
        System.out.println("Farm animal es a --->"+pig.getClass());
        System.out.println("the weigth is --->"+pig.getWeight());
        System.out.println("The id is --->"+pig.getId());
        System.out.println(" breed is a --->"+pig.getBreed());
        System.out.println("bornOn --->"+pig.getBornOn());
        
        sheep = new Sheep(lastSheering, id, breed, bornOn);
        System.out.println("farmAnimal is a --->" +sheep.getClass());
        System.out.println(" breed is a --->"+sheep.getBreed());
        System.out.println(" breed is a --->"+sheep.getBreed());
        System.out.println("bornOn --->"+sheep.getBornOn());
        
        farmAnimal = new FarmAnimal(id, breed, bornOn);
        System.out.println("farmAnimal is a --->" +farmAnimal.getClass());
        System.out.println("farmAnimal--->" );
        System.out.println("id--->"+farmAnimal.getId());
        System.out.println("breed-->"+farmAnimal.getBreed());
        System.out.println("bornOn----->" +farmAnimal.getBornOn());
        id =1;
        breed ="Playmouth"; 
        bornOn=LocalDate.of(2020,06,20);
        boolean isMolting =true;
        
        System.out.println("farmAnimal is a --->" +farmAnimal.getClass());
        
        Chicken chicken = new Chicken(isMolting, id, breed, bornOn);
        
        System.out.println("farmAnimal is a --->"+farmAnimal.getClass());
        
        System.out.println("farmAnimal--->" );
        System.out.println("id--->"+chicken.getId());
        System.out.println("breed-->"+chicken.getBreed());
        System.out.println("bornOn----->" +chicken.getBornOn());
        System.out.println("isMolting--->" +chicken.isIsMolting());
        
        
        
        
    }
    
    
}