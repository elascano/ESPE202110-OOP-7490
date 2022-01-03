
package ec.edu.espe.view;

import com.google.gson.Gson;
import ec.edu.espe.model.CleaningSupply;
import java.util.ArrayList;
import utils.FileManager;




/**
 *
 * @author mayerly
 */
public class Database2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("List of devices from my home");
        String supplies;
        String fileName = "data/supplies.csv";
        supplies =FileManager.read(fileName);
        System.out.println("--->DEVICES \n"+supplies);
        
        String cleaningSupply="06,home theater,living room,on,80";
        FileManager.save("data/supplies.csv",cleaningSupply);
   
        
        
        System.out.println("list of supplies  in json format ");
        supplies = new ArrayList<>();
            fileName = "data/supplies.json";
            supplies = FileManager.read(fileName);
            System.out.println("--->SUPPLIES \n" + supplies);
            CleaningSupply cleaningSupply;
            cleaningSupply = new CleaningSupply(1,detergent, true, 10);

            Gson gson;
            gson = new Gson();

        
            ArrayList<CleaningSupply> suppliesList = new ArrayList<>();

            supplies = new ArrayList<>();
            fileName = "data/devices.json";
            supplies = FileManager.read(fileName);
            System.out.println(" --> DEVICES \n " + supplies);

           for (String cleaningSupplyString : supplies) {
               
               System.out.println("cleaningSupply String --> " + cleaningSupplyString + " <--");
                suppliesList.add(cleaningSupply);
                supplies = gson.fromJson(cleaningSupplyString,CleaningSupply.class
                        );
                System.out.println("cleaningSupply id -> " + cleaningSupply.getId());

            }
            System.out.println("The ArrayList of supplies is [][][][][] \n ");
            System.out.println(suppliesList);

            String devicesListJson;
            devicesListJson = gson.toJson(suppliesList);
            System.out.println("The json array created using gson library is -> ");
            System.out.println(devicesListJson);
        }
    }
