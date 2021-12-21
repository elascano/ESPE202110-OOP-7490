package ec.edu.espe.farm01.view;

import ec.edu.espe.farm01.model.Chicken01;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Altamirano Cristhian
 */
public class Farm01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id;
        String breed;
        boolean isMolting;
        boolean isProducingMilk;
        float weight;

        Integer option = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Farm System");
            System.out.println("What animal do you want enter?");
            System.out.println("Type the number");
            System.out.println("1. Chicken ");
            System.out.println("2. Cow");
            System.out.println("3. Pig");
            System.out.println("4. Sheep");
            System.out.println("5. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    String fileName = "data/chicken.csv";
                    String chickens;
                    chickens = FileManager.read(fileName);
                    String chicken;

                    System.out.println("Enter the data for the chicken");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("Molting status");
                    isMolting = sc.nextBoolean();
                    System.out.println("List of chickens ");
                    fileName = "data/chicken.csv";
                    System.out.println(" --> \n " + chickens);
                    chicken = id + ";" + breed + ";" + isMolting + "\n";
                    FileManager.save("data/chicken.csv", chicken);
                    break;

                case 2:
                    String FileName = "data/cow.csv";
                    String cows;
                    cows = FileManager.read(FileName);
                    String cow;

                    System.out.println("Enter the data for the cow");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("Milk status:");
                    isProducingMilk = sc.nextBoolean();
                    System.out.println("List of cows ");
                    FileName = "data/cow.csv";
                    System.out.println(" --> \n " + cows);
                    cow = id + ";" + breed + ";" + isProducingMilk + "\n";
                    FileManager.save("data/cow.csv", cow);
                    break;
                case 3:
                    String Filename = "data/pig.csv";
                    String pigs;
                    pigs = FileManager.read(Filename);
                    String pig;
                    
                    System.out.println("Enter the data for the pig");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("Weight:");
                    weight = sc.nextFloat();
                    System.out.println("List of pigs");
                    Filename = "data/pig.csv";
                    System.out.println(" --> \n " + pigs);
                    pig = id + ";" + breed + ";" + weight + "\n";
                    FileManager.save("data/pig.csv", pig);
                    break;

                case 4:
                    String FIleName = "data/sheep.csv";
                    String sheeps;
                    sheeps = FileManager.read(FIleName);
                    String sheep;

                    System.out.println("Enter the data for the sheep");
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Breed: ");
                    breed = sc.next();
                    System.out.println("List of sheeps");
                    FIleName = "data/sheep.csv";
                    System.out.println(" --> \n " + sheeps);
                    sheep = id + ";" + breed + ";" + "\n";
                    FileManager.save("data/sheep.csv", sheep);

                    break;
                case 5:
                    exit = true;
                    System.out.println("Successful exit, thanks for using the system");
                    break;

            }

        }
    }
}

