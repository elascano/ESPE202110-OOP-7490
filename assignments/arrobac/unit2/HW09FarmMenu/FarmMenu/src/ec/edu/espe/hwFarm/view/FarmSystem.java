package ec.edu.espe.hwFarm.view;

import static java.lang.System.exit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManagerFarm;

/**
 *
 * @author Cristian Arroba
 */
public class FarmSystem {

    public static void main(String[] args) {

        Integer option = 0;
        while (option >= 0) {

            System.out.println("\n Welcome to Farm Chicken \n");
            System.out.println("--------------------------------");
            System.out.println("1.-Add Chicken\n2.-Add Cow");
            System.out.println("3.-Add Pig\n4.-Add Sheep");
            System.out.println("5.-Exit");
            System.out.println("--------------------------------");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            if (option == 1) {
                System.out.println("CHICKEN");
                ArrayList<String> chickens = new ArrayList<>();
                String fileName = "data/Chicken.json";
                chickens = FileManagerFarm.read(fileName);
                System.out.println(" --> Chickens \n " + chickens);

                System.out.println("\n--------> DATA CHICKEN <--------");
                scanner = new Scanner(System.in);
                System.out.println("---> id <---");
                int id = scanner.nextInt();
                System.out.println("---> breed <---");
                String breed = scanner.next();
                System.out.println("---> molting <---");
                boolean isMolting = scanner.nextBoolean();
                LocalDate bornOn = LocalDate.of(2020, 06, 20);

                String chicken = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isMolting\":\""+isMolting+"\",\"bornOn\":\""+bornOn+"\"}\n";
                FileManagerFarm.save("data/Chicken.json", chicken);


            } else {
                if (option == 2) {
                    System.out.println("COW");
                    ArrayList<String> cows = new ArrayList<>();
                    String fileName = "data/Cow.json";
                    cows = FileManagerFarm.read(fileName);
                    System.out.println(" --> Cow \n " + cows);

                    System.out.println("\n--------> DATA COW <--------");
                    scanner = new Scanner(System.in);
                    System.out.println("---> id <---");
                    int id = scanner.nextInt();
                    System.out.println("---> breed <---");
                    String breed = scanner.next();
                    System.out.println("---> Producing Milk <---");
                    boolean isProducingMilk = scanner.nextBoolean();
                    LocalDate bornOn = LocalDate.of(2020, 06, 20);
                    String cow = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isProducingMilk\":\""+isProducingMilk+"\",\"bornOn\":\""+bornOn+"\"}\n";
                    FileManagerFarm.save("data/Cow.json",cow);


                } else {
                    if (option == 3) {
                        System.out.println("PIG");
                        ArrayList<String> pigs = new ArrayList<>();
                        String fileName = "data/Pig.json";
                        pigs = FileManagerFarm.read(fileName);
                        System.out.println(" --> Pig \n " + pigs);

                        System.out.println("\n--------> DATA PIG <--------");
                        scanner = new Scanner(System.in);
                        System.out.println("---> ID <---");
                        int id = scanner.nextInt();
                        System.out.println("---> Breed <---");
                        String breed = scanner.next();
                        System.out.println("---> Weight <---");
                        float getWeight = scanner.nextFloat();
                        LocalDate bornOn = LocalDate.of(2020, 06, 20);
                        String pig = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"getWeight\":\""+getWeight+"\",\"bornOn\":\""+bornOn+"\"}\n";
                        FileManagerFarm.save("data/Pig.json", pig);


                    } else {
                        if (option == 4) {
                            System.out.println("SHEEP");
                            ArrayList<String> sheeps = new ArrayList<>();
                            String fileName = "data/Sheep.json";
                            sheeps = FileManagerFarm.read(fileName);
                            System.out.println(" --> Sheep \n " + sheeps);

                            System.out.println("\n--------> DATA SHEEP <--------");
                            scanner = new Scanner(System.in);
                            System.out.println("---> id <---");
                            int id = scanner.nextInt();
                            System.out.println("---> breed <---");
                            String breed = scanner.next();
                            System.out.println("---> last sheering <---");
                            LocalDate getLastSheering = LocalDate.of(200, 05, 20);
                            LocalDate bornOn = LocalDate.of(2020, 06, 20);
                            String sheep = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"getLastSheering\":\""+getLastSheering+"\",\"bornOn\":\""+bornOn+"\"}\n";
                            FileManagerFarm.save("data/Sheep.json", sheep);

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


