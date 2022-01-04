
package ec.edu.espe.hwChicken.view;

import ec.edu.espe.hwChicken.model.HWEgg;
import ec.edu.espe.hwChicken.model.HWPoop;
import ec.edu.espe.hwChicken.model.HWChicken;
import java.util.Scanner;

/**
 *
 * @author Alexander Ruano
 */
public class HWSystem {
     public static void main(String[] args) {
        System.out.println("------->Alexander Ruano<-----");
        HWEgg egg = new HWEgg();
        HWPoop poop = new HWPoop();
        HWChicken chicken = new HWChicken();
        
        System.out.println("\n---------------> DATA CHICKEN2 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- id  --> ");
        int id = scanner.nextInt();
        System.out.println("- name --> ");
        String name = scanner.next();
        System.out.println("enter molting status");
        boolean isMolting = scanner.nextBoolean();
        System.out.println("- color --> ");
        String color = scanner.next();
        System.out.println("- age --> ");
        int age = scanner.nextInt();

        System.out.println("the egg");
        System.out.println("-->" + egg);

        System.out.println("the poop");
        System.out.println("-->" + poop);

        System.out.println("the chicken");
        System.out.println("-->" + chicken);

        HWChicken chicken2 = new HWChicken(id, name, color, age, isMolting);
        
        System.out.println("Chicken 2-->" + chicken2);

    }
}
