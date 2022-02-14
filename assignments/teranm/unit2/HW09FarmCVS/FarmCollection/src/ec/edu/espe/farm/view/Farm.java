package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Melanie
 */
public class Farm {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("Animals.csv", true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        System.out.println("HW09 --> Melanie Terán <--");

        FarmAnimal farmAnimal;
        
        ArrayList<Chicken> chickens = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        int id = 0;
        String breed = "any";
        boolean continuee = true;
        String bornOn;
        boolean isMolting;
        boolean isProducingMilk;
        float weight;
        String lastSheering;
        Chicken chicken;
        farmAnimal = new FarmAnimal(id, breed, LocalDate.MIN, chickens);

        while (continuee) {
            System.out.println("What animal do you want to enter?");
            System.out.println("1.Add Chickens");
            System.out.println("2.Add Cow");
            System.out.println("3.Add Pig");
            System.out.println("4.Add Sheep");
            System.out.println("Enter an option");

            Scanner menuInput = new Scanner(System.in);
            int option = menuInput.nextInt();

            if (option == 1) {
                printWriter.println("id,breed,bornOn,isMolting");
                while (continuee) {
                    System.out.println("-id  -->  ");
                    id = scanner.nextInt();

                    System.out.println("- breed --> ");
                    breed = scanner.next();

                    System.out.println("- enter molting status -->");
                    isMolting = scanner.nextBoolean();

                    System.out.println("- enter born On -->");
                    bornOn = scanner.next();
                    LocalDate localDate = LocalDate.parse(bornOn);

                    chicken = new Chicken(isMolting, id, breed, LocalDate.parse(bornOn));
                    farmAnimal.add(chicken);

                    printWriter.println(id + "," + breed + "," + bornOn + "," + isMolting);

                    System.out.print("\nDo you want to enter another chicken ");
                    System.out.println("Y / N ");

                    Scanner getInput = new Scanner(System.in);
                    String opc = getInput.next();

                    if (opc.equals("y") || opc.equals("Y")) {
                        continuee = true;
                    } else {
                        continuee = false;
                    }
                }
            } else if (option == 2) {
                printWriter.println("id,breed,bornOn,isProducingMilk");
                System.out.println("-id  -->  ");
                id = scanner.nextInt();

                System.out.println("- breed --> ");
                breed = scanner.next();

                System.out.println("- enter Producing Milk status -->");
                isProducingMilk = scanner.nextBoolean();

                System.out.println("- enter born On -->");
                bornOn = scanner.next();
                LocalDate localDate = LocalDate.parse(bornOn);

                printWriter.println(id + "," + breed + "," + bornOn + "," + isProducingMilk);

            } else if (option == 3) {
                printWriter.println("id,breed,bornOn,weight");
                System.out.println("-id  -->  ");
                id = scanner.nextInt();

                System.out.println("- breed --> ");
                breed = scanner.next();

                System.out.println("- enter weight -->");
                weight = scanner.nextFloat();

                System.out.println("- enter born On -->");
                bornOn = scanner.next();
                LocalDate localDate = LocalDate.parse(bornOn);

                printWriter.println(id + "," + breed + "," + bornOn + "," + weight);

            } else if (option == 4) {
                printWriter.println("id,breed,bornOn,lastSheering");
                System.out.println("-id  -->  ");
                id = scanner.nextInt();

                System.out.println("- breed --> ");
                breed = scanner.next();

                System.out.println("- enter lastSheering date -->");
                lastSheering = scanner.next();
                LocalDate localDate = LocalDate.parse(lastSheering);

                System.out.println("- enter born On -->");
                bornOn = scanner.next();
                localDate = LocalDate.parse(bornOn);

                printWriter.println(id + "," + breed + "," + bornOn + "," + lastSheering);

            } else {

            }

            System.out.println("\nDo you want to enter another animal ");
            System.out.println("Y / N ");

            Scanner getInput = new Scanner(System.in);
            String opc = getInput.next();

            if (opc.equals("y") || opc.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }
        }

        printWriter.close();

        System.out.println("file Animals.csv has been created");

    }
}
