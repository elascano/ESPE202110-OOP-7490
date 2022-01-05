

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
 * @author darling.cruz
 */
public class Farm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        FarmAnimal farmAnimal;
        
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);    
        String tecla = null;
        
        System.out.println("Darling Cruz");
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("FarmAnimal " + farmAnimal.getClass());
        System.out.println("\nFarmAnimal --> ");
        System.out.println("id --> " + farmAnimal.getId());
        System.out.println("Breed --> " + farmAnimal.getBreed());
        System.out.println("Born On --> " + farmAnimal.getBornOn());

        do{
	System.out.println("animal");
	System.out.println("Darling Farm");
	System.out.println("Menu \n");
	System.out.println("1.-Add Chicken:");
	System.out.println("2.-Add Sheep:");
	System.out.println("3.-Add Pig:");
	System.out.println("4.-Add Cow:");
        System.out.println("5.-Show chickens");
        
        int option;
        
        option = read.nextInt();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yy/dd/MM");

	boolean opc = (option <= 5);
	if (opc) {
            
            switch(option){                
            case 1:
                System.out.println("\n\nPlease Enter Data for Chicken --> ");        

                System.out.println("Enter id --->");
                id = read.nextInt();

                System.out.println("Enter name --->");
                breed = read.next();

                System.out.println("Enter date in number ---> ");
                int date = read.nextInt(); 
                System.out.println("Enter month in number ---> ");
                int month = read.nextInt();
                System.out.println("Enter Year in number ---> ");
                int year = read.nextInt();
                bornOn = LocalDate.of(year,month,date);
               
                farmAnimal.AddChicken(id, breed, bornOn);

            break;
            case 2: 
                System.out.println("Enter data for Sheep --> ");        
                
                int idSheep;
                String breedSheep;
                
                System.out.println("Enter id --->");
                idSheep = read.nextInt();

                System.out.println("Enter name --->");
                breedSheep = read.next();

                System.out.println("Enter year Last Haircut --->");
                String dateString1 = read.next();
                LocalDate lastSheering = LocalDate.parse(dateString1, formatter);

                System.out.println("Enter year Born On --->");
                String dateString5 = read.next();
                LocalDate bornOnSheep = LocalDate.parse(dateString5, formatter);
                
                farmAnimal = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);
                
                        
                System.out.println(" Farm Animal is a " + farmAnimal.getClass());
                Sheep sheep = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);

                System.out.println(" farmAnimal is a " + sheep.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println("ID --> " + sheep.getId());
                System.out.println("Breed --> " + sheep.getBreed());
                System.out.println("Last Haircut --> " + sheep.getBornOn());
                System.out.println("Born On --> " + sheep.getLastSheering());
                     
            break;
            case 3:
                int idPig;
                String breedPig;
                int weight;
                
                System.out.println("Enter data for Pig --> ");        

                System.out.println("Enter id --->");
                idPig = read.nextInt();

                System.out.println("Enter name --->");
                breedPig = read.next();

                System.out.println("Enter year Born On --->");
                String dateString2 = read.next();
                LocalDate bornOnPig = LocalDate.parse(dateString2, formatter);
                
                System.out.println("Enter weight --->");
                weight = read.nextInt();
                
                farmAnimal = new Pig(weight, idPig, breedPig, bornOnPig);
                
                System.out.println(" farmAnimal is a " + farmAnimal.getClass());
                Pig pig = new Pig(weight, idPig, breedPig, bornOnPig);

                System.out.println(" farmAnimal is a " + pig.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println("id --> " + pig.getId());
                System.out.println("Breed --> " + pig.getBreed());
                System.out.println("Born On --> " + pig.getBornOn());
                System.out.println("Weight --> " + pig.getWeight());
		
            break;
            case 4:
                System.out.println("Enter data for Cow --> ");        

                int idCow;
                String breedCow;
                boolean isMolting = true;
                
                System.out.println("Enter id --->");
                idCow = read.nextInt();

                System.out.println("Enter name --->");
                breedCow = read.next();

                System.out.println("Enter year Born On --->");
                String dateString3 = read.next();
                LocalDate bornOnCow = LocalDate.parse(dateString3, formatter);
                

                farmAnimal = new Cow(isMolting, idCow, breedCow, bornOnCow);
                System.out.println(" farmAnimal is a " + farmAnimal.getClass());
                Cow cow = new Cow(isMolting, idCow, breedCow, bornOnCow);

                System.out.println(" farmAnimal is a " + cow.getClass());
                System.out.println("\n farmAnimal --> ");
                System.out.println("id --> " + cow.getId());
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
            System.out.println("Enter a Number from 1 to 5."); 
            }
            System.out.println("\n\tDo you want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));
    }   
}