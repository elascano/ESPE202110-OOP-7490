package ec.edu.espe.bank.view;

import com.google.gson.Gson;
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

    public static void main(String[] args) throws Exception {

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
                    saving();
                    break;
                case 3:
                    Cdt();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Successful exit");
                    break;
            }
        }

    }

    public static void Cdt() throws Exception {
        float number;
        float time;
        float interest;
        interest = (float) 0.05;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculated Cdt");
        System.out.println("Enter the amount");
        number = sc.nextFloat();
        System.out.println("Enter the time");
        time = sc.nextFloat();
        System.out.println("The cdt is " + number / 360 * time);
        
    }

    public static void saving() throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Money> money = new ArrayList<>();
        ArrayList<Profit> profits = new ArrayList<>();
        Saving saving;
        int number, option;
        String accountNumber = "";

        String name = "";
        float amount = 0.F;
        ArrayList<Saving> savings = new ArrayList<>();

        System.out.println("--> Menu for Saving Account <--");
        System.out.println("Do you want to continue? --> Yes(1) / No (0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("1.Deposit \n2.Withdraw \n3.Transfer \n4.Exit\n");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("Enter full name of the account holder to deposit -> (No spaces)");
                name = teclado.next();
                System.out.println("Enter the card number (10 digits): ");
                accountNumber = teclado.next();
                System.out.println("Enter the amount to deposit");
                amount = teclado.nextFloat();
                System.out.println("Check the data entered please!");
                saving = new Saving(name, accountNumber, amount, money, profits);
                System.out.println(saving);
                System.out.println("\nAre you sure of this action? -> Yes(1)/No(0)");
                number = teclado.nextInt();
                if (number == 1) {
                    money.remove(amount);
                    String deposits = saving.getName() + ";" + saving.getAmount() + ";"
                            + saving.getAccountNumber() + ";" + saving.getMoney() + ";" + saving.getProfits();
                    FileManager.save("data/SavingAccount/deposits.csv", deposits);

                    String fileName = "data/SavingAccount/deposits.csv";
                    FileManager.read(fileName);
                    deposits = FileManager.read(fileName);

                    Gson gson;
                    gson = new Gson();
                    saving = new Saving(name, accountNumber, amount, money, profits);
                    String jsonDeposits = gson.toJson(saving);
                    FileManager.save("data/SavingAccount/deposits.json", jsonDeposits);

                    fileName = ("data/SavingAccount/deposits.json");
                    jsonDeposits = FileManager.read(fileName);

                    System.out.println("Deposit made successfully!");
                    System.out.println("Thanks for using our banking plan\n");
                }
                if (number == 0) {
                    System.out.println("Thanks for using our banking plan\n");
                }
            }
            if (option == 2) {
                System.out.println("Choose the amount to withdraw:");
                System.out.println("1) 10 \n2) 20 \n3) 50 \n4) 80 \n5) Other");
                number = teclado.nextInt();
                if (number == 1) {
                    money.remove(amount);
                    //see in csv format
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 2) {
                    money.remove(amount);
                    //see in csv format
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 3) {
                    money.remove(amount);
                    //see in csv format
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 4) {
                    money.remove(amount);
                    //see in csv format
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 5) {
                    money.remove(amount);
                    //see in csv format
                    System.out.println("Enter the amount:");
                    amount = teclado.nextFloat();
                    System.out.println("Are you sure of this value? -> Yes(1)/No(0)");
                    number = teclado.nextInt();
                    if (number == 1) {
                        money.remove(amount);
                        //see in csv format
                        System.out.println("Withdraw made successfully!");
                        System.out.println("Thanks for using our banking plan\n");
                    }
                    if (number == 0) {
                        System.out.println("Thanks for using our banking plan\n");
                    }
                }

            }
            if (option == 3) {
                System.out.println("Enter full name of the account holder to transfer -> (No spaces)");
                name = teclado.next();
                System.out.println("Enter the amount to transfer:");
                amount = teclado.nextFloat();
                System.out.println("Enter the account number (20 digits): ");
                accountNumber = teclado.next();
                System.out.println("Check the data entered please!");
                saving = new Saving(name, accountNumber, amount, money, profits);
                System.out.println(saving);
                System.out.println("\nAre you sure of this action? -> Yes(1)/No(0)");
                number = teclado.nextInt();
                if (number == 1) {
                    money.remove(amount);
                    String transfers = saving.getName() + ";" + saving.getAmount() + ";"
                            + saving.getAccountNumber() + ";" + saving.getMoney() + ";" + saving.getProfits();
                    FileManager.save("data/SavingAccount/transfers.csv", transfers);

                    String fileName = "data/SavingAccount/transfers.csv";
                    FileManager.read(fileName);
                    transfers = FileManager.read(fileName);

                    Gson gson;
                    gson = new Gson();
                    saving = new Saving(name, accountNumber, amount, money, profits);
                    String jsonTransfers = gson.toJson(saving);
                    FileManager.save("data/SavingAccount/transfers.json", jsonTransfers);

                    fileName = ("data/SavingAccount/transfers.json");
                    jsonTransfers = FileManager.read(fileName);

                    System.out.println("Transfer made successfully!");
                    System.out.println("Thanks for using our banking plan\n");
                }
                if (number == 0) {
                    System.out.println("Thanks for using our banking plan\n");
                }

            }
            if (option == 4) {
                System.out.println("Thanks for using our banking plan");
                System.out.println("See you soon!");
                break;
            }
        }

    }
}
