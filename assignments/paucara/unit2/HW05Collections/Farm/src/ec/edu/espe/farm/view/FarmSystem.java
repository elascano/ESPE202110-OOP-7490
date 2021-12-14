package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class FarmSystem {

    public static void main(String[] args) {
        int number;
        int option;
        int id = 0;
        int age = 0;
        boolean molting = true;
        String name = "";
        String color = "";
        Scanner teclado = new Scanner(System.in);

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);

        System.out.println(" WS05 Collections -----> Javier Paucar <----- ");
        System.out.println("-----> DATA CHICKEN <-----");
        System.out.println("Do you want to enter the menu? ->  \n 1 --> YES \n 0 --> NO");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("Options:");
            System.out.println("\n1--> Add Chickens\n2--> Remove Chickens for ID \n3--> Show Chickens in the coop\n4--> Show the amount of chickens\n5--> Exit\n");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("---> Please enter the chicken data <--- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Name --> ");
                name = teclado.next();
                System.out.println("Color --> ");
                color = teclado.next();
                System.out.println("Age --> ");
                age = teclado.nextInt();
                System.out.println("Molting --> ");
                molting = teclado.nextBoolean();
                chicken = new Chicken(id, name, color, age, molting);
                chickenCoop.add(chicken);
                System.out.println("\n chicken -->" + chicken);
                System.out.println("\n");
            }
            if (option == 2) {
                System.out.println("Enter the Id of the chicken you want to remove:");
                id = teclado.nextInt();
                chickenCoop.remove(id);
                System.out.println("Chicken has been removed -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (option == 3) {
                System.out.println("---> Chickens in the coop <--- ");
                chicken = new Chicken(id, name, color, age, molting);
                System.out.println("chicken coop -> " + chickenCoop);
                System.out.println("\n");
            }
            if (option == 4) {
                System.out.println("---> Amount of chickens <--- ");
                chicken = new Chicken(id, name, color, age, molting);
                System.out.println("Chickens in the Chicken coop -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (option == 5) {
                break;
            }
        }
    }
}