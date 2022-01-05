/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;


import com.google.gson.Gson;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.io.FileReader;
import static java.lang.System.exit;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;




/**
 *
 * @author Leandor Quinga
 */
public class Farm {
       
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;                
        Gson gson;
        gson = new Gson();
        
        
        int option = 0;        
        
        while (option!=5){
            
            System.out.println("===================Menu======================");
            System.out.println("1.-add Chickens \n2.-add Cow \n3.-add Pig \n4.-add Sheep \n5.-Exit");
            System.out.println("=============================================");
            Scanner scanner =new Scanner(System.in);
            option = Integer.parseInt(scanner.next());
            
            
            
            if (option ==1){
                
                System.out.println("\n>>>>>>>>>>>>>>>>>Add chicken<<<<<<<<<<<<<<");
                
                System.out.println("list of devices from my home ");
                ArrayList<Chicken> chickens = new ArrayList<>();
                String fileName = "data/chicken/chicken.json";
               
                System.out.println(" --> FARMER \n " + chickens);
              
                System.out.println("\nid->");
                int id = scanner.nextInt();
                System.out.println("breed->");
                String breed = scanner.next();
                System.out.println("bornOn");
                boolean isMolting = scanner.nextBoolean();
            
                String farmer = "{\"id\":\""+id+"\",\"breed\":\""+breed+"\",\"isMolting\":\""+isMolting+"\"}\n";
                FileManager.save("data/farChicken.json", farmer);    
                    
            }
            if (option ==2){
                
                System.out.println("\n>>>>>>>>>>>>>>>>>Add Cow<<<<<<<<<<<<<<");
                
                System.out.println("list of devices from my home ");
                ArrayList<Cow> cows = new ArrayList<>();
                String fileName = "data/cow/cow.json";
                //cows = FileManager.read(fileName);
                System.out.println(" --> FARMER \n " + cows);
                
                System.out.println("\nid->");
                int id = scanner.nextInt();
                System.out.println("breed->");
                String breed = scanner.next();
                System.out.println("bornOn");
                boolean isProducingMilk = scanner.nextBoolean();
                
                //String cow = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + isProducingMilk + "\"}\n";
                //FileManager.save("data/farmCow.json", cow);
                
            }
            if (option==3){
                
                System.out.println("\n>>>>>>>>>>>>>>>>>Add Pig<<<<<<<<<<<<<<");
                
                System.out.println("list of devices from my home ");
                ArrayList<String> pigs = new ArrayList<>();
                String fileName = "data/pig/pig.json";
                //String pig = FileManager.read(fileName);
                System.out.println(" --> FARMER \n " + pigs);
                
                System.out.println("\nid->");
                int id = scanner.nextInt();
                System.out.println("breed->");
                String breed = scanner.next();
                System.out.println("bornOn");
                float getWhigth = scanner.nextFloat();
                
                //String pig = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getWhigth + "\"}\n";
                //FileManager.save("data/farmPig.json", pig);
                
                
            }
            if (option==4){
                
                System.out.println("\n>>>>>>>>>>>>>>>>>Add Sheep<<<<<<<<<<<<<<");
                
                System.out.println("list of devices from my home ");
                ArrayList<Sheep>sheeps = new ArrayList<>();
                String fileName = "data/sheep/sheep.json";
                //sheeps = FileManager.read(fileName);
                System.out.println(" --> FARMER \n " + sheeps);
                
                System.out.println("\nid->");
                int id = scanner.nextInt();
                System.out.println("breed->");
                String breed = scanner.next();
                System.out.println("bornOn");
                LocalDate getLastSheering = LocalDate.of(200, 05, 20);
                
                //String sheep = "{\"id\":\"" + id + "\",\"breed\":\"" + breed + "\",\"isMolting\":\"" + getLastSheering + "\"}\n";
                //FileManager.save("data/farmSheep.json", sheep);
                
            }
            if (option == 5){
                System.out.println("exit");
                exit(0);
            }
        }
    }
    
}
       

    
