package ec.edu.espe.bank.view;

import ec.edu.espe.bank.model.Cdt;
import ec.edu.espe.bank.model.Checking;
import ec.edu.espe.bank.model.Money;
import ec.edu.espe.bank.model.Profit;
import ec.edu.espe.bank.model.Saving;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class BankingPlan {

    public static void main(String[] args) {
        ArrayList<Saving> savings = new ArrayList<>();
        ArrayList<Checking> checking = new ArrayList<>();
        ArrayList<Cdt> cdt = new ArrayList<>();
        ArrayList<Money> money = new ArrayList<>();
        ArrayList<Profit> profits = new ArrayList<>();
        

        
        String name = "";
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
