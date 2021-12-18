
package ec.edu.espe.farm.view;
        
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales
 */
public class FarmMenu {
    
    public static void main(String[] args) {

        Scanner show = new Scanner(System.in);

        FarmAnimal farmAnimal;
        
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,05);    
        String tecla = null;
        
        
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("FarmAnimal is a " + farmAnimal.getClass());
        System.out.println("\nFarmAnimal --> ");
        System.out.println("ID --> " + farmAnimal.getId());
        System.out.println("Breed --> " + farmAnimal.getBreed());
        System.out.println("Born On --> " + farmAnimal.getBornOn());

        do{
	
        System.out.println("----->Anthony's Farm<-----");
        System.out.println("These are the menu options");
	System.out.println("\n\tOption menu: \n");
	System.out.println("\t1. Add Chicken: \n");
	System.out.println("\t2. Add Sheep: \n");
	System.out.println("\t3. Add Pig: \n");
	System.out.println("\t4. Add Cow: \n");
        System.out.println("\t5. Show chickens in the coop: \n");
        
        int option;
        
        option = show.nextInt();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

	boolean opc = (option <= 5);
	if (opc) {
            
            switch(option){                
            case 1:
                System.out.println("\n\nEnter data for chicken: ");        

                System.out.println("Enter ID: ");
                id = show.nextInt();

                System.out.println("Enter Name: ");
                breed = show.next();

                System.out.println("Enter Year Born On: ");
                String dateString = show.next();
                LocalDate localDate = LocalDate.parse(dateString, formatter);
                farmAnimal.AddChicken(id, breed, bornOn);

            break;
            case 2: 
                System.out.println("\n\nEnter data for Sheep --> ");        
                
                int idSheep;
                String breedSheep;
                
                System.out.println("Enter ID: ");
                idSheep = show.nextInt();

                System.out.println("Enter Name: ");
                breedSheep = show.next();

                System.out.println("Enter Year Last Haircut: ");
                String dateString1 = show.next();
                LocalDate lastSheering = LocalDate.parse(dateString1, formatter);

                System.out.println("Enter Year Born On: ");
                String dateString5 = show.next();
                LocalDate bornOnSheep = LocalDate.parse(dateString5, formatter);
                
                farmAnimal = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);
                
                        
                System.out.println(" farmAnimal is a " + farmAnimal.getClass());
                Sheep sheep = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);

                System.out.println(" farmAnimal is a " + sheep.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println(" The ID is  --> " + sheep.getId());
                System.out.println("Breed --> " + sheep.getBreed());
                System.out.println("Last Haircut --> " + sheep.getBornOn());
                System.out.println("Born On --> " + sheep.getLastSheering());
                     
            break;
            case 3:
                int idPig;
                String breedPig;
                int weight;
                
                System.out.println("\n\nEnter data for Pig --> ");        

                System.out.println("Enter the  ID: ");
                idPig = show.nextInt();

                System.out.println("Enter the Name: ");
                breedPig = show.next();

                System.out.println("Enter Year Born On: ");
                String dateString2 = show.next();
                LocalDate bornOnPig = LocalDate.parse(dateString2, formatter);
                
                System.out.println("Enter Weight: ");
                weight = show.nextInt();
                
                farmAnimal = new Pig(weight, idPig, breedPig, bornOnPig);
                
                System.out.println(" farmAnimal is a " + farmAnimal.getClass());
                Pig pig = new Pig(weight, idPig, breedPig, bornOnPig);

                System.out.println(" farmAnimal is a " + pig.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println("ID --> " + pig.getId());
                System.out.println("Breed --> " + pig.getBreed());
                System.out.println("Born On --> " + pig.getBornOn());
                System.out.println("Weight --> " + pig.getWeight());
		
            break;
            case 4:
                System.out.println("\n\nEnter data for Cow: ");        

                int idCow;
                String breedCow;
                boolean isMolting = true;
                
                System.out.println("Enter ID: ");
                idCow = show.nextInt();

                System.out.println("Enter Name: ");
                breedCow = show.next();

                System.out.println("Enter Year Born On: ");
                String dateString3 = show.next();
                LocalDate bornOnCow = LocalDate.parse(dateString3, formatter);
                

                farmAnimal = new Cow(isMolting, idCow, breedCow, bornOnCow);
                System.out.println(" farmAnimal is a " + farmAnimal.getClass());
                Cow cow = new Cow(isMolting, idCow, breedCow, bornOnCow);

                System.out.println(" farmAnimal is a " + cow.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println("ID --> " + cow.getId());
                System.out.println("Breed --> " + cow.getBreed());
                System.out.println("Born On --> " + cow.getBornOn());
                System.out.println("Produce Milk --> " + cow.isIsProducingMilk());
		
            break;
            case 5: 
                    
                    System.out.println("All Your Data is Chicken--> \n");
                    farmAnimal.Print();
                    
            break;
            }
            } else {
            System.out.println("Only enter a Number from 1 to 5."); 
            }
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));
    }   
}

