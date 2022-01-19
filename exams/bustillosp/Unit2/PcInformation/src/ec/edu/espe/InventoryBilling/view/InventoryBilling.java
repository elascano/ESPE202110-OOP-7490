package ec.edu.espe.InventoryBilling.view;


import ec.edu.espe.InventoryBilling.model.Customer;
import java.util.Scanner;
/**
 *
 * @author Pablo,Dylan,Chiristian,Katherin
 */
public class InventoryBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion=0;
        do{
        System.out.println("---> Welcome dear user to Inventory and Billing system <---\n");
        System.out.println("----> Insert the information of the new customer(1) <-----\n");
        System.out.println("-----> Insert the information of the product(2)\n <-----");
        

        System.out.println("Please enter the option--->");
            opcion=scanner.nextInt();
            switch(opcion){
            case 1:
            newCcustomer();
            break;
            case 2:
            informationOfTheProduct();
            break;
            }

        }while (opcion!=5);
                 
    }
    static void newCcustomer(){
    String name = null;
    int id = 0;
    String direction = null;
    String email = null;
    Scanner scanner = new Scanner(System.in);
    System.out.println("User data");
        Customer customer = new Customer(name,id,  direction, email);
        System.out.println("---> Please insert the information of the new customer <----");
        System.out.println("Enter the name of the costumer ----->");
        name = scanner.next();
        System.out.println(" ----> Enter the identification card <---- ");
        id = scanner.nextInt();
        System.out.println("Enter the direction ----->");
        direction = scanner.next();
        System.out.println("register the email --->");
        email =  scanner.next();
        
        
        System.out.println(" The costumer is-->\n"+name);
        System.out.println(" The identification Card is-->\n"+id);
        System.out.println(" The direction of the costumer is-->\n"+direction);
        System.out.println(" The email is-->\n"+email);

    }
    static void informationOfTheProduct(){
Scanner scanner = new Scanner(System.in);
        String priceForMayority;
        int amount;
        String mark;
        System.out.println(" Please insert the information of the product ");
        System.out.println(" Enter the priceForMayority ");
        priceForMayority = scanner.next();
        System.out.println(" Enter the identification amount ");
        amount= scanner.nextInt();
        System.out.println(" Enter the mark -----> ");
        mark = scanner.next();
        
        System.out.println(" The price for mayority is-->\n "+priceForMayority);
        System.out.println(" The amount is-->\n "+amount);
        System.out.println(" The mark is-->\n "+mark);  

    }
    
}

    
       
        