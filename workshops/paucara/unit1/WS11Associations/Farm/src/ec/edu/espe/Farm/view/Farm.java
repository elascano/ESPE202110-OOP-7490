package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Egg;
import ec.edu.espe.Farm.model.Poop;
import ec.edu.espe.Farm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class Farm {

    public static void main(String[] args) {
        System.out.println("HW04 Farm Introduce Data  ---> JAVIER PAUCAR <---");
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Chicken chicken = new Chicken();

        System.out.println("Please enter the chicken data: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = scanner.nextInt();
        System.out.println("Enter the name: ");
        name = scanner.next();
        System.out.println("Enter the color: ");
        color = scanner.next();
        System.out.println("Enter the age: ");
        age = scanner.nextInt();
        System.out.println("The chicken is molting? : ");
        isMolting = scanner.nextBoolean();

        chicken = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken3 ---> " + chicken);
        
    }
}
