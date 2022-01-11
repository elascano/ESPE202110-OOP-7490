package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.Products;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ALEJANDRO DE LACRUZ
 */
public class Inventory {
     public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        Products products = new Products(); 

    do{
	
        System.out.println("\t\t Inventary Shop\n\n");
        
	System.out.println("1 ===> Add New Product ");
	System.out.println("2 ===> View All Product ");	
	System.out.println("3 ===> Delete All Data in CSV ");
	System.out.println("4 ===> Search the Product by ID ");
	System.out.println("5 ===> Update the Product Data ");	        
	    
	System.out.print("\n\n");
	System.out.println("Enter your choice: ");
        
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
            System.out.println("Enter a Number from 1 to 4."); 
            }
            System.out.println("\n\tDo you want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));                
    }        
}

        