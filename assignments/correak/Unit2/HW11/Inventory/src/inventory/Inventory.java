package inventory;

import ec.espe.edu.inventory.model.Product;
import ec.espe.edu.inventory.model.Stock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author KERLY
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product ;
        
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String>producto=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        int code ;
        String name;
        float price;
        int stockQuantity;
        
        product = new Product("01", "llantaA", false, "0");
        Product product1 = new Product("02", "llantaB", true, "3");
        Product product2 = new Product("03", "llantaC", true, "4");
        Product product3 = new Product("04", "llantaD", true, "5");
        String status="";
        
        
        do {   
            System.out.println("----MENU----");
            System.out.println("1.Show the products \n1.show if exist ore not");
            System.out.println("Ingrese opcion:");
            option=sc.nextInt();
            switch(option){
                
                case 1:
                    
                    System.out.println("These are the products:\n");
                    System.out.println(product+"\n"+product1+"\n"+product2+"\n"+product3);
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese el codigo del producto");
                    int cod1 = sc.nextInt();
                    String code1 = String.valueOf(cod1);
                                       
                        System.out.println("code     ->"+product.getCode());
                        System.out.println("name     ->"+product.getName());
                        System.out.println("quantity ->"+product.getStockQuantity());
                        System.out.println("status ->"+product.isStatus());
                    
                    
                    if (product.isStatus()) {
                        status ="not exist";
                    }else{
                        status="exist";                      
                    }
                    
                    System.out.println("Device status "+product.getClass().getSimpleName()+" is --> "+product.isStatus());
                
                break;
                    
                case 3:
                    System.out.println("Good bye...");
                
                break;
            }
        } while (option != 3);
        
        
    }

    
    
}