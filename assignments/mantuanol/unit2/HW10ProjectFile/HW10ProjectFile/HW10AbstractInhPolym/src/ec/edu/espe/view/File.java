package ec.edu.espe.view;

import java.io.FileWriter;
import ec.edu.espe.model.Chicken;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Leonel Mantuano
 */
public class File {
    public static void main(String[] args) {
        int id;
        String streed;
        LocalDate bornOn;
        boolean isMolting;
        boolean isProducingMilk;
        float weight;
        LocalDate lastSheering;
        
        System.out.println("Welcome, please select one option");
        System.out.println("1. Read File in csv");
        System.out.println("2. Save File in csv");
        System.out.println("3. Find objects in csv");
        System.out.println("4. Read File in json");
        System.out.println("5. Save File in json");
        System.out.println("6. Find objects in json");
        System.out.println("7. Exit");
        
        Scanner scanner= new Scanner(System.in);
        ArrayList<String>animals=new ArrayList<>();
        String fileName;
        fileName="data/animals.csv";
        
        Gson gson;
        gson=new Gson();
        
        int opcion=0;
            while(opcion!=7){
                opcion=scanner.nextInt();
                switch(opcion){
                    case 1:
                        animals=FileManager.read(fileName);
                        System.out.println("--> \n" + animals);
                        System.out.println("Please re-insert an option");
                        break;
                    case 2:
                        ArrayList animal= new ArrayList<>();
                        System.out.println("Please select the kind of Animal");
                        System.out.println(" Mateo Landazuri OOP");
                        System.out.println("1. Chicken");
                        System.out.println("2. Cow");
                        System.out.println("3. Pig");
                        System.out.println("4. Sheep");
                        
                        int kindOfAnimal;
                        kindOfAnimal=scanner.nextInt();
                        
                        switch(kindOfAnimal){
                            case 1:
                                System.out.println("Insert the dates of the chicken");
                                System.out.println("-id -->");
                                id=scanner.nextInt();
                                System.out.println("-breed -->");
                                streed=scanner.next();
                                System.out.println("-Year of born-->");
                                int yearChicken=scanner.nextInt();
                                System.out.println("-Month of born-->");
                                int monthChicken=scanner.nextInt();
                                System.out.println("-Day of born-->");
                                int dayChicken=scanner.nextInt();
                                System.out.println("Enter molting status");
                                isMolting=scanner.nextBoolean();
                                bornOn=LocalDate.of(yearChicken,monthChicken,dayChicken);
                        
                                animal.add(id);
                                animal.add(streed);
                                animal.add(bornOn);
                                animal.add(isMolting);
                        
                                FileManager.save("data/animals.csv", animal.toString());
                                break;
                            case 2:
                                System.out.println("Insert the dates of the cow");
                                System.out.println("-id -->");
                                id=scanner.nextInt();
                                System.out.println("-breed -->");
                                streed=scanner.next();
                                System.out.println("-Year of born-->");
                                int yearCow=scanner.nextInt();
                                System.out.println("-Month of born-->");
                                int monthCow=scanner.nextInt();
                                System.out.println("-Day of born-->");
                                int dayCow=scanner.nextInt();
                                System.out.println("Enter milk status");
                                isProducingMilk=scanner.nextBoolean();
                                bornOn=LocalDate.of(yearCow,monthCow,dayCow);
                        
                                animal.add(id);
                                animal.add(streed);
                                animal.add(bornOn);
                                animal.add(isProducingMilk);
                        
                                FileManager.save("data/animals.csv", animal.toString());
                                break;
                            case 3:
                                System.out.println("Insert the dates of the pig");
                                System.out.println("-id -->");
                                id=scanner.nextInt();
                                System.out.println("-breed -->");
                                streed=scanner.next();
                                System.out.println("-Year of born-->");
                                int yearPig=scanner.nextInt();
                                System.out.println("-Month of born-->");
                                int monthPig=scanner.nextInt();
                                System.out.println("-Day of born-->");
                                int dayPig=scanner.nextInt();
                                System.out.println("Enter weight");
                                weight=scanner.nextFloat();
                                bornOn=LocalDate.of(yearPig,monthPig,dayPig);
                        
                                animal.add(id);
                                animal.add(streed);
                                animal.add(bornOn);
                                animal.add(weight);
                        
                                FileManager.save("data/animals.csv", animal.toString());
                                break;
                            case 4:
                                System.out.println("Insert the dates of the sheep");
                                System.out.println("-id -->");
                                id=scanner.nextInt();
                                System.out.println("-breed -->");
                                streed=scanner.next();
                                System.out.println("-Year of born-->");
                                int yearSheep=scanner.nextInt();
                                System.out.println("-Month of born-->");
                                int monthSheep=scanner.nextInt();
                                System.out.println("-Day of born-->");
                                int daySheep=scanner.nextInt();
                                System.out.println("-Year of last sheering-->");
                                int yearSheering=scanner.nextInt();
                                System.out.println("-Month of last sheering-->");
                                int monthSheering=scanner.nextInt();
                                System.out.println("-Day of last sheering-->");
                                int daySheering=scanner.nextInt();
                                bornOn=LocalDate.of(yearSheep,monthSheep,daySheep);
                                lastSheering=LocalDate.of(yearSheering,monthSheering,daySheering);
                                
                                animal.add(id);
                                animal.add(streed);
                                animal.add(bornOn);
                                animal.add(lastSheering);
                        
                                FileManager.save("data/animals.csv", animal.toString());
                                break;
                            default:
                                    System.out.println("Invalid option");
                                    System.out.println("Please re-insert an option");
                                    break;
                        }
                        
                        System.out.println("Please re-insert an option");
                        break;
                    case 3:
                        System.out.println("Please re-insert an option");
                        break;
                    case 4:
                        fileName = "data/animals.json";
                        animals = FileManager.read(fileName);
                        System.out.println("--> \n" + animals);
                        System.out.println("Please re-insert an option");
                        break;
                    case 5:
                        ArrayList<Chicken>animalsList=new ArrayList<>();
                        
                        animals= new  ArrayList<>();
                        for(String animalString : animals){
                            System.out.println("animal String --> " + animalString + " <--");
                            Chicken chickens= new Chicken(false,005,"Leghorn",LocalDate.of(2019,07,22));
                            animalsList.add(chickens);
                            chickens = gson.fromJson(animalString,Chicken.class);
                            System.out.println("chicken id" + chickens.getId());
                        }
                        System.out.println("The ArrayList of Animals is \n");
                        System.out.println(animalsList);
                        
                        String jsonAnimal=gson.toJson(animalsList);
                        System.out.println("The json array created using gson library is -> ");
                        System.out.println(jsonAnimal);
                        System.out.println("Please re-insert an option");
                        break;
                    case 6:
                        System.out.println("Please re-insert an option");
                        break;    
                     default:
                        System.out.println("Invalid option");
                        System.out.println("Please re-insert an option");
                        break;
                }
            }
    }
}
