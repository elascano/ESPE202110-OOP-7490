
package es.edu.espe.ammunition.view;

import com.google.gson.Gson;
import ec.edu.espe.ammunition.model.Ammunition;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Alexander Ruano
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("List of devices from my home in jason format");
        ArrayList<String> ammunitions = new ArrayList<>();
        String fileName = "data/ammunition.json";
        ammunitions = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n" + ammunitions);

        System.out.println("\n---------------> DATA Ammunition1 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---  name  --> ");
        String name = scanner.next();
        System.out.println("---  color --> ");
        String color = scanner.next();
        System.out.println("---  model --> ");
        String model = scanner.next();

        Ammunition ammunition;
        ammunition = new Ammunition(name, color, model);

        Gson gson;
        gson = new Gson();

        String jsonAmmunition= gson.toJson(ammunition);
        FileManager.save(fileName, jsonAmmunition);
        
        ArrayList<Ammunition> ammunitionsList = new ArrayList<>();
        
        ammunitions = new ArrayList<>();
        fileName = "data/ammunition.json";
        ammunitions = FileManager.read(fileName);
        System.out.println(" --> AMMUNITION \n "+ ammunitions);
        
        for(String ammunitionString : ammunitions){
            System.out.println("device String --> " + ammunitionString + " <--");
            ammunitionsList.add(ammunition);
            ammunition = gson.fromJson(ammunitionString, Ammunition.class);
            System.out.println("device id -> " + ammunition.getName());
            
        }

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(ammunitionsList);
        
        String ammunitionsListJson;
        ammunitionsListJson = gson.toJson(ammunitionsList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(ammunitionsListJson);
        
    }
    
}
