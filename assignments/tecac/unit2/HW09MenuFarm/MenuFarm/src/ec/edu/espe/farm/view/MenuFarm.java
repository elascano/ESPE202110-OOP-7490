package ec.edu.espe.farm.view;

import com.csvreader.CsvWriter;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Camila
 */
public class MenuFarm {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;
        int option;
        int dayOfMonth = 1;
        int month = 1;
        int year = 1;
        int id = 0;
        String beed = "";
        boolean isMolting = true;
        boolean isProducingMilk = true;
        float weight;
        LocalDate bornOn = LocalDate.of(year, month, dayOfMonth);
        LocalDate lastSheering = LocalDate.of(2020, 12, 16);
        Chicken chicken;
        FarmAnimal farmAnimal;
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();

        System.out.println("HW09 --> Camila Teca <--");
        System.out.println("--> Menu for the Farm System <--");
        System.out.println("Do you want to open the menu? --> Yes(1) / No (0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("1.Add Chickens\n2.Add Cows\n3.Add Pigs\n4.Add Sheeps\n5.Exit\n");
            option = teclado.nextInt();
            //almacenar cada dato en un archivo : investigar y programar//
            //leer datos localdate//
            //revisar la opcion 1 no vale totalmente, ni los arrays//
            if (option == 1) {
                System.out.println("--> Enter data of the chicken <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                beed = teclado.next();
                System.out.println("Born On : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("Is Molting --> ");
                isMolting = teclado.nextBoolean();

                System.out.println("\n");
                chickens.add(new Chicken(isMolting, id, beed, bornOn));
                System.out.println("chicken: --> " + chickens);
                System.out.println("\n");

            }
            if (option == 2) {
                System.out.println("--> Enter data of the cow <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                beed = teclado.next();
                System.out.println("Born On : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("isProducingMilk --> ");
                isProducingMilk = teclado.nextBoolean();
                System.out.println("\n");

                farmAnimal = new Cow(isProducingMilk, id, beed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Cow cow = new Cow(true, id, beed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + cow.getId());
                System.out.println("breed     -> " + cow.getBreed());
                System.out.println("born On -> " + cow.getBornOn());
                System.out.println("isProducingMilk ->" + cow.isIsProducingMilk());
                System.out.println("\n");
            }
            if (option == 3) {
                System.out.println("--> Enter data of the pig <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                beed = teclado.next();
                System.out.println("Born On : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("Weight --> ");
                weight = teclado.nextFloat();
                System.out.println("\n");

                farmAnimal = new Pig(weight, id, beed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Pig pig = new Pig(weight, id, beed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + pig.getId());
                System.out.println("breed     -> " + pig.getBreed());
                System.out.println("born On   -> " + pig.getBornOn());
                System.out.println("weigh ->" + pig.getWeight());
                System.out.println("\n");
            }

            if (option == 4) {
                System.out.println("--> Enter data of the sheep <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                beed = teclado.next();
                System.out.println("Born On : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("Last Sheering : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("\n");

                farmAnimal = new Sheep(lastSheering, id, beed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Sheep sheep = new Sheep(lastSheering, id, beed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + sheep.getId());
                System.out.println("breed     -> " + sheep.getBreed());
                System.out.println("born On   -> " + sheep.getBornOn());
                System.out.println("lastSheering ->" + sheep.getLastSheering());
                System.out.println("\n");
            }
            if (option == 5) {
                break;
            }

        }

    }

    public static void ExportarCSV(Chicken chickens) throws IOException {
        String outputFile = "Chickens.csv";
        boolean exist = new File(outputFile).exists();

        if (exist) {
            File cowFile = new File(outputFile);
            cowFile.delete();
        } else {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(outputFile, true), ',');

            outputCSV.write("Id");
            outputCSV.write("Breed");
            outputCSV.write("Born On");
            outputCSV.write("Is Molting");

            outputCSV.endRecord();

            for (Chicken chicken : chickens) {
                outputCSV.write(chicken.getId());
                outputCSV.write(chicken.getBreed());
                outputCSV.write(chicken.getBornOn());
                outputCSV.write(chicken.isIsMolting());

                outputCSV.endRecord();

            }
            outputCSV.close();

        }
    }

    public static void ExportarCSV(Cow cows) throws IOException {
        String outputFile = "Cows.csv";
        boolean exist = new File(outputFile).exists();

        if (exist) {
            File cowFile = new File(outputFile);
            cowFile.delete();
        } else {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(outputFile, true), ',');

            outputCSV.write("Id");
            outputCSV.write("Breed");
            outputCSV.write("Born On");
            outputCSV.write("Producing Milk");

            outputCSV.endRecord();

            for (Cow cow : cows) {
                outputCSV.write(cow.getId());
                outputCSV.write(cow.getBreed());
                outputCSV.write(cow.getBornOn());
                outputCSV.write(cow.isIsProducingMilk());

                outputCSV.endRecord();

            }
            outputCSV.close();

        }
    }

    public static void ExportarCSV(Pig pig) throws IOException {
        String outputFile = "Pigs.csv";
        boolean exist = new File(outputFile).exists();

        if (exist) {
            File cowFile = new File(outputFile);
            cowFile.delete();
        } else {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(outputFile, true), ',');

            outputCSV.write("Id");
            outputCSV.write("Breed");
            outputCSV.write("Born On");
            outputCSV.write("Weight");

            outputCSV.endRecord();

            for (Pig pig : pigs) {
                outputCSV.write(pig.getId());
                outputCSV.write(pig.getBreed());
                outputCSV.write(pig.getBornOn());
                outputCSV.write(pig.getWeight());

                outputCSV.endRecord();

            }
            outputCSV.close();

        }
    }

    public static void ExportarCSV(Sheep sheeps) throws IOException {
        String outputFile = "Sheeps.csv";
        boolean exist = new File(outputFile).exists();

        if (exist) {
            File cowFile = new File(outputFile);
            cowFile.delete();
        } else {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(outputFile, true), ',');

            outputCSV.write("Id");
            outputCSV.write("Breed");
            outputCSV.write("Born On");
            outputCSV.write("Last Sheering");

            outputCSV.endRecord();

            for (Sheep sheep : sheeps) {
                outputCSV.write(sheep.getId());
                outputCSV.write(sheep.getBreed());
                outputCSV.write(sheep.getBornOn());
                outputCSV.write(sheep.getLastSheering());

                outputCSV.endRecord();

            }
            outputCSV.close();

        }
    }

}
