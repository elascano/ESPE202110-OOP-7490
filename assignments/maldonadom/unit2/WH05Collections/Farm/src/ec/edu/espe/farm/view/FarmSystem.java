package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author MateoMaldonado
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
        
        System.out.println("--> HW05 from Mateo Maldonado <-- ");
        System.out.println("What do you want to do? -> Open Menu for the Farm System: Yes = 1 / No = 0");
        firstOption = scanner.nextInt();
        while (firstOption == 1) {
            System.out.println("1.Add Chickens to the coop\n2.Remove Chickens from the coop\n3.Show Chickens in the coop\n4.Show the amount of chickens in the coop\n5.Exit\n");
            secondOption = scanner.nextInt();

            if (secondOption == 1) {
                System.out.println("Enter data of the chicken");

                System.out.println("Id --> ");
                id = scanner.nextInt();

                System.out.println("Name --> ");
                name = scanner.next();

                System.out.println("Color --> ");
                color = scanner.next();

                System.out.println("Age --> ");
                age = scanner.nextInt();

                System.out.println("Molting --> ");
                molting = scanner.nextBoolean();

                chicken = new Chicken(id, name, color, age, molting);
                chickenCoop.add(chicken);
                System.out.println("\nchicken -->" + chicken);
                System.out.println("\n");
                
            }
            if (secondOption == 2) {
                System.out.println("Enter the Id of the chicken you want to remove:");
                id = scanner.nextInt();
                chickenCoop.remove(id);
                System.out.println("Chicken has been removed, total chickens in the coop -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (secondOption == 3) {
                System.out.println("Chickens in the coop");
                System.out.println("chicken coop -> " + chickenCoop);
                System.out.println("\n");
            }
            if (secondOption == 4) {
                System.out.println("Amount of chickens");
                System.out.println("Chickens in the Chicken coop -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (secondOption == 5) {
                firstOption = 0;
            }
        }
    }
}