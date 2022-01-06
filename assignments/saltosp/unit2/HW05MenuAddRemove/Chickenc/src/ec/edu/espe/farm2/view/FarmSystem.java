package ec.edu.espe.farm2.view;


import ec.edu.espe.farm2.model.ChickenCoop;
import ec.edu.espe.farm2.model.Chicken;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Paul Saltos
 */
public class FarmSystem {
    
    public static void main(String[] args) {

        int id = 0;
        String name = "";
        String color = "";
        int age = 0;
        boolean molting = true;

        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);

        Integer option = 0;
        while (option >= 0) {
            System.out.println("----------------Welcome to Farm chicken-------------");
            System.out.println("--------------------------------");
            System.out.println("1.-Add Chickens\n2.-Remove Chickens");
            System.out.println("3.-Show Chickens in the coop\n4.-Show the amount of Chickens");
            System.out.println("5.-Exit");
            System.out.println("--------------------------------");
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
                    System.out.println("Enter the id of the chicken you want to remove:");
                    id = scanner.nextInt();
                    chickenCoop.remove(id);
                    System.out.println("The chicken has been eliminated : " + chickenCoop.countChickens());
                    System.out.println("\n");

                } else {
                    if (option == 3) {
                        System.out.println("   --------> Chickens in the farm <--------   ");
                        chicken = new Chicken(id, name, color, age, molting);
                        System.out.println("chicken coop -> " + chickenCoop);
                        System.out.println("\n");

                    } else {
                        if (option == 4) {
                            System.out.println("  --------> Amount of chickens <---------   ");
                            chicken = new Chicken(id, name, color, age, molting);
                            System.out.println("Chickens in the chicken coop : " + chickenCoop.countChickens());
                            System.out.println("\n");

                        } else {
                            if (option == 5) {
                                exit(0);
                            }
                        }
                    }

                }

            }
        }

    }
}
