package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Andrea Tapia
 */
public class Farm {

    public static void main(String[] args) {
        //Egg egg = new Egg(1);
        // Poop poop = new Poop();
        Chicken chicken = new Chicken();

        //  int id = 1;
        //  String name = "Lucy";
        //  String color = "White and brown";
        // int age = 2;
        // boolean isMolting = false;
        // System.out.println("WS11 --->Andrea Tapia <---");48
        // System.out.println("Egg --> " + egg);
        // System.out.println("Poop --> " + poop);
        // System.out.println("Chicken --> " + chicken);
        // Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        // System.out.println("chicken2 -->" + chicken2);
        // id = 2;
        // name = "Maruja";
        // color = "Black";
        //age = 1;
        // isMolting = true;
        // chicken2 = new Chicken (id, name, color, age, isMolting);
        // System.out.println("chicken2 --> " + chicken2);
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String color;
        int age;
        boolean isMolting;

        System.out.println("--->Andrea Tapia<---");
        System.out.println("Please enter the data from your chicken ");

        System.out.println("--id --->");
        id = sc.nextInt();

        System.out.println("--name --->");
        name = sc.next();

        System.out.println("--age --->");
        age = sc.nextInt();

        System.out.println("--color --->");
        color = sc.next();

        System.out.println("--Enter molting status --->");
        isMolting = sc.nextBoolean();

        chicken = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken -->" + chicken);
    }
}
