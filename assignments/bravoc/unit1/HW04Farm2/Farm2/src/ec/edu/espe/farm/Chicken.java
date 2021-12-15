package ec.edu.espe.farm;

import java.util.Scanner;

/**
 *
 * @author Christian Bravo
 */
public class Chicken {

    public static void main(String[] args) {

        Scanner dato1 = new Scanner(System.in);

        int id = 0;
        System.out.println("Please enter the id of the chicken");
        id = dato1.nextInt();
        System.out.println("id -->" + id);

        Scanner dato2 = new Scanner(System.in);

        String name = "";
        System.out.println("Please enter the name of the chicken");
        name = dato2.nextLine();
        System.out.println("name -->" + name);

        Scanner dato3 = new Scanner(System.in);

        int age = 0;
        System.out.println("Please enter the age of the chicken");
        age = dato3.nextInt();
        System.out.println("age -->" + age);

        Scanner dato4 = new Scanner(System.in);

        String color = "";
        System.out.println("Please enter the color of the chicken");
        color = dato4.nextLine();
        System.out.println("color -->" + color);


    }

}
