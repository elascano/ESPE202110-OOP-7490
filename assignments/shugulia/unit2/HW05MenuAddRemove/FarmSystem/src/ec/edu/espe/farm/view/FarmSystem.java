package ec.edu.espe.farm.view;
import ec.edu.espe.farm.model.ChickenCoop;
import ec.edu.espe.farm.model.Chicken;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class FarmSystem {

    public static void main(String[] args) {

        int id = 0;
        String name = "";
        String color = "";
        int age = 2;
        boolean isMolting = false;

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);

        Integer option = 0;
        while (option >= 0) {
            System.out.println("----------------------------------");
            System.out.println("WELCOME TO THE CHICKEN SYSTEM");
            System.out.println("What do you want to do?");
            System.out.println("Please enter a number");
            System.out.println("1. Add chickens");
            System.out.println("2. Remove Chickens");
            System.out.println("3. Show Chickens in the coop");
            System.out.println("4. Show the amount of Chickens");
            System.out.println("5.Exit");
            System.out.println("----------------------------------");

            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            if (option == 1) {
                chicken = new Chicken();
                chickenCoop.add(chicken);
                System.out.println(chicken);
                System.out.println("\n");

            } else {
                if (option == 2) {
                    System.out.println("Enter the id of the chicken you want to quit:");
                    id = scanner.nextInt();
                    chickenCoop.remove(id);
                    System.out.println("The chicken has been eliminated: " + chickenCoop.countChickens());
                    System.out.println("\n");

                } else {
                    if (option == 3) {
                        System.out.println("---> Chickens in the coop <--- ");
                        chicken = new Chicken(id, name, color, age, isMolting);
                        System.out.println("Chicken coop: " + chickenCoop);
                        System.out.println("\n");

                    } else {
                        if (option == 4) {
                            System.out.println("---> Amount of chickens <---");
                            chicken = new Chicken(id, name, color, age, isMolting);
                            System.out.println("Chickens in the coop: " + chickenCoop.countChickens());
                            System.out.println("\n");

                        } else {
                            if (option == 5) {
                                System.out.println("Succesful exit");
                                System.out.println("Thank you for using the chicken system");

                                exit(0);
                            }
                        }
                    }

                }

            }
        }

    }

}
