package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.csvreader.CsvWriter;
import ec.edu.espe.farm.model.Chicken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ALEJANDRO DELACRUZ
 */
public class Farm {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        FarmAnimal farmAnimal;
        //Chicken chicken = new Chicken();
        
        int id = 0;
        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021,12,15);    
        String tecla = null;
        
        System.out.println("------->ALEJANDRO DE LA CRUZ<-------");
        farmAnimal = new FarmAnimal(0, breed, bornOn);
        
        System.out.println("FarmAnimal is a " + farmAnimal.getClass());
        System.out.println("\nFarmAnimal --> ");
        System.out.println("ID --> " + farmAnimal.getId());
        System.out.println("Breed --> " + farmAnimal.getBreed());
        System.out.println("Born On --> " + farmAnimal.getBornOn());

        do{
	System.out.println("\n*******************Assigment V*******************\n");
	System.out.println("******ALEJANDRO DE LA CRUZ******");
	System.out.println("\n\tOption menu: \n");
	System.out.println("\t1. Add Chicken and add them to a CSV file: \n");
	System.out.println("\t2. Add Sheep and add them to a CSV file: \n");
	System.out.println("\t3. Add Pig and add them to a CSV file: \n");
	System.out.println("\t4. Add Cow and add them to a CSV file: \n");
        
        int option;
        option = read.nextInt();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("d/MM/yyyy");

	boolean opc = (option <= 4);
	if (opc) {
            
            switch(option){                
            case 1:
                int idChicken;
                String breedChicken = "";
                LocalDate bornOnChicken = LocalDate.of(2021,12,15);   
                ArrayList<Chicken> chickens = new ArrayList();
                Chicken chicken = new Chicken(0,breedChicken,bornOnChicken);
                CsvWriter csvWriter = new CsvWriter("chicken.csv");
                
                System.out.println("\n\nPlease Enter Data for Chicken --> ");        

                System.out.println("Enter ID --->");
                idChicken = read.nextInt();

                System.out.println("Enter Name --->");
                breedChicken = read.next();

                System.out.println("Enter Year Born On --->");
                String dateString = read.next();
                bornOnChicken = LocalDate.parse(dateString, formatter);
                chickens.add(new Chicken(idChicken, breedChicken, bornOnChicken));
                for(Chicken chicken : chickens){
                    String [] csv = chicken.toCsvChicken();
                    csvWriter.writeRecord(csv);
                }
                csvWriter.close();

            break;
            case 2: 
                LocalDate lastSheering = LocalDate.of(2021,12,15);
                int idSheep = 0;
                String breedSheep = "";
                LocalDate bornOnSheep = LocalDate.of(2021,12,15); 
                
                CsvWriter csvWriterSheep = new CsvWriter("Sheep.csv");
                ArrayList<Sheep> sheeps = new ArrayList();
                Sheep sheep = new Sheep(idSheep, breedSheep, lastSheering, bornOnSheep);
                
                System.out.println("\n\nPlease enter data for Sheep --> ");        
                                
                System.out.println("Enter ID --->");
                idSheep = read.nextInt();

                System.out.println("Enter Name --->");
                breedSheep = read.next();

                System.out.println("Enter Year Last Haircut --->");
                String dateString1 = read.next();
                lastSheering = LocalDate.parse(dateString1, formatter);

                System.out.println("Enter Year Born On --->");
                String dateString5 = read.next();
                bornOnSheep = LocalDate.parse(dateString5, formatter);
                
                sheeps.add(new Sheep(idSheep, breedSheep, lastSheering, bornOnSheep));
                
                for(Sheep sheep : sheeps){ 
                    String [] csv = sheep.toCsvSheep();
                    csvWriterSheep.writeRecord(csv);
                }
                csvWriterSheep.close();
    
            break;

            
            case 3:
                int idPig = 0;
                String breedPig = "";
                int weight = 0;
                LocalDate bornOnPig = LocalDate.of(2021,12,15); 
                
                CsvWriter csvWriterPig = new CsvWriter("Pig.csv");
                ArrayList<Pig> pigs = new ArrayList();
                Pig pig = new Pig(idPig, breedPig, bornOnPig, weight);                
                
                System.out.println("\n\nPlease enter data for Pig --> ");        

                System.out.println("Enter ID --->");
                idPig = read.nextInt();

                System.out.println("Enter Name --->");
                breedPig = read.next();

                System.out.println("Enter Year Born On --->");
                String dateString2 = read.next();
                bornOnPig = LocalDate.parse(dateString2, formatter);
                
                System.out.println("Enter Weight --->");
                weight = read.nextInt();
                
                pigs.add(new Pig(idPig, breedPig, bornOnPig, weight));

                for(Pig pig : pigs){
                    String [] csv = pig.toCsvPig();
                    csvWriterPig.writeRecord(csv);
                }
                csvWriterPig.close();		
            break;
            case 4:
                int idCow = 0;
                String breedCow = null;
                boolean isMolting = true;  
                LocalDate bornOnCow = LocalDate.of(2021,12,15); 
                
                CsvWriter csvWriterCow = new CsvWriter("Cow.csv");
                ArrayList<Cow> cows = new ArrayList();
                Cow cow = new Cow(idCow, breedCow, bornOnCow, isMolting);                 
                System.out.println("\n\nPlease enter data for Cow --> ");        

                
                System.out.println("Enter ID --->");
                idCow = read.nextInt();

                System.out.println("Enter Name --->");
                breedCow = read.next();

                System.out.println("Enter Year Born On --->");
                String dateString3 = read.next();
                bornOnCow = LocalDate.parse(dateString3, formatter);
                cows.add(new Cow(idCow, breedCow, bornOnCow, isMolting));

                for(Cow cow : cows){
                    String [] csv = cow.toCsvCow();
                    csvWriterCow.writeRecord(csv);
                }
                csvWriterCow.close();	
                
            break;
            }
            } else {
            System.out.println("Enter a Number from 1 to 4."); 
            }
            System.out.println("\n\tDo you want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));
    }   
}