package ec.edu.espe.hwFarm.view;

import static java.lang.System.exit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManagerFarm;

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
                System.out.println("list of devices from my home ");
                ArrayList<String> chickens = new ArrayList<>();
                String fileName = "data/farmChicken.json";
                chickens = FileManagerFarm.read(fileName);
                System.out.println(" --> FARMER \n " + chickens);

                System.out.println("\n--------> DATA CHICKEN <--------");
                scanner = new Scanner(System.in);
                System.out.println("---> id <---");
                int id = scanner.nextInt();
                System.out.println("---> breed <---");
                String breed = scanner.next();
                System.out.println("---> molting <---");
                boolean isMolting = scanner.nextBoolean();
                //LocalDate bornOn = LocalDate.of(2020, 06, 20);

                String farmer = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isMolting\":\""+isMolting+"\"}\n";
                FileManagerFarm.save("data/farChicken.json", farmer);


            } else {
                if (option == 2) {
                    System.out.println("list of devices from my home ");
                    ArrayList<String> cows = new ArrayList<>();
                    String fileName = "data/farmCow.json";
                    cows = FileManagerFarm.read(fileName);
                    System.out.println(" --> FARMER \n " + cows);

                    System.out.println("\n--------> DATA COW <--------");
                    scanner = new Scanner(System.in);
                    System.out.println("---> id <---");
                    int id = scanner.nextInt();
                    System.out.println("---> breed <---");
                    String breed = scanner.next();
                    System.out.println("---> Producing Milk <---");
                    boolean isProducingMilk = scanner.nextBoolean();
                    //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                    String cow = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + isProducingMilk + "\"}\n";
                    FileManagerFarm.save("data/farmCow.json", cow);


                } else {
                    if (option == 3) {
                        System.out.println("list of devices from my home ");
                        ArrayList<String> pigs = new ArrayList<>();
                        String fileName = "data/farmPig.json";
                        pigs = FileManagerFarm.read(fileName);
                        System.out.println(" --> FARMER \n " + pigs);

                        System.out.println("\n--------> DATA PIG <--------");
                        scanner = new Scanner(System.in);
                        System.out.println("---> id <---");
                        int id = scanner.nextInt();
                        System.out.println("---> breed <---");
                        String breed = scanner.next();
                        System.out.println("---> whigth <---");
                        float getWhigth = scanner.nextFloat();
                        //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                        String pig = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getWhigth + "\"}\n";
                        FileManagerFarm.save("data/farmPig.json", pig);


                    } else {
                        if (option == 4) {
                            System.out.println("list of devices from my home ");
                            ArrayList<String> sheeps = new ArrayList<>();
                            String fileName = "data/farmSheep.json";
                            sheeps = FileManagerFarm.read(fileName);
                            System.out.println(" --> FARMER \n " + sheeps);

                            System.out.println("\n--------> DATA SHEEP <--------");
                            scanner = new Scanner(System.in);
                            System.out.println("---> id <---");
                            int id = scanner.nextInt();
                            System.out.println("---> breed <---");
                            String breed = scanner.next();
                            System.out.println("---> last sheering <---");
                            LocalDate getLastSheering = LocalDate.of(200, 05, 20);
                            //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                            String sheep = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getLastSheering + "\"}\n";
                            FileManagerFarm.save("data/farmSheep.json", sheep);

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


