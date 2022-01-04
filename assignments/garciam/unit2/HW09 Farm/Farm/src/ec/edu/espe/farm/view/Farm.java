package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.util.Scanner;
import utils.FileManager;

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

        System.out.println("HW09 by Mayerly Garcia");
        
        System.out.println("List of Farm chickens ");
        String chickens;
        String fileName = "data/chickens.csv";
        chickens =FileManager.read(fileName);
        System.out.println("--->CHICKENS \n"+ chickens);
        
        String chicken ="";
        FileManager.save("data/chickens.csv",chicken);
     
     
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
            System.out.println("1. Add Chicken ");
            System.out.println("2. Add Sheep ");
            System.out.println("3. Add pig");
            System.out.println("4. Add cow");
            System.out.println("5. out");

            System.out.println("Choose the any options ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Choose the Chicken");
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
                    System.out.println(" Choose the  sheep");
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
                    System.out.println(" Choose the pig ");
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
                     System.out.println(" Choose the cow ");
                    System.out.println(" ID->");
                    id = read.nextInt();
                    System.out.println(" name->");
                    name = read.next();
                    System.out.println(" Color->");
                    color = read.next();
                    System.out.println(" Age->");
                    age = read.nextInt();

                    break;
                case 5:
                    Exit = true;
                    break;
                default:
                    System.out.println("only numbers between 1 & 4");

            }

        }
}
}
    


