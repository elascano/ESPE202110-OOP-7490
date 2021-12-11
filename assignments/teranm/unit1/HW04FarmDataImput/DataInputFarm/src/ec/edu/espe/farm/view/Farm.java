package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Melanie
 */
public class Farm {

    public static void main(String[] args) {
        System.out.println("HW04-FARM-INTRODUCE-DATA --> Melanie Terán <--");

        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();

        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);

        Scanner scanner = new Scanner(System.in);

        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        boolean continuee = true;

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

            System.out.print("\nDo you want to continue ");
            System.out.println("Y / N ");

            Scanner getInput = new Scanner(System.in);

            String opc = getInput.next();

            if (opc.equals("y") || opc.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }

        }
    }
}
