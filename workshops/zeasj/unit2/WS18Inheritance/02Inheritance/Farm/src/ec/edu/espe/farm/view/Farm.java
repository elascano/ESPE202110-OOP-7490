package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.Scanner;
import utils.FileManager;
import java.time.LocalDate;

/**
 *
 * @author Joel Zeas
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        int id = 0;
        String breed = "";
        Scanner teclado = new Scanner(System.in);
        int number;
        int option;
        int dayOfMonth;
        int month;
        int year;
        int dayOfMonthSheering;
        int monthSheering;
        int yearSheering;
        boolean isMolting = true;
        boolean isProducingMilk = true;
        float weight;
        LocalDate bornOn = LocalDate.of(2021, 10, 21);
        LocalDate lastSheering = LocalDate.of(2020, 12, 16);
        Chicken chicken = null;
        
        System.out.println("Autor: Joel Zeas ");
        System.out.println("    --> Welcome to the farm registration menu with JSON <--    ");
        System.out.println("Please, choose an option: ");
        System.out.println("Open menu: Yes(1) / No(0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("   --> Choose an option from the menu <--   \n");
            System.out.println("1.Add chickens");
            System.out.println("2.Add cows");
            System.out.println("3.Add pigs");
            System.out.println("4.Add sheep");
            System.out.println("5.Exit");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("     --> Data of the chicken <--     ");

                System.out.println("--> Enter Id = ");
                id = teclado.nextInt();
                System.out.println("--> Enter Breed = ");
                breed = teclado.next();
                System.out.println("--> Introduce Born On <-- ");
                System.out.println("--> Enter Year = ");
                year = teclado.nextInt();
                System.out.println("--> Enter Month = ");
                month = teclado.nextInt();
                System.out.println("--> Enter Day = ");
                dayOfMonth = teclado.nextInt();
                System.out.println("--> Enter isMolting = ");
                isMolting = teclado.nextBoolean();

                String chickens = chicken.getId() + ";" + chicken.getBreed() + ";"
                        + year + "-" + month + "-" + dayOfMonth + ";" + chicken.isIsMolting();
                FileManager.save("data/chickens.csv", chickens);

                System.out.println("List of my chickens");
                String fileName = ("data/chickens.csv");
                chickens = FileManager.read(fileName);
                System.out.println(" --> CHICKENS \n" + "Id;Breed;Born On;Is Molting \n" + chickens);
                

                chickens = "{" + "Id: " + "" + chicken.getId() + "" + ",\n" + "Breed:" + "" + chicken.getBreed() + "" + ",\n"
                        + "Born On: " + "" + year + "-" + month + "-" + dayOfMonth + "" + ",\n" + "Is Molting: " + "" + chicken.isIsMolting() + "" + "}";
                FileManager.save("data/chickens.json", chickens);

                System.out.println("\n List of my chickens in json format");
                chickens = "";
                fileName = ("data/chickens.json");
                chickens = FileManager.read(fileName);
                System.out.println(" --> CHICKENS \n" + chickens);

            }
      if (option == 2) {
                System.out.println("--> Enter data of the cow <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                breed = teclado.next();
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

                farmAnimal = new Cow(isProducingMilk, id, breed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Cow cow = new Cow(true, id, breed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + cow.getId());
                System.out.println("breed     -> " + cow.getBreed());
                System.out.println("born On -> " + year + "-" + month + "-" + dayOfMonth);
                System.out.println("isProducingMilk ->" + cow.isIsProducingMilk());
                System.out.println("\n");

                String cows = cow.getId() + ";" + cow.getBreed() + ";"
                        + year + "-" + month + "-" + dayOfMonth + ";" + cow.isIsProducingMilk();
                FileManager.save("data/cows.csv", cows);

                System.out.println("List of my cows");
                String fileName = "data/cows.csv";
                FileManager.read(fileName);
                cows = FileManager.read(fileName);
                System.out.println(" --> COWS \n" + "Id;Breed;Born On;Producing Milk \n" + cows);

                cows = "{" + "Id: " + "" + cow.getId() + "" + ",\n" + "Breed:" + "" + cow.getBreed() + "" + ",\n"
                        + "Born On: " + "" + year + "-" + month + "-" + dayOfMonth + "" + ",\n" + "Producing Milk: " + "" + cow.isIsProducingMilk() + "" + "}";
                FileManager.save("data/cows.json", cows);

                System.out.println("\n List of my cows in json format");
                cows = "";
                fileName = ("data/cows.json");
                cows = FileManager.read(fileName);
                System.out.println(" --> COWS \n" + cows);

            }
            if (option == 3) {
                System.out.println("--> Enter data of the pig <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                breed = teclado.next();
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

                farmAnimal = new Pig(weight, id, breed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Pig pig = new Pig(weight, id, breed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + pig.getId());
                System.out.println("breed     -> " + pig.getBreed());
                System.out.println("born On   -> " + year + "-" + month + "-" + dayOfMonth);
                System.out.println("weigh ->" + pig.getWeight());
                System.out.println("\n");

                String pigs = pig.getId() + ";" + pig.getBreed() + ";"
                        + year + "-" + month + "-" + dayOfMonth + ";" + pig.getWeight();
                FileManager.save("data/pigs.csv", pigs);

                System.out.println("List of my pigs");
                String fileName = "data/pigs.csv";
                FileManager.read(fileName);
                pigs = FileManager.read(fileName);
                System.out.println(" --> PIGS \n" + "Id;Breed;Born On;Weight \n" + pigs);

                pigs = "{" + "Id: " + "" + pig.getId() + "" + ",\n" + "Breed:" + "" + pig.getBreed() + "" + ",\n"
                        + "Born On: " + "" + year + "-" + month + "-" + dayOfMonth + "" + ",\n" + "Weight: " + "" + pig.getWeight() + "" + "}";
                FileManager.save("data/pigs.json", pigs);

                System.out.println("\n List of my pigs in json format");
                pigs = "";
                fileName = ("data/pigs.json");
                pigs = FileManager.read(fileName);
                System.out.println(" --> PIGS \n" + pigs);
            }

            if (option == 4) {
                System.out.println("--> Enter data of the sheep <-- ");
                System.out.println("Id --> ");
                id = teclado.nextInt();
                System.out.println("Breed --> ");
                breed = teclado.next();
                System.out.println("Born On : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                year = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                month = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonth = teclado.nextInt();
                System.out.println("Last Sheering : (Enter in number format) ");
                System.out.println("Introduce Year: --> ");
                yearSheering = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                monthSheering = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonthSheering = teclado.nextInt();
                System.out.println("\n");

                farmAnimal = new Sheep(lastSheering, id, breed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Sheep sheep = new Sheep(lastSheering, id, breed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + sheep.getId());
                System.out.println("breed     -> " + sheep.getBreed());
                System.out.println("born On   -> " + year + "-" + month + "-" + dayOfMonth);
                System.out.println("lastSheering ->" + +yearSheering + "-" + monthSheering + "-" + dayOfMonthSheering);
                System.out.println("\n");

                String sheeps = sheep.getId() + ";" + sheep.getBreed() + ";"
                        + year + "-" + month + "-" + dayOfMonth + ";"
                        + yearSheering + "-" + monthSheering + "-" + dayOfMonthSheering;
                FileManager.save("data/sheeps.csv", sheeps);

                System.out.println("List of my sheeps");
                String fileName = "data/sheeps.csv";
                FileManager.read(fileName);
                sheeps = FileManager.read(fileName);
                System.out.println(" --> SHEEPS \n" + "Id;Breed;Born On;Last Sheering\n" + sheeps);

                sheeps = "{" + "Id: " + "" + sheep.getId() + "" + ",\n" + "Breed:" + "" + sheep.getBreed() + "" + ",\n"
                        + "Born On: " + "" + year + "-" + month + "-" + dayOfMonth + "" + ",\n" + "Last Sheering: " + "" + yearSheering + "-" + monthSheering + "-" + dayOfMonthSheering + "" + "}";
                FileManager.save("data/sheeps.json", sheeps);

                System.out.println("\n List of my sheeps in json format");
                sheeps = "";
                fileName = ("data/sheeps.json");
                sheeps = FileManager.read(fileName);
                System.out.println(" --> SHEEPS \n" + sheeps);
            }
            if (option == 5) {
                break;
            }

        }

    }
}
