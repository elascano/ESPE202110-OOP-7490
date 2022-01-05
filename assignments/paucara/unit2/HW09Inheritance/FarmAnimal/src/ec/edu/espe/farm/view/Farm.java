package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
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
        String breed = "";
        String bornOn = "";
        boolean isMolting = true;
        boolean isProducingMilk = true;
        String lastSheering = ""; 
        float weight = 0;
        Scanner scanner = new Scanner(System.in);

        Chicken chicken;
        FarmAnimal farmAnimal;
        Cow cow;
        Pig pig;
        Sheep sheep;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        farmAnimal = new FarmAnimal(chickens, cows, pigs, sheeps);
        
        
        System.out.println("--->HW09 FARM ANIMAL MENU <--- ---> JAVIER PAUCAR <---");
        System.out.println("Do you want to enter the menu? ->  \n 1 --> YES \n 0 --> NO");
        number = scanner.nextInt();

        while (number == 1) {
            System.out.println("OPTIONS :");
            System.out.println("\n1--> Add Chickens"
                    + "         \n2--> Add Cows"
                    + "         \n3--> Add Pigs"
                    + "         \n4--> Add Sheeps"
                    + "         \n5-->Show Animals"
                    + "         \n6--> Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("--> Please enter the chicken data <--");
                System.out.println("ID         ->");
                id = scanner.nextInt();
                System.out.println("BREED      ->");
                breed = scanner.next();
                System.out.println("BORN ON    ->");
                bornOn = scanner.next();
                System.out.println("IS MOLTING ->");
                isMolting = scanner.nextBoolean();
                chicken = new Chicken(id, breed, bornOn, isMolting);
                farmAnimal.add(chicken);
                System.out.println("\n Chicken  ->" + chicken);
                System.out.println("\n");
            }
            
            if (option == 2){
                System.out.println("--> Please enter the cow data <--");
                System.out.println("ID         ->");
                id = scanner.nextInt();
                System.out.println("BREED      ->");
                breed = scanner.next();
                System.out.println("BORN ON    ->");
                bornOn = scanner.next();
                System.out.println("IS PRODUCING MILK->");
                isProducingMilk = scanner.nextBoolean();
                cow = new Cow(id, breed, bornOn, isProducingMilk);
                farmAnimal.add(cow);
                System.out.println("\n COW  ->" + cow);
                System.out.println("\n");
            }
            
            if (option == 3){
                System.out.println("--> Please enter the pig data <--");
                System.out.println("ID         ->");
                id = scanner.nextInt();
                System.out.println("BREED      ->");
                breed = scanner.next();
                System.out.println("BORN ON    ->");
                bornOn = scanner.next();
                System.out.println("WEIGHT     ->");
                weight = scanner.nextFloat();
                pig = new Pig(id, breed, bornOn, weight);
                farmAnimal.add(pig);
                System.out.println("\n PIG  ->" + pig);
                System.out.println("\n");
            }
            
            if (option == 4){
                System.out.println("--> Please enter the sheep data <--");
                System.out.println("ID         ->");
                id = scanner.nextInt();
                System.out.println("BREED      ->");
                breed = scanner.next();
                System.out.println("BORN ON    ->");
                bornOn = scanner.next();
                System.out.println("LAST SHEERING ->");
                lastSheering = scanner.next();
                sheep = new Sheep(id, breed, bornOn, lastSheering);
                farmAnimal.add(sheep);
                System.out.println("\n SHEEP  ->" + sheep);
                System.out.println("\n");
            }
            
            if (option == 5){
                System.out.println("---> ANIMALS IN THE FARM <---");
                chicken = new Chicken (id, breed, bornOn, isMolting);
                cow = new Cow(id, breed, bornOn, isProducingMilk);
                pig = new Pig(id, breed, bornOn, weight);
                sheep = new Sheep(id, breed, bornOn, lastSheering);
                System.out.println("FARM ANIMAL ->" + farmAnimal);
                System.out.println("\n");
            }
            
            if (option == 6){
                break;
            }
        }

    }
}
