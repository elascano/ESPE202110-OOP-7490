package ec.edu.espe.menu.view;

import ec.edu.espe.menu.model.Chicken;
import ec.edu.espe.menu.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Arroba
 */
public class FarmSystem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;
        int option;
        int id = 0;
        String name = "";
        String color = "";
        int age = 0;
        boolean isMolting = true;

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);

       
        System.out.println("    --> Welcome to OOP Farm <--    ");
        System.out.println("Start registration: Yes = 1 / No = 0");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("\n Choose an option from the menu \n");
            System.out.println("1.Add chickens");
            System.out.println("2.Remove chickens");
            System.out.println("3.Show chickens in the coop");
            System.out.println("4.Show the amount of chickens");
            System.out.println("5.Exit");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("\n Data of the chicken");

                System.out.println("\n Enter id = ");
                id = teclado.nextInt();

                System.out.println("\n Enter name = ");
                name = teclado.next();

                System.out.println("\n Enter color = ");
                color = teclado.next();

                System.out.println("\n Enter age = ");
                age = teclado.nextInt();

                System.out.println("\n Enter Molting = ");
                isMolting = teclado.nextBoolean();

                chicken = new Chicken(id, name, color, age, isMolting);
                chickenCoop.add(chicken);
                System.out.println("\n Chicken facts -->" + chicken);
                System.out.println("\n");
            }
            if (option == 2) {
                System.out.println("Enter the id of the chicken you want to remove:");
                id = teclado.nextInt();
                chickenCoop.remove(id);
                System.out.println("The chicken has been eliminated -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (option == 3) {
                System.out.println("\n Number of chickens in the farm ");
                chicken = new Chicken(id, name, color, age, isMolting);
                System.out.println("chicken coop -> " + chickenCoop);
                System.out.println("\n");
            }
            if (option == 4) {
                System.out.println("\n Amount of Chickens ");
                chicken = new Chicken(id, name, color, age, isMolting);
                System.out.println("Chickens in the chicken coop -> " + chickenCoop.countChickens());
                System.out.println("\n");
            }
            if (option == 5) {
                System.out.println("\n The registration is over");
                break;
            }
        }
    }
}
