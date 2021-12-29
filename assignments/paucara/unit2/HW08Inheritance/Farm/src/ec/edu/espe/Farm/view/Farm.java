package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.Cow;
import ec.edu.espe.Farm.model.FarmAnimal;
import ec.edu.espe.Farm.model.Pig;
import ec.edu.espe.Farm.model.Sheep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class Farm {

    public static void main(String[] args) {
        int number;
        int option;
        int id = 0;
        float weigth = 0;
        boolean isMolting = true;
        boolean isProducingMilk = true;
        String breed = "";
        LocalDate bornOn = LocalDate.now();
        LocalDate lastSheering = LocalDate.now();
        Scanner teclado = new Scanner(System.in);

        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        
        chicken = new Chicken(isMolting, chickens, id, breed, bornOn, farmAnimals);
        cow = new Cow(isProducingMilk, cows, id, breed, bornOn, farmAnimals);
        pig = new Pig(weigth, pigs, id, breed, bornOn, farmAnimals);
        sheep = new Sheep(lastSheering, sheeps, id, breed, bornOn, farmAnimals);
        farmAnimal = new FarmAnimal (id, breed, bornOn, farmAnimals);
        
        System.out.println("--> WS08 Inheritance <--  --> Javier Paucar <--");
        System.out.println("Do you want to enter the menu? ->  \n 1 --> YES \n 0 --> NO");
        number = teclado.nextInt();

        while (number == 1) {
            System.out.println("OPTIONS : ");
            System.out.println("\n1--> Add Chickens\n2--> Add Cows\n3--> Add Pigs\n4--> Add Sheeps\n5-->Show Animals\n6--> Exit");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("--> Please enter the chicken data <--");
                System.out.println("id         ->");
                id = teclado.nextInt();
                System.out.println("breed      ->");
                breed = teclado.next();
                System.out.println("born On    ->" + bornOn);
                System.out.println("is Molting ->");
                isMolting = teclado.nextBoolean();
                chicken = new Chicken(isMolting, chickens, id, breed, bornOn, farmAnimals);
                chicken.add(chicken);
                System.out.println("\n chicken -->" + chicken);
                System.out.println("\n");
            }

            if (option == 2) {
                System.out.println("--> Please enter the cow data <--");
                System.out.println("id                ->");
                id = teclado.nextInt();
                System.out.println("breed             ->");
                breed = teclado.next();
                System.out.println("born On           ->" + bornOn);
               
                System.out.println("is Producing Milk ->");
                isProducingMilk = teclado.nextBoolean();
                cow = new Cow(isProducingMilk, cows, id, breed, bornOn, farmAnimals);
                System.out.println("\n cow -->" + cow);
                System.out.println("\n");

            }

            if (option == 3) {
                System.out.println("--> Please enter the pig data <--");
                System.out.println("id                ->");
                id = teclado.nextInt();
                System.out.println("breed             ->");
                breed = teclado.next();
                System.out.println("born On           ->" + bornOn);
                
                System.out.println("weigth            ->");
                weigth = teclado.nextFloat();
                pig = new Pig(weigth, pigs, id, breed, bornOn, farmAnimals);
                System.out.println("\n pig -->" + pig);
                System.out.println("\n");

            }

            if (option == 4) {
                System.out.println("--> Please enter the sheep data <--");
                System.out.println("id                ->");
                id = teclado.nextInt();
                System.out.println("breed             ->");
                breed = teclado.next();
                System.out.println("born On:          ->" + bornOn);
                System.out.println("last sheering     ->" + lastSheering);
                sheep = new Sheep(lastSheering, sheeps, id, breed, bornOn, farmAnimals);
                System.out.println("\n pig -->" + sheep);
                System.out.println("\n");

            }

            if (option == 5) {
                System.out.println("Added Animals");
                chicken = new Chicken(isMolting, chickens, id, breed, bornOn, farmAnimals);
                cow = new Cow(isProducingMilk, cows, id, breed, bornOn, farmAnimals);
                pig = new Pig(weigth, pigs, id, breed, bornOn, farmAnimals);
                sheep = new Sheep(lastSheering, sheeps, id, breed, bornOn, farmAnimals);
                System.out.println("Chicken List ->" + chickens);
            }
            
            if (option == 6){
                break;
            }
        }  
    }
}