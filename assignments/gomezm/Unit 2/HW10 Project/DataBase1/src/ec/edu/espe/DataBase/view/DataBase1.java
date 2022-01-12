
package ec.edu.espe.DataBase.view;

import utils.FileManager;

/**
 *
 * @author melig
 */
public class DataBase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List os products from the inventary");
        String products;
        String fileName = "data/products.csv";
        products =FileManager.read(fileName);
        System.out.println("---> Products <---\n"+products);
        
        String snack="05,oreo,yes,06/12/2021,small,0.60";
        FileManager.save("data/procucts.csv",snack);       

    }   
}
