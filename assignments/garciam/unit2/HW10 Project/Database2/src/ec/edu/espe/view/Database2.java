
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
        System.out.println("HW10 by Mayerly Garcia");
         System.out.println("List of supplies from my inventary");
        String supplies;
        String fileName = "data/supplies.csv";
        supplies =FileManager.read(fileName);
        System.out.println("--->supplies \n"+supplies);
        
        String cleaningSupply="";
        FileManager.save("data/supplies.csv",cleaningSupply);
   
    }
}
