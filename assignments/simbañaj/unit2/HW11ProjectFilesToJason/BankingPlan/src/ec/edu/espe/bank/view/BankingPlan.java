package ec.edu.espe.bank.view;

import ec.edu.espe.bank.model.Cdt;
import ec.edu.espe.bank.model.Checking;
import ec.edu.espe.bank.model.Money;
import ec.edu.espe.bank.model.Profit;
import ec.edu.espe.bank.model.Saving;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Camila
 */
public class BankingPlan {

    public static void main(String[] args) {
        int accountNumber;
        String name;
        float amount;
        Scanner sc = new Scanner(System.in);
        Integer option = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("---------------------------");
            System.out.println("Welcome to Bank Simulator");
            System.out.println("Hope you enjoy the experience");
            System.out.println("Select and option");
            System.out.println("1. Current");
            System.out.println("2. Saving");
            System.out.println("3. CDT");
            System.out.println("4. Exit");
            System.out.println("---------------------------");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    while (!exit) {
                        System.out.println("---------------------------");
                        System.out.println("1. Deposit");
                        System.out.println("2. Advance");
                        System.out.println("3. Transfer");
                        System.out.println("4. Exit");
                        System.out.println("---------------------------");
                        switch (option) {
                            case 1:
                                String fileName = "data/deposit.csv";
                                String deposits;
                                deposits = FileManager.read(fileName);
                                String deposit;
                                deposit = FileManager.read(fileName);

                                System.out.println(" Enter the data for the deposit");
                                System.out.println("Account number");
                                accountNumber = sc.nextInt();
                                System.out.println("Client name");
                                name = sc.next();
                                System.out.println("Amount");
                                amount = sc.nextFloat();
                                System.out.println("List of deposists ");
                                fileName = "data/deposit.csv";
                                System.out.println(" --> \n " + deposits);
                                deposit = accountNumber + ";" + name + ";" + amount + "\n";
                                FileManager.save("data/deposit.csv", deposit);

                                break;
                            case 2:
                                String FileName = "data/advance.csv";
                                String advances;
                                advances = FileManager.read(FileName);
                                String advance;
                                advance = FileManager.read(FileName);
                                
                                System.out.println(" Enter the data for the advance");
                                System.out.println("Account number");
                                accountNumber = sc.nextInt();
                                System.out.println("Client name");
                                name = sc.next();
                                System.out.println("Amount");
                                amount = sc.nextFloat();
                                System.out.println("List of deposists ");
                                FileName = "data/advance.csv";
                                System.out.println(" --> \n " + advances);
                                advances = accountNumber + ";" + name + ";" + amount + "\n";
                                FileManager.save("data/advance.csv", advance);
                                break;
                                
                            case 3:
                                String File_Name = "data/tranfer.csv";
                                String transfers;
                                String tranfer;
                                deposit = FileManager.read(File_Name);
                                System.out.println(" Enter the data for the tranfer");
                                System.out.println("Account number");
                                accountNumber = sc.nextInt();
                                System.out.println("Client name");
                                name = sc.next();
                                System.out.println("Amount");
                                amount = sc.nextFloat();
                                break;
                            case 4:
                                exit = true;
                                System.out.println("Successful exit");
                                break;
                        }
                    }
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Transfer");
                    System.out.println("4. Estiamte interest");
                    System.out.println("5. Exit");
                    System.out.println("---------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("1. Calculate CDT");
                    System.out.println("4. Exit");
                    System.out.println("---------------------------");
                    break;
                case 4:
                    exit = true;
                    System.out.println("Successful exit");
                    break;
            }
        }
    }
}
