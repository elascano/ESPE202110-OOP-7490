package ec.edu.espe.simulationcatering.view;

import com.google.gson.Gson;
import ec.edu.espe.simulationcatering.model.Cookware;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Melanie Joel Salma
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {

        System.out.println("Melanie Terán HW11 --> Project Files to JSON");

        System.out.println("\nList of cookwares in JSON format");
        Cookware cookware;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Details of the cookware ");
        System.out.println(" Code ");
        int code = scanner.nextInt();
        System.out.println(" Name ");
        String name = scanner.next();
        System.out.println(" Material ");
        String material = scanner.next();
        System.out.println(" Use ");
        String use = scanner.next();
        System.out.println(" Disponibility ");
        String disponibility = scanner.next();
        System.out.println(" Quantity ");
        int quantity = scanner.nextInt();

        cookware = new Cookware(code, name, material, use, disponibility, quantity);
        System.out.println(cookware);

        Gson gson;
        gson = new Gson();

        String cookwares;
        String fileName = "cookware.json";
        cookwares = FileManager.read(fileName);

        String jsonDevice = gson.toJson(cookware);
        FileManager.save(fileName, jsonDevice);

        ArrayList<Cookware> cookwaresList = new ArrayList<>();

        System.out.println(" --> COOKWARES \n " + cookwares);

        System.out.println("The ArrayList of Devices is [][][][][] \n ");
        System.out.println(cookwaresList);

        String devicesListJson;
        devicesListJson = gson.toJson(cookwaresList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(devicesListJson);

    }

}
