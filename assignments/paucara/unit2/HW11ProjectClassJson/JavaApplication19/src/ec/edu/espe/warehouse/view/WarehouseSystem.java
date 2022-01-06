package ec.edu.espe.warehouse.view;

import ec.edu.espe.warehouse.model.Warehouse;
import ec.edu.espe.warehouse.model.Weapon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Paucar
 */
public class WarehouseSystem {

    public static void main(String[] args) {
        int id = 0;
        int option;
        int number;
        int yearFabrication;
        String name = "";
        String caliber = "";
        String status = "";
        Scanner scanner = new Scanner(System.in);

        Warehouse warehouse;
        Weapon weapon;
        ArrayList<Weapon> weapons = new ArrayList<>();
        warehouse = new Warehouse(id, weapons);

        System.out.println(" WS11 PROJECT CLASS JSON ---> Javier Paucar <---");
        System.out.println("---> DATA WEAPON IN WAREHOUSE <---");
        System.out.println("Do you want to enter the menu? ->  \n 1 --> YES \n 0 --> NO");
        number = scanner.nextInt();
        while (number == 1) {
            System.out.println("Options:");
            System.out.println("\n-->1 Create a Weapon\n-->2 Read Weapons List\n-->3 Update List\n-->4 Remove Weapon\n-->5 Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("---> Please enter the weapon data");
                System.out.println("ID               --->");
                id = scanner.nextInt();
                System.out.println("YEAR FABRICATION --->");
                yearFabrication = scanner.nextInt();
                System.out.println("NAME             --->");
                name = scanner.next();
                System.out.println("CALIBER          --->");
                caliber = scanner.next();
                System.out.println("STATUS           --->");
                status = scanner.next();
                weapon = new Weapon(id, yearFabrication, name, caliber, status);
                warehouse.add(weapon);
                System.out.println("\n weapon --->" + weapon);
                System.out.println("\n");

            }

            if (option == 2) {
                System.out.println("---> Weapons in the Warehouse <---");
                System.out.println("Warehouse ->" + warehouse);
                System.out.println("\n");
            }

            if (option == 3) {

            }

            if (option == 4) {
                System.out.println("Enter the ID of the weapon you want to remove");
                id = scanner.nextInt();
                warehouse.remove(id);
                System.out.println("Weapons has been removed -->" + warehouse.countWeapons());
                System.out.println("\n");
            }

            if (option == 5) {
                break;
            }

        }

    }
}
