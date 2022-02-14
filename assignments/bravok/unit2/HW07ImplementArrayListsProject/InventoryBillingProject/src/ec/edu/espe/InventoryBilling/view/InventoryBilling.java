
package ec.edu.espe.InventoryBilling.view;

import ec.edu.espe.InventoryBilling.model.Customer;
import ec.edu.espe.InventoryBilling.model.Product;
import ec.edu.espe.InventoryBilling.model.Supplier;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Katherin Bravo
 */
public class InventoryBilling {
    public static void main(String[] args) {
        String name = null;
    int id = 0;
    String direction = null;
    String email = null;
    
           Scanner scanner = new Scanner(System.in);
           
        System.out.println("User data");
        Customer customer = new Customer(name,id,  direction, email);
        System.out.println("Please insert the information of the new customer");
        System.out.println("Enter the name of the costumer");
        name = scanner.next();
        System.out.println("Enter the identification card ");
        id = scanner.nextInt();
        System.out.println("Enter the direction");
        direction = scanner.next();
        System.out.println("register the email");
        email =  scanner.next();
        
        
        System.out.println("The costumer is-->\n"+name);
        System.out.println("The identification Card is-->\n"+id);
        System.out.println("The direction of the costumer is-->\n"+direction);
        System.out.println("The email is-->\n"+email);
        
        
        String priceForMayority;
        int amount;
        String mark;
        
        System.out.println("Please insert the information of the product");
        System.out.println("Enter the priceForMayority");
        priceForMayority = scanner.next();
        System.out.println("Enter the identification amount ");
        amount= scanner.nextInt();
        System.out.println("Enter the mark");
        mark = scanner.next();
        
        System.out.println("The price for mayority is-->\n"+priceForMayority);
        System.out.println("The amount is-->\n"+amount);
        System.out.println("The mark is-->\n"+mark);
        
       
           
           
           
 
    }
    
}

    
        
        