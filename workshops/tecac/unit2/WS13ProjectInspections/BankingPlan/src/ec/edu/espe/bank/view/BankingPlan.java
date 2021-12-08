package ec.edu.espe.bank.view;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class BankingPlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Camila Teca";
        int id = 7827252;
        int age = 19;
        int password = 172;

        Scanner scanner = new Scanner(System.in);

        System.out.println("data profile");

        System.out.println("Name:");
        name = scanner.next();

        System.out.println("Id:");
        id = scanner.nextInt();

        System.out.println("Age:");
        age = scanner.nextInt();

        System.out.println("Password:");
        password = scanner.nextInt();

        System.out.println("The name --> " + name + " ;the Id --> " + id + " ;age --> " + age + " ;password --> " + password);
    }
}
