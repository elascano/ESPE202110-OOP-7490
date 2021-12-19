package ec.edu.espe.farm.view;

import ec.edu.espe.farm.control.Chicken;
import ec.edu.espe.farm.control.Cow;
import ec.edu.espe.farm.control.FarmAnimal;
import ec.edu.espe.farm.control.Pig;
import ec.edu.espe.farm.control.Sheep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import java.time.LocalDate;

/**
 *
 * @author darling.Cruzz
 */

public class Farm {
    public static void main(String[] args) {
        FarmAnimal FarmAnimal ;
        int id =0;
        String breed ="badbunny";
        LocalDate bornOn = LocalDate.of(2021,12,15);

        
        FarmAnimal = new FarmAnimal(0,breed,bornOn);
        
        
         while(true){
        
            int option = 0;       
            int id = 1;
            String name= "Lucy";
            String BornOn="white and brown";
            int age = 2;
            boolean molting = true;

        System.out.println("farmAnimal is a "+FarmAnimal.getClass());
        System.out.println("farAnimal  ->");
        System.out.println("id      ->"+FarmAnimal.getId());
        System.out.println("breed   ->"+FarmAnimal.getBreed());
        System.out.println("born On ->"+FarmAnimal.getBornOn());
        
        id =1;
        breed ="badbunny";
        bornOn = LocalDate.of(2001,03,04);
        boolean isMolting = false;
        
        FarmAnimal = new Chicken(id,breed,bornOn,isMolting);
        
        System.out.println("farmAnimal is a "+FarmAnimal.getClass());
        
        Chicken chicken = new Chicken(id,breed,bornOn,isMolting);
        System.out.println("farmAnimal is a "+chicken.getClass());       
        
        System.out.println("farmAnimal  ->");
        System.out.println("id      ->"+chicken.getId());
        System.out.println("breed   ->"+chicken.getBreed());
        System.out.println("born On ->"+chicken.getBornOn());
        System.out.println("isMolting ->"+chicken.isIsMolting());
       
          Scanner read = new Scanner(System.in);
          option = read.nextInt();
                
            if (option==1) {
                
                System.out.println("Enter data");
                System.out.println("ID of Animal --->   ");
                id = read.nextInt();
                System.out.println("Breed of Animal --->   ");
                breed = read.next();
                System.out.println("Color of Chicken --->   ");
                bornOn = read.next();
                System.out.println("Age of Chicken --->   ");
                isMolting = read.nextInt();
                
                Chicken chicken = new Chicken(id,breed,bornOn,isMolting);
                
                chicken =new Chicken(id,name,color,age,true);
                 FarmAnimal.add( FarmAnimal);
                }
            
            else if(option==2){
                 FarmAnimal.remove(chicken);  
            }
            else if(option==3){
                System.out.println("chicken in the coop -->" +  FarmAnimal);
            }
            else if(option==4){
                System.out.println("Amount of Chicken  -->" +  FarmAnimal.countFarms());
            }
            else if(option==5){
                break;
            }
               
    }
}