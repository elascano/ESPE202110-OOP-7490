package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author mayerly
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("HW11 by Mayerly Garcia");

        FarmAnimal farmAnimal;
        int option;
        int id = 0;
        String name;
        String color;
        int age;
        String tecla = null;

        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021, 12, 15);
        Scanner sn = new Scanner(System.in);
        boolean Exit = false;
        int opcion;

        while (!Exit) {
            System.out.println("1. Add Chicken 1");
            System.out.println("2. Add Chicken 2");
            System.out.println("3. Add Chicken 3");
            System.out.println("4. out");

            System.out.println("Choose the any options ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Choose the Chicken 1");
                    System.out.println(" ID->");
                    id = read.nextInt();
                    System.out.println(" name->");
                    name = read.next();
                    System.out.println(" Color->");
                    color = read.next();
                    System.out.println(" Age->");
                    age = read.nextInt();

                    break;
                case 2:
                    System.out.println(" Choose the Chicken 2");
                    System.out.println(" ID->");
                    id = read.nextInt();
                    System.out.println(" name->");
                    name = read.next();
                    System.out.println(" Color->");
                    color = read.next();
                    System.out.println(" Age->");
                    age = read.nextInt();

                    break;
                case 3:
                    System.out.println(" Choose the Chicken 3");
                    System.out.println(" ID->");
                    id = read.nextInt();
                    System.out.println(" name->");
                    name = read.next();
                    System.out.println(" Color->");
                    color = read.next();
                    System.out.println(" Age->");
                    age = read.nextInt();
                    break;
                case 4:
                    Exit = true;
                    break;
                default:
                    System.out.println("only numbers between 1 & 4");

            }

        }
    }
}

