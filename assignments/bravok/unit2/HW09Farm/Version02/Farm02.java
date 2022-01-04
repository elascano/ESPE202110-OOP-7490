package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Katherin Bravo
 */
public class Farm02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("---> HW09Farm VERSION 02 BRAVO KATHERIN <---");
        
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String breed = "";
        boolean isProducingMilk = true;
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        boolean exit = false;
        Integer option = 0;             
        while (!exit) {  
            
            System.out.println("MENU");
            System.out.println("1. Add Chicken");
            System.out.println("2. Add Cow");
            System.out.println("3. Add Pig");
            System.out.println("4. Add Sheep");
            System.out.println("5. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the data for the chicken");
                    System.out.println("ID");
                    id = sc.nextInt();
                    System.out.println("Breed");
                    breed = sc.next();
                    break;
                case 2:
                    System.out.println("Enter the data for the cow");
                    System.out.println("ID");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("What is the state of the milk");
                    isProducingMilk = sc.hasNext();
                    break;
                case 3:
                    System.out.println("Enter the data for the pig");
                    System.out.println("ID");
                    id = sc.nextInt();
                    System.out.println("Breed");
                    breed = sc.next();
                    System.out.println("Weight");
                    float weight = sc.nextFloat();
                    break;

                case 4:
                    System.out.println("Enter the data for the sheep");
                    System.out.println("ID");
                    id = sc.nextInt();
                    System.out.println("Breed");
                    breed = sc.next();
                    break;
                case 5:
                    exit = true;
                    System.out.println("His exit was successful");
                    break;

            }

        }
    }
}