package ec.edu.espe.farm.view;
import ec.edu.espe.farm.control.Chicken;
import ec.edu.espe.farm.control.Coop;
import ec.edu.espe.farm.control.Cow;
import ec.edu.espe.farm.control.FarmAnimal;
import ec.edu.espe.farm.control.Pig;
import ec.edu.espe.farm.control.Sheep;
import java.time.LocalDate;

import java.util.Scanner;
/**
 *
 * @author Guitarra Jhon
 */
public class Farm {
    public static void main(String[] args) {
        int id=0;
        int date=0;
        int month=0;
        int year= 0;
        int age=0;
        String breed ="";
        boolean molting = true;
        LocalDate bornOn = LocalDate.of(2021,12,15);
        
        FarmAnimal farmAnimal;
              
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;

        while(true){

            System.out.println("GUITARRA JHON");
            System.out.println("Menu");
            System.out.println("1 .- Insert chickens");
            System.out.println("2 .- Insert cow");
            System.out.println("3 .- Insert Pig");
            System.out.println("4 .- Inster Sheep");    
            System.out.println("5 .- Exit");

            Scanner read = new Scanner(System.in);
            
            int option = read.nextInt();
            
            if(option == 1){
                System.out.println("Enter the Data of Chicken:");
                System.out.println("id ---> ");
                id = read.nextInt();
                System.out.println("breed --->   ");
                breed = read.next();
                System.out.println("Born :");
                System.out.println("Date --->   ");
                date = read.nextInt();
                System.out.println("Month --->  ");
                month = read.nextInt();
                System.out.println("Year --->   ");
                year = read.nextInt();
                bornOn = LocalDate.of(year,month,date);
                molting = true;
                
                farmAnimal = new Chicken(molting,id,breed,bornOn);

                System.out.println(farmAnimal.getBreed());
            }
            else if(option == 2){
                System.out.println("Enter the Data of Cow:");   
                System.out.println("id ---> ");
                id = read.nextInt();
                System.out.println("breed --->   ");
                breed = read.next();
                System.out.println("Born :");
                System.out.println("Date --->   ");
                date = read.nextInt();
                System.out.println("Month --->  ");
                month = read.nextInt();
                System.out.println("Year --->   ");
                year = read.nextInt();
                bornOn = LocalDate.of(year,month,date);
                molting = true;
                
                farmAnimal = new Cow(molting,id,breed,bornOn);

                System.out.println(farmAnimal.getBreed());
            }
            else if(option == 3){
                System.out.println("Enter the Data of Pig:"); 
                System.out.println("id ---> ");
                id = read.nextInt();
                System.out.println("breed --->   ");
                breed = read.next();
                System.out.println("Born :");
                System.out.println("Date --->   ");
                date = read.nextInt();
                System.out.println("Month --->  ");
                month = read.nextInt();
                System.out.println("Year --->   ");
                year = read.nextInt();
                bornOn = LocalDate.of(year,month,date);
                molting = true;
                
                farmAnimal = new Pig(molting,id,breed,bornOn);

                System.out.println(farmAnimal.getBreed());
            }
            else if(option == 4){
                System.out.println("Enter the Data of Sheep:");
                System.out.println("id ---> ");
                id = read.nextInt();
                System.out.println("breed --->   ");
                breed = read.next();
                System.out.println("Born :");
                System.out.println("Date --->   ");
                date = read.nextInt();
                System.out.println("Month --->  ");
                month = read.nextInt();
                System.out.println("Year --->   ");
                year = read.nextInt();
                bornOn = LocalDate.of(year,month,date);
                molting = true;
                
                farmAnimal = new Sheep(bornOn,id,breed,bornOn);

                System.out.println(farmAnimal.getBreed());                
            }
            else if(option == 5){
                break;                
            }
        } 
    }
}
