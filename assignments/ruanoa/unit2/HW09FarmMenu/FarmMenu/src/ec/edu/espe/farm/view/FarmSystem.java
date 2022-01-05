package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import static java.lang.System.exit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Alexander Ruano
 */
public class FarmSystem {

    public static void main(String[] args) {

        Integer option = 0;
        while (option >= 0) {

            System.out.println("\n----------------Welcome to Farm chicken-------------\n");
            System.out.println("--------------------------------");
            System.out.println("1.-Add Chicken\n2.-Add Cow");
            System.out.println("3.-Add Pig\n4.-Add Sheep");
            System.out.println("5.-Exit");
            System.out.println("--------------------------------");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            if (option == 1) {

                System.out.println("list of chicken ");
                ArrayList<String> chickens = new ArrayList<>();
                String fileName = "data/farmChicken.json";
                chickens = FileManager.read(fileName);
                System.out.println(" --> CHICKEN \n " + chickens);

                System.out.println("\n--------> DATA CHICKEN <--------");
                scanner = new Scanner(System.in);
                System.out.println("---> id <---");
                int id = scanner.nextInt();
                System.out.println("---> breed <---");
                String breed = scanner.next();
                System.out.println("---> molting <---");
                boolean isMolting = scanner.nextBoolean();
                LocalDate bornOn = LocalDate.of(2020, 06, 20);

                Chicken chicken;
                chicken = new Chicken(isMolting, id, breed, bornOn);

                Gson gson;
                gson = new Gson();

                String jsonChicken = gson.toJson(chicken);
                FileManager.save(fileName, jsonChicken);

                ArrayList<Chicken> chickensList = new ArrayList<>();

                chickens = new ArrayList<>();
                fileName = "data/farmChicken.json";
                chickens = FileManager.read(fileName);
                System.out.println(" --> DEVICES \n " + chickens);

                for (String chickenString : chickens) {
                    System.out.println("device String --> " + chickenString + " <--");
                    chickensList.add(chicken);
                    chicken = gson.fromJson(chickenString, Chicken.class);
                    System.out.println("device id -> " + chicken.getId());

                }

                System.out.println("The ArrayList of Devices is [][][][][] \n ");
                System.out.println(chickensList);

                String chickensListJson;
                chickensListJson = gson.toJson(chickensList);
                System.out.println("The json array created using gson library is -> ");
                System.out.println(chickensListJson);

                /*String chicken = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isMolting\":\""+isMolting+"\",\"bornOn\":\""+bornOn+"\"}\n";
                FileManagerFarm.save("data/farmChicken.json", chicken);*/
            } else {
                if (option == 2) {
                    System.out.println("list of cow ");
                    ArrayList<String> cows = new ArrayList<>();
                    String fileName = "data/farmCow.json";
                    cows = FileManager.read(fileName);
                    System.out.println(" --> COW \n " + cows);

                    System.out.println("\n--------> DATA COW <--------");
                    scanner = new Scanner(System.in);
                    System.out.println("---> id <---");
                    int id = scanner.nextInt();
                    System.out.println("---> breed <---");
                    String breed = scanner.next();
                    System.out.println("---> Producing Milk <---");
                    boolean isProducingMilk = scanner.nextBoolean();
                    LocalDate bornOn = LocalDate.of(2020, 06, 20);
                    
                    FarmAnimal cow;
                    cow = new Cow(isProducingMilk, id, breed, bornOn);

                    Gson gson;
                    gson = new Gson();

                    String jsonDevice = gson.toJson(cow);
                    FileManager.save(fileName, jsonDevice);

                    ArrayList<FarmAnimal> devicesList = new ArrayList<>();

                    cows = new ArrayList<>();
                    fileName = "data/farmCow.json";
                    cows = FileManager.read(fileName);
                    System.out.println(" --> DEVICES \n " + cows);

                    for (String deviceString : cows) {
                        System.out.println("device String --> " + deviceString + " <--");
                        devicesList.add(cow);
                        cow = gson.fromJson(deviceString, Chicken.class);
                        System.out.println("device id -> " + cow.getId());

                    }

                    System.out.println("The ArrayList of Devices is [][][][][] \n ");
                    System.out.println(devicesList);

                    String devicesListJson;
                    devicesListJson = gson.toJson(devicesList);
                    System.out.println("The json array created using gson library is -> ");
                    System.out.println(devicesListJson);
                    
                  /*  String cow = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + isProducingMilk + "\",\"isMolting\":\""+bornOn+"\"}\n";
                    FileManager.save("data/farmCow.json", cow);*/

                } else {
                    if (option == 3) {
                        System.out.println("list of Pig ");
                        ArrayList<String> pigs = new ArrayList<>();
                        String fileName = "data/farmPig.json";
                        pigs = FileManager.read(fileName);
                        System.out.println(" --> PIG \n " + pigs);

                        System.out.println("\n--------> DATA PIG <--------");
                        scanner = new Scanner(System.in);
                        System.out.println("---> id <---");
                        int id = scanner.nextInt();
                        System.out.println("---> breed <---");
                        String breed = scanner.next();
                        System.out.println("---> whigth <---");
                        float getWhigth = scanner.nextFloat();
                        LocalDate bornOn = LocalDate.of(2020, 06, 20);

                        FarmAnimal pig;
                        pig = new Pig(getWhigth, id, breed, bornOn);

                        Gson gson;
                        gson = new Gson();

                        String jsonDevice = gson.toJson(pig);
                        FileManager.save(fileName, jsonDevice);

                        ArrayList<FarmAnimal> devicesList = new ArrayList<>();

                        pigs = new ArrayList<>();
                        fileName = "data/farmPig.json";
                        pigs = FileManager.read(fileName);
                        System.out.println(" --> DEVICES \n " + pigs);

                        for (String deviceString :pigs) {
                            System.out.println("device String --> " + deviceString + " <--");
                            devicesList.add(pig);
                            pig = gson.fromJson(deviceString, Chicken.class);
                            System.out.println("device id -> " + pig.getId());

                        }

                        System.out.println("The ArrayList of Devices is [][][][][] \n ");
                        System.out.println(devicesList);

                        String devicesListJson;
                        devicesListJson = gson.toJson(devicesList);
                        System.out.println("The json array created using gson library is -> ");
                        System.out.println(devicesListJson);
                        
                        /*String pig = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getWhigth +"\",\"isMolting\":\""+bornOn+"\"}\n";
                        FileManager.save("data/farmPig.json", pig);*/

                    } else {
                        if (option == 4) {
                            System.out.println("list of sheep ");
                            ArrayList<String> sheeps = new ArrayList<>();
                            String fileName = "data/farmSheep.json";
                            sheeps = FileManager.read(fileName);
                            System.out.println(" --> SHEEPS \n " + sheeps);

                            System.out.println("\n--------> DATA SHEEP <--------");
                            scanner = new Scanner(System.in);
                            System.out.println("---> id <---");
                            int id = scanner.nextInt();
                            System.out.println("---> breed <---");
                            String breed = scanner.next();
                            System.out.println("---> last sheering <---");
                            LocalDate getLastSheering = LocalDate.of(200, 05, 20);
                            LocalDate bornOn = LocalDate.of(2020, 06, 20);

                            FarmAnimal sheep;
                            sheep = new Sheep(getLastSheering, id, breed, bornOn);

                            Gson gson;
                            gson = new Gson();

                            String jsonDevice = gson.toJson(sheep);
                            FileManager.save(fileName, jsonDevice);

                            ArrayList<FarmAnimal> devicesList = new ArrayList<>();

                            sheeps = new ArrayList<>();
                            fileName = "data/farmSheep.json";
                            sheeps = FileManager.read(fileName);
                            System.out.println(" --> DEVICES \n " + sheeps);

                            for (String deviceString : sheeps) {
                                System.out.println("device String --> " + deviceString + " <--");
                                devicesList.add(sheep);
                                sheep = gson.fromJson(deviceString, Chicken.class);
                                System.out.println("device id -> " + sheep.getId());

                            }

                            System.out.println("The ArrayList of Devices is [][][][][] \n ");
                            System.out.println(devicesList);

                            String devicesListJson;
                            devicesListJson = gson.toJson(devicesList);
                            System.out.println("The json array created using gson library is -> ");
                            System.out.println(devicesListJson);

                            /*String sheep = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getLastSheering +"\",\"isMolting\":\""+bornOn+"\"}\n";
                            FileManager.save("data/farmSheep.json", sheep);*/

                        } else {
                            if (option == 5) {
                                exit(0);
                            }
                        }
                    }

                }

            }
        }

    }

}

