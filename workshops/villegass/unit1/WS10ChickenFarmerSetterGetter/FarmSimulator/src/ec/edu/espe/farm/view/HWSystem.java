package ec.edu.espe.hwChicken.view;

import ec.edu.espe.hwChicken.model.HWEgg;
import ec.edu.espe.hwChicken.model.HWPoop;
import ec.edu.espe.hwChicken.model.HWChicken;
import java.util.Scanner;

/**
 *
 * @author Salma Villegas
 */
public class HWSystem {
     public static void main(String[] args) {
        System.out.println("HW04 FARM INTRODUCE DATA - Association---> Salma Villegas <---");
        HWEgg egg = new HWEgg();
        HWPoop poop = new HWPoop();
        HWChicken chicken = new HWChicken();
        
        System.out.println("\n---------------> Data Chicken 2 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- ID  --> ");
        int id = scanner.nextInt();
        System.out.println("- Name --> ");
        String name = scanner.next();
        System.out.println("Enter Molting Status");
        boolean isMolting = scanner.nextBoolean();
        System.out.println("- Color --> ");
        String color = scanner.next();
        System.out.println("- Age --> ");
        int age = scanner.nextInt();

        System.out.println("The egg");
        System.out.println("-->" + egg);

        System.out.println("The poop");
        System.out.println("-->" + poop);

        System.out.println("The chicken");
        System.out.println("-->" + chicken);

        HWChicken chicken2 = new HWChicken(id, name, color, age, isMolting);
        
        System.out.println("Chicken 2-->" + chicken2);

    }
}
