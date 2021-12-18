package edu.ec.espe.animalsfarm.view;

import edu.ec.espe.animalsfarm.model.Chicken;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrea Tapia
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
            System.out.println("---------------------------------");
            System.out.println("Welcome to the Farm System");
            System.out.println("What animal do you want enter?");
            System.out.println("Type the number");
            System.out.println("1. Chicken ");
            System.out.println("2. Cow");
            System.out.println("3. Pig");
            System.out.println("4. Sheep");
            System.out.println("5. Exit");
            System.out.println("---------------------------------");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the data for the chicken");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    break;
                case 2:
                    System.out.println("Enter the data for the cow");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("Milk status:");
                    isProducingMilk = sc.hasNext();
                    break;
                case 3:
                    System.out.println("Enter the data for the pig");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("Weight:");
                    float weight = sc.nextFloat();
                    break;

                case 4:
                    System.out.println("Enter the data for the sheep");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Successful exit");
                    break;

            }

        }
    }
}
