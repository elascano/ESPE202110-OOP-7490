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
 * @author ALEJANDRO DELACRUZ
 */
public class Farm {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        FarmAnimal farmAnimal;
        
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(15,12,2012);    
        String tecla = null;
        
        System.out.println("------->ALEJANDRO DELACRUZ<-------");
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("Farmanimal is a --> " + farmAnimal.getClass());
        System.out.println("\nFarmanimal --> ");
        System.out.println("Id --> " + farmAnimal.getId());
        System.out.println("Breed --> " + farmAnimal.getBreed());
        System.out.println("Born On --> " + farmAnimal.getBornOn());

        do{
	System.out.println("\n<----- HW18 ----->\n");
	System.out.println("<----------- ALEJANDRO DELACRUZ ----------->");
	System.out.println("\n\t menu: \n");
	System.out.println("\t1. Add Chicken: \n");
	System.out.println("\t2. Add Sheep: \n");
	System.out.println("\t3. Add Pig: \n");
	System.out.println("\t4. Add Cow: \n");
        System.out.println("\t5. Show all chickens in the coop: \n");
        
        int option;
        
        option = read.nextInt();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("d/MM/yyyy");

	boolean opc = (option <= 5);
	if (opc) {
            
            switch(option){                
            case 1:
                
                System.out.println("\n\n Enter Data of Chicken --> ");        
                System.out.println("Enter ID --->");
                id = read.nextInt();

                
                System.out.println("Enter Name --->");
                breed = read.next();

                
                System.out.println("Enter Year Born On --->");
                String dateString = read.next();
                LocalDate localDate = LocalDate.parse(dateString, formatter);
                farmAnimal.AddChicken(id, breed, bornOn);

            break;
            case 2: 
                System.out.println("\n\n Enter data for Sheep --> ");        
                
                int idSheep;
                String breedSheep;
                
                System.out.println("Enter ID --->");
                idSheep = read.nextInt();

                System.out.println("Enter Name --->");
                breedSheep = read.next();

                System.out.println("last year he got a haircut --->");
                String dateString1 = read.next();
                LocalDate lastSheering = LocalDate.parse(dateString1, formatter);

                System.out.println("year of birth?  --->");
                String dateString5 = read.next();
                LocalDate bornOnSheep = LocalDate.parse(dateString5, formatter);
                
                farmAnimal = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);
                
                        
                System.out.println(" Farmanimal is  " + farmAnimal.getClass());
                Sheep sheep = new Sheep(lastSheering, idSheep, breedSheep, bornOnSheep);

                System.out.println(" Farmanimal is  " + sheep.getClass());
                System.out.println("\n Farmanimal --> ");
                System.out.println("ID --> " + sheep.getId());
                System.out.println("Breed --> " + sheep.getBreed());
                System.out.println("Last Haircut --> " + sheep.getBornOn());
                System.out.println("Born On --> " + sheep.getLastSheering());
                     
            break;
            case 3:
                int idPig;
                String breedPig;
                int weight;
                
                System.out.println("\n\n enter data for Pig --> ");        

                System.out.println("Enter ID --->");
                idPig = read.nextInt();

                System.out.println("Enter Name --->");
                breedPig = read.next();

                System.out.println("Enter Year Born On --->");
                String dateString2 = read.next();
                LocalDate bornOnPig = LocalDate.parse(dateString2, formatter);
                
                System.out.println("Enter Weight --->");
                weight = read.nextInt();
                
                farmAnimal = new Pig(weight, idPig, breedPig, bornOnPig);
                
                System.out.println(" Farmanimal is  " + farmAnimal.getClass());
                Pig pig = new Pig(weight, idPig, breedPig, bornOnPig);

                System.out.println(" Farmanimal is  " + pig.getClass());
                System.out.println("\n Farmanimal --> ");
                System.out.println("ID --> " + pig.getId());
                System.out.println("Breed --> " + pig.getBreed());
                System.out.println("Born On --> " + pig.getBornOn());
                System.out.println("Weight --> " + pig.getWeight());
		
            break;
            case 4:
                System.out.println("\n\n Enter data for Cow --> ");        

                int idCow;
                String breedCow;
                boolean isMolting = true;
                
                System.out.println("Enter ID --->");
                idCow = read.nextInt();

                System.out.println("Enter Name --->");
                breedCow = read.next();

                System.out.println("Enter Year Born On --->");
                String dateString3 = read.next();
                LocalDate bornOnCow = LocalDate.parse(dateString3, formatter);
                

                farmAnimal = new Cow(isMolting, idCow, breedCow, bornOnCow);
                System.out.println(" Farmanimal is a " + farmAnimal.getClass());
                Cow cow = new Cow(isMolting, idCow, breedCow, bornOnCow);

                System.out.println(" Farmanimal is a " + cow.getClass());
                System.out.println("\n Farmanimal --> ");
                System.out.println("ID --> " + cow.getId());
                System.out.println("Breed --> " + cow.getBreed());
                System.out.println("Born On --> " + cow.getBornOn());
                System.out.println("Produce Milk --> " + cow.isIsProducingMilk());
		
            break;
            case 5: 
                    
                    System.out.println("the information for all chickens is--> \n");
                    farmAnimal.Print();
                    
            break;
            }
            } else {
            System.out.println("Enter a Number from 1 to 5."); 
            }
            System.out.println("\n\t Do u' want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));
    }   
}