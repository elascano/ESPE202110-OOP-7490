package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.FarmAnimal;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Farm {
        static Scanner scanner = new Scanner(System.in); 
        static int select = -1; 
    public static void main(String[] args) {

        
        FarmAnimal farmAnimal;
        int id=0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("FarmAnimal is a  --->" + farmAnimal.getClass());
        System.out.println("Id ---->" + farmAnimal.getId());
        System.out.println("Breed ---->" + farmAnimal.getBreed());
        System.out.println("Born On ---->" + farmAnimal.getBornOn());
        
    
     while(select != 0){
            
            try{
            System.out.println("1----Add Chicken----");
            System.out.println("2----Show Animals----");
            System.out.println("0----Exit----");
            
             select = Integer.parseInt(scanner.nextLine()); 
    
          
            switch(select){
            case 1 -> {
        boolean isMolting = true;
        Chicken chicken = new Chicken(isMolting, id, breed, bornOn); 
        System.out.println("FarmAnimal is a  --->" + farmAnimal.getClass());
        System.out.println("Chicken --->");
        Scanner add = new Scanner(System.in);
        System.out.println("- id  --> ");
        id = add.nextInt();
        farmAnimal.add(chicken);
        System.out.println("FarmAnimal is a  --->" + farmAnimal.getClass());
                    
                    }
                case 2 -> {
                    
                    
                    }
                case 0 -> {
                    
                    
                    }
                default -> System.out.println("try again");
                }
                
                System.out.println("\n"); 
                
            }catch(NumberFormatException e){
            
            }
        }

    }
}
    

