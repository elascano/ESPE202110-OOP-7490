
package es.edu.espe.time.view;

import com.google.gson.Gson;
import ec.edu.espe.time.model.Time;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Paul Saltos
 */
public class TimeMain {
    public static void main(String[] args) {

        System.out.println("List of devices from my home in jason format");
        ArrayList<String> times = new ArrayList<>();
        String fileName = "data/time.json";
        times = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n" + times);

        System.out.println("\n---------------> DATA Time <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---  id  --> ");
        String name = scanner.next();
        System.out.println("---  color --> ");
        String color = scanner.next();
        System.out.println("---  model --> ");
        String model = scanner.next();

        Time time ;
         time = new Time (name, color, model);

        Gson gson;
        gson = new Gson();

        String jsonTime= gson.toJson(time);
        FileManager.save(fileName, jsonTime);
        
        ArrayList<Time> timesList = new ArrayList<>();
        
        times = new ArrayList<>();
        fileName = "data/time.json";
        times = FileManager.read(fileName);
        System.out.println(" --> Time \n "+ times);
        
        for(String timeString : times){
            System.out.println("device String --> " + timeString + " <--");
            timesList.add(time);
            time = gson.fromJson(timeString, Time.class);
            System.out.println("device id -> " + time.getid());
            
        }

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(timesList);
        
        String timesListJson;
        timesListJson = gson.toJson(timesList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(timesListJson);
        
    }
    
}
