package ec.edu.espe.collection.view;

import ec.edu.espe.collection.model.Chicken;
import ec.edu.espe.collection.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Melanie
 */
public class FarmSystem {

    public static void main(String[] args) {
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();

        System.out.println("HW05ArrayList  -->Melanie Terán<--");

        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        boolean continuee = true;

        chickenCoop = new ChickenCoop(0, chickens);
        Scanner scanner = new Scanner(System.in);

        while (continuee) {
            System.out.println("1.Add Chickens");
            System.out.println("2.Remove Chickens");
            System.out.println("3.Show Chickens in the Coop");
            System.out.println("4.Show the amount of chickens");
            System.out.println("5.Exit\n");
            System.out.println("Enter an option");

            Scanner menuInput = new Scanner(System.in);
            int option = menuInput.nextInt();

            if (option == 1) {
                while (continuee) {
                    System.out.println("-id  -->  ");
                    id = scanner.nextInt();

                    System.out.println("- name --> ");
                    name = scanner.next();

                    System.out.println("- color --> ");
                    color = scanner.next();

                    System.out.println("- age  -->  ");
                    age = scanner.nextInt();

                    System.out.println("enter molting status");
                    isMolting = scanner.nextBoolean();

                    chicken = new Chicken(id, name, color, age, isMolting);
                    chickenCoop.add(chicken);

                    System.out.print("\nDo you want to enter another chicken ");
                    System.out.println("Y / N ");

                    Scanner getInput = new Scanner(System.in);

                    String opc = getInput.next();

                    if (opc.equals("y") || opc.equals("Y")) {
                        continuee = true;
                    } else {
                        continuee = false;
                    }
                }
                continuee = true;
            } else if (option == 2) {
                System.out.println("Enter id");
                id = scanner.nextInt();
                chickenCoop.remove(id);
                System.out.println("Chicken " + id + "has been remved");

            } else if (option == 3) {
                System.out.println("Chickens in the Chicken coop\n " + chickenCoop);

            } else if (option == 4) {
                System.out.println("Amount of chickens --> " + chickenCoop.countChickens());

            } else {
                continuee = false;
            }
        }

    }

}
