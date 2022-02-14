package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dylanasumaza
 */
public class FarmSystem {

    static Scanner scanner = new Scanner(System.in);
    static int select = -1;

    public static void main(String[] args) {
        int id;
        int age;
        String name;
        String color;
        boolean isMolting;
        Chicken chicken = null;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(0, chickens);

        while (select != 0) {

            try {
                System.out.println("=======Menu=======");
                System.out.println("1----Add chickens----");
                System.out.println("2----Remove chickens----");
                System.out.println("3----Show chickens in the coop----");
                System.out.println("4----Show the amount of chickens----");
                System.out.println("0-----Exit----");

                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:

                        Scanner add = new Scanner(System.in);
                        System.out.println("- id  --> ");
                        id = add.nextInt();
                        System.out.println("- name --> ");
                        name = add.next();
                        System.out.println("- color --> ");
                        color = add.next();
                        System.out.println("- age  --> ");
                        age = add.nextInt();
                        isMolting = true;
                        chicken = new Chicken(id, name, color, age, isMolting);
                        chickenCoop.add(chicken);
                        System.out.println("chicken coop ->" + chickenCoop);

                        break;

                    case 2:

                        chickenCoop.remove(chicken);
                        System.out.println("Chickens in the Chicken coop -> " + chickenCoop.countChickens());
                        System.out.println("chicken coop -> " + chickenCoop);

                        break;
                    case 3:

                        System.out.println("chicken coop ->" + chickenCoop);

                        break;
                    case 4:

                        chickenCoop.countChickens();
                        System.out.println("chickens in the chicken coop-> " + chickenCoop.countChickens());

                        break;

                    case 0:
                        break;
                    default:
                        System.out.println("try again");
                        break;
                }

                System.out.println("\n");

            } catch (NumberFormatException e) {
            }
        }
    }

}
