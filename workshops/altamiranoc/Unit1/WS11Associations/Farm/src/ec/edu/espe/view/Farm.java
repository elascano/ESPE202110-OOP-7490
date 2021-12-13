package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.Egg;
import ec.edu.espe.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class Farm {

    public static void main(String[] args) {
        // Egg egg = new Egg();
        //Poop poop = new Poop();
        Chicken chicken = new Chicken();
        //int id = 1;
        //String name = "Lucy";
        //String color="White and brown";
        //int age = 2;
        //boolean isMolting = false;

        //System.out.println("Egg --> "+ egg);
        //System.out.println("Poop --> "+ poop);
        //System.out.println("Chicken --> "+ chicken);
        //Chicken chicken2= new Chicken(id, name, color, age, isMolting);
        //System.out.println("chicken 2 -->" + chicken2);
        //id = 2;
        //name = "Maruja";
        //color = "Black";
        //age = 1;
        //isMolting = true;
        //chicken2 = new Chicken(id, name, color, age, isMolting);
        //System.out.println("chicken 2 --> " + chicken2);
        //System.out.println("Please enter the id of The chicken --> ");
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String color;
        int age;
        boolean isMolting;

        System.out.println("---> Cristhian Altamirano <---");
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
