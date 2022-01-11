
package ec.edu.espe.farm.view;

/**
 *
 * @author Daniel Lincango
 */


import static java.lang.System.exit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Daniel Lincango
 */
public class FarmSystem {

    public static void main(String[] args) {

        Integer option = 0;
        while (option >= 0) {

            System.out.println("\n----------->Chicken farm set<-----------\n");
            System.out.println("=================================");
            System.out.println("1.-Add Chicken\n2.-Add Cow");
            System.out.println("3.-Add Pig\n4.-Add Sheep");
            System.out.println("5.-Exit");
            System.out.println("=================================");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            if (option == 1) {
                System.out.println("Please enter new chicken ");
                ArrayList<String> chickens = new ArrayList<>();
                String fileName = "data/farmChicken.json";
                chickens = FileManager.read(fileName);
                System.out.println(" --> FARMER \n " + chickens);

                System.out.println("\nxxxxxx DATA CHICKEN xxxxx ");
                scanner = new Scanner(System.in);
                System.out.println("Enter id;");
                int id = scanner.nextInt();
                System.out.println("Enterbreed; ");
                String breed = scanner.next();
                System.out.println("Enter molting; ");
                boolean isMolting = scanner.nextBoolean();
                LocalDate bornOn = LocalDate.of(2020, 06, 20);

                String farmer = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isMolting\":\""+isMolting+"\"}\n";
                FileManager.save("data/farChicken.json", farmer);


            } else {
                if (option == 2) {
                    System.out.println("list for chicken for farm");
                    ArrayList<String> cows = new ArrayList<>();
                    String fileName = "data/farmCow.json";
                    cows = FileManager.read(fileName);
                    System.out.println(" --> FARMER \n " + cows);

                    System.out.println("\nxxxxx DATA COW xxxxx");
                    scanner = new Scanner(System.in);
                    System.out.println("Enter id;");
                    int id = scanner.nextInt();
                    System.out.println("Enter breed ;");
                    String breed = scanner.next();
                    System.out.println("---> Producing Milk <---");
                    boolean isProducingMilk = scanner.nextBoolean();
                    //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                    String cow = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + isProducingMilk + "\"}\n";
                    FileManager.save("data/farmCow.json", cow);

                    
                } else {
                    if (option == 3) {
                        System.out.println("list of devices from my home ");
                        ArrayList<String> pigs = new ArrayList<>();
                        String fileName = "data/farmPig.json";
                        pigs = FileManager.read(fileName);
                        System.out.println(" --> FARMER \n " + pigs);

                        System.out.println("\nxxxxx DATA PIG xxxxx");
                        scanner = new Scanner(System.in);
                        System.out.println("Enter id; ");
                        int id = scanner.nextInt();
                        System.out.println("Enter breed ");
                        String breed = scanner.next();
                        System.out.println("Enter whigth;");
                        float getWhigth = scanner.nextFloat();
                        //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                        String pig = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getWhigth + "\"}\n";
                        FileManager.save("data/farmPig.json", pig);


                    } else {
                        if (option == 4) {
                            System.out.println("list of devices from my home ");
                            ArrayList<String> sheeps = new ArrayList<>();
                            String fileName = "data/farmSheep.json";
                            sheeps = FileManager.read(fileName);
                            System.out.println(" --> FARMER \n " + sheeps);

                            System.out.println("\nxxxxx DATA SHEEP xxxxx");
                            scanner = new Scanner(System.in);
                            System.out.println("Enter id;");
                            int id = scanner.nextInt();
                            System.out.println("Enter breed; ");
                            String breed = scanner.next();
                            System.out.println("Enter last sheering;");
                            LocalDate getLastSheering = LocalDate.of(200, 05, 20);
                            //LocalDate bornOn = LocalDate.of(2020, 06, 20);
                            String sheep = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getLastSheering + "\"}\n";
                            FileManager.save("data/farmSheep.json", sheep);

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
