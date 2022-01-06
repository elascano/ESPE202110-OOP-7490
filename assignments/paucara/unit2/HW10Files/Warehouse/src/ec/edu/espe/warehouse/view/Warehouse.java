package ec.edu.espe.warehouse.view;

import ec.edu.espe.warehouse.model.DataWarehouse;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Javier Paucar
 */
public class Warehouse {

    public static void main(String[] args) {
        int number;
        int optionIn;
        int option;
        String name = "";
        String country = "";
        String city = "";
        int yearFundation;
        Scanner scanner = new Scanner(System.in);

        DataWarehouse warehouse;

        System.out.println(" WS09 FILES ---> JAVIER PAUCAR <---");
        System.out.println("---> DATA WAREHOUSE <---");
        System.out.println("Do you want to enter the menu? -> \n 1 --> YES \n 0 --> NO");
        optionIn = scanner.nextInt();
        while (optionIn == 1) {
            System.out.println("\nOPTIONS");
            System.out.println("\n1--> Create a Warehouse"
                    + "\n2--> Read the Warehouse"
                    + "\n3--> Update the Warehouse"
                    + "\n4--> Delete a Warehouse"
                    + "\n5--> Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("---> Please enter the Warehouse data <--- ");
                System.out.println("Number         --> ");
                number = scanner.nextInt();
                System.out.println("Name           --> ");
                name = scanner.next();
                System.out.println("Country        --> ");
                country = scanner.next();
                System.out.println("City           --> ");
                city = scanner.next();
                System.out.println("Year Fundation --> ");
                yearFundation = scanner.nextInt();
                warehouse = new DataWarehouse(number, name, country, city, yearFundation);
                String warehouses = "";
                FileManager.save("data/warehouses.csv" , warehouses);
                System.out.println("\n");
            }

            if (option == 2) {
                String warehouses;
                String fileName = "data/warehouses.csv";
                warehouses = FileManager.read(fileName);
                System.out.println("--> WAREHOUSES <-- \n" + warehouses);
            }

            if (option == 3) {
                System.out.println("UPDATE THE WOREHOUSES");
            }

            if (option == 4) {
                System.out.println("Enter the Number of the warehuse you want to remove");
            }
            if (option == 5) {
                break;
            }
        }

    }
}
