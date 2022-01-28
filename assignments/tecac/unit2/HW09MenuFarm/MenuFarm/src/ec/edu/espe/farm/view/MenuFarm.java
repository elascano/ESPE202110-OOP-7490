package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;
import com.google.gson.Gson;

/**
 *
 * @author Camila
 */
public class MenuFarm {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;
        int option;
        int dayOfMonth;
        int month;
        int year;
        int dayOfMonthSheering;
        int monthSheering;
        int yearSheering;
        int id = 0;
        String beed = "";
        boolean isMolting = true;
        boolean isProducingMilk = true;
        float weight;
        LocalDate bornOn = LocalDate.of(2021, 10, 21);
        LocalDate lastSheering = LocalDate.of(2020, 12, 16);
        Chicken chicken;

        FarmAnimal farmAnimal;

        System.out.println("HW09 --> Camila Teca <--");
        System.out.println("--> Menu for the Farm System <--");
        System.out.println("Do you want to open the menu? --> Yes(1) / No (0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("1.Add Chickens and Save in CSV and Json \n2.Add Cows and Save in CSV and Json \n3.Add Pigs and Save in CSV and Json \n4.Add Sheeps and Save in CSV and Json \n5.Exit\n");
            option = teclado.nextInt();

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

                farmAnimal = new Chicken(isMolting, id, beed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                chicken = new Chicken(isMolting, id, beed, bornOn);
                System.out.println("farmAnimal -> ");
                System.out.println("id        -> " + chicken.getId());
                System.out.println("breed     -> " + chicken.getBreed());
                System.out.println("born On -> " + year + "-" + month + "-" + dayOfMonth);
                System.out.println("isMolting ->" + chicken.isIsMolting());
                System.out.println("\n");

                String chickens = chicken.getId() + ";" + chicken.getBreed() + ";"
                        + year + "-" + month + "-" + dayOfMonth + ";" + chicken.isIsMolting();
                FileManager.save("data/chickens.csv", chickens);

                System.out.println("List of my chickens");
                String fileName = ("data/chickens.csv");
                chickens = FileManager.read(fileName);
                System.out.println(" --> CHICKENS \n" + "Id;Breed;Born On;Is Molting \n" + chickens);
                
                Gson gson;
                gson = new Gson();
                chicken = new Chicken(isMolting, id, beed, bornOn);
                String jsonChickens = gson.toJson(chicken);
                FileManager.save("data/chickens.json", jsonChickens);
                
                
                System.out.println("\n List of my chickens in json format");
                fileName = ("data/chickens.json");
                jsonChickens = FileManager.read(fileName);
                System.out.println(" --> CHICKENS \n" + jsonChickens);

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

                Gson gson;
                gson = new Gson();
                cow = new Cow(isProducingMilk, id, beed, bornOn);
                String jsonCows = gson.toJson(cow);
                FileManager.save("data/cows.json", jsonCows);
                
                
                System.out.println("\n List of my cows in json format");
                fileName = ("data/cows.json");
                jsonCows = FileManager.read(fileName);
                System.out.println(" --> COWS \n" + jsonCows);

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

                Gson gson;
                gson = new Gson();
                pig = new Pig(weight, id, beed, bornOn);
                String jsonPigs = gson.toJson(pig);
                FileManager.save("data/pigs.json", jsonPigs);
                
                
                System.out.println("\n List of my pigs in json format");
                fileName = ("data/pigs.json");
                jsonPigs = FileManager.read(fileName);
                System.out.println(" --> PIGS \n" + jsonPigs);
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
                yearSheering = teclado.nextInt();
                System.out.println("Introduce Month: --> ");
                monthSheering = teclado.nextInt();
                System.out.println("Introduce Day: --> ");
                dayOfMonthSheering = teclado.nextInt();
                System.out.println("\n");

                farmAnimal = new Sheep(lastSheering, id, beed, bornOn);
                System.out.println("farmAnimal is a " + farmAnimal.getClass());

                Sheep sheep = new Sheep(lastSheering, id, beed, bornOn);
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

                Gson gson;
                gson = new Gson();
                sheep = new Sheep(lastSheering, id, beed, bornOn);
                String jsonSheeps = gson.toJson(sheep);
                FileManager.save("data/sheeps.json", jsonSheeps);
                
                
                System.out.println("\n List of my sheeps in json format");
                fileName = ("data/sheeps.json");
                jsonSheeps = FileManager.read(fileName);
                System.out.println(" --> SHEEPS \n" + jsonSheeps);
            }
            if (option == 5) {
                break;
            }

        }

    }
}
