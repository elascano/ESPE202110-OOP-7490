package ec.edu.espe.simulationcatering.view;

import com.google.gson.Gson;
import ec.edu.espe.simulationcatering.model.Cookware;
import ec.edu.espe.simulationcatering.model.Event;
import ec.edu.espe.simulationcatering.model.Ingredient;
import ec.edu.espe.simulationcatering.model.Menu;
import ec.edu.espe.simulationcatering.model.Reservation;
import ec.edu.espe.simulationcatering.model.Transport;
import ec.edu.espe.simulationcatering.model.Worker;
import java.util.ArrayList;
import utils.FileManager;

/**
 *
 * @author Melanie Joel Salma
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {

        System.out.println("Melanie Terán HW10 --> Project Files");
        
        Ingredient ingredient = new Ingredient();
        Cookware cookware = new Cookware();
        Menu menu = new Menu();
        Reservation reservation = new Reservation();
        Transport transport = new Transport();
        Event event = new Event();
        Worker worker = new Worker();

        ArrayList<Transport> transports = new ArrayList<>();
        ArrayList<Menu> menus = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        System.out.println("cookware");
        String cookwares;
        String fileName = "cookware.csv";
        cookwares = FileManager.read(fileName);

        System.out.println("Ingredients --> " + ingredient);
        System.out.println("CookWare --> " + cookware);
        System.out.println("Menu --> " + menu);
        System.out.println("Reservations --> " + reservation);
        System.out.println("Details of transport -->" + transport);
        System.out.println("Event Detail -->" + event);
        System.out.println("List of workers -->" + worker);

        Gson gson;
        gson = new Gson();

        String jsonDevice = gson.toJson(cookware);
        FileManager.save(fileName, jsonDevice);

        ArrayList<Cookware> cookwaresList = new ArrayList<>();

        fileName = "cookware.json";
        cookwares = FileManager.read(fileName);
        System.out.println(" --> COOKWARES \n " + cookwares);

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(cookwaresList);

        String devicesListJson;
        devicesListJson = gson.toJson(cookwaresList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(devicesListJson);

    }

}
