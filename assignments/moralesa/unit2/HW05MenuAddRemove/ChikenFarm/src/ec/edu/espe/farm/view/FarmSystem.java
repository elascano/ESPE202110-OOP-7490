
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        int firstOption;
        int secondOption;
        int id = 0;
        String name = "";
        String color = "";
        int age = 0;
        boolean molting = true;
        Scanner scanner = new Scanner(System.in);

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);
        
        System.out.println("--> HW05 from Anthony Morales <-- ");
        System.out.println("Do you want to open the menu?: Yes(1) / No (0)");
        firstOption = scanner.nextInt();
        while (firstOption == 1) {
            System.out.println("1.Add Chickens to the coop");
            System.out.println("2.Remove Chickens in the coop");
            System.out.println("3.Show Chickens in the coop");
            System.out.println("4.Show the amount of chickens in the coop");
            System.out.println("5.Exit");
            secondOption = scanner.nextInt();

            if (secondOption == 1) {
                System.out.println("--> Enter data of the chicken <-- ");

                System.out.println("Enter the chicken id: ");
                id = scanner.nextInt();

                System.out.println("Enter the name of the chicken: ");
                name = scanner.next();

                System.out.println("Enter the color of the chicken: ");
                color = scanner.next();

                System.out.println("Enter the age of the chicken: ");
                age = scanner.nextInt();

                System.out.println("Enter molting: ");
                molting = scanner.nextBoolean();

                chicken = new Chicken(id, name, color, age, molting);
                chickenCoop.add(chicken);
                System.out.println("\nchicken -->" + chicken);
                System.out.println("\n");
                
            }
            if (secondOption == 2) {
                System.out.println("--> Enter the id of the chicken you want to remove <--");
                id = scanner.nextInt();
                chickenCoop.remove(id);
                System.out.println("The chicken has been remove, the new number of chickens is: " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (secondOption == 3) {
                System.out.println("--> Chickens in the coop <-- ");
                chicken = new Chicken(id, name, color, age, molting);
                System.out.println("Chickens in the chickencoop: " + chickenCoop);
                System.out.println("\n");
            }
            if (secondOption == 4) {
                System.out.println("--> Amount of chickens <-- ");
                System.out.println("Total chickens in the chickencoop: " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (secondOption == 5) {
                break;
            }
        }
    }
}