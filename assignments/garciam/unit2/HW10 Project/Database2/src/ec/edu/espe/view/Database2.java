
package ec.edu.espe.view;

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
   
    
