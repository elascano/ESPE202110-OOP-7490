
package ec.edu.espe.DataBase.view;

import ec.edu.espe.DataBase.model.Product;
import java.io.IOException;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author melig
 */
public class DataBase1 {
     public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        Product products = new Product(); 

    do{
    
    System.out.println("Melissa Gómez");
    System.out.println("Inventary");
    System.out.println("\t\n Menu");    
    System.out.println("1 To add a new product");
    System.out.println("2 To view the products"); 
    System.out.println("3 To delete all the data in CSV");
    System.out.println("4 To search the product by ID");
    System.out.println("5 To update the product data");          
    System.out.print("\n");
    System.out.println("select an option");
        
        int option;
        option = read.nextInt();
    boolean opc = (option <= 5);
    if (opc) {
            switch(option){                
            case 1: 
                    products.AddProduct();
            break;
            case 2: 
                    products.ViewProduct();
            break;
            case 3:
                    products.DeleteProduct();
            break;
            case 4: 
                    products.SearchProductID();
            break;
            case 5: 
                    products.updateProductID();
            break;
            }
            } else {
            System.out.println("Select a number between 1 to 5"); 
            }
            System.out.println("Do you want to do any other option?\n");
            System.out.println("Yes 'y'");
            System.out.println("No'n'");
            tecla = new Scanner(System.in).nextLine();
    } while (tecla.equals("y") || tecla.equals("Y"));                
    }   
}
