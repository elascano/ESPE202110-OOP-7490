<<<<<<< HEAD
package edu.ec.espe.animalsfarm.view;

import edu.ec.espe.animalsfarm.model.Chicken;
import edu.ec.espe.animalsfarm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dylanasumaza
 */
public class AnimalsFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String breed = "";
        boolean isProducingMilk = true;
        ArrayList<Chicken> chickens = new ArrayList<>();
        boolean exit = false;
        Integer option = 0;

        while (!exit) {

            System.out.println("Welcome to the Farm System");

            System.out.println("What animal do you want enter?");

            System.out.println("Type the number");

            System.out.println("1. Chicken ");

            System.out.println("2. Cow");

            System.out.println("3. Pig");

            System.out.println("4. Sheep");

            System.out.println("5. Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the data for the Chicken");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("isMolting:");
                    break;
                case 2:
                    System.out.println("Enter the data for the Cow ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Is Producing Milk:");
                    break;
                case 3:
                    System.out.println("Enter the data for the Pig ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Weight:");
                    break;
                case 4:
                    System.out.println("Enter the data for the Sheep ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Last Sheering:");
                    break;
                case 5:
                    System.out.println("Thanks for using this program ");
                    break;
            }

        }
    }
}
=======
package edu.ec.espe.animalsfarm.view;

import edu.ec.espe.animalsfarm.model.Chicken;
import edu.ec.espe.animalsfarm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dylanasumaza
 */
public class AnimalsFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String breed = "";
        boolean isProducingMilk = true;
        ArrayList<Chicken> chickens = new ArrayList<>();
        boolean exit = false;
        Integer option = 0;

        while (!exit) {

            System.out.println("Welcome to the Farm System");

            System.out.println("What animal do you want enter?");

            System.out.println("Type the number");

            System.out.println("1. Chicken ");

            System.out.println("2. Cow");

            System.out.println("3. Pig");

            System.out.println("4. Sheep");

            System.out.println("5. Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the data for the Chicken");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("isMolting:");
                    break;
                case 2:
                    System.out.println("Enter the data for the Cow ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Is Producing Milk:");
                    break;
                case 3:
                    System.out.println("Enter the data for the Pig ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Weight:");
                    break;
                case 4:
                    System.out.println("Enter the data for the Sheep ");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("bornOn: ");
                    System.out.println("Last Sheering:");
                    break;
                case 5:
                    System.out.println("Thanks for using this program ");
                    break;
            }

        }
    }
}
>>>>>>> 466fcee97c9470e8d3d0c4ffc518fa7f80e38b4c
