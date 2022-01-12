
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmSystem;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("HW08 Alan Shuguli");

        int option;
        int id = 0;
        String name;
        String color;
        int age;
        String tecla = null;

        String breed = "any";
        LocalDate bornOn = LocalDate.of(2021, 12, 15);
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Chicken 1");
            System.out.println("2. Chicken 2");
            System.out.println("3. Chicken 3");
            System.out.println("4. out");

            System.out.println("Choose the any options ");
            opcion = sn.nextInt();
        }
       }
}
    

