
package ec.edu.espe.InventoryBilling.view;

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
        
        Supplier supplier = null;
        Product product = null;
        ArrayList<Supplier> suppliers = new ArrayList<>(); 
        
         product= new Product("a","a",0,"a","a",suppliers);
         
        OUTER:
        while (true) {
            System.out.println("INVENTORY BILLING");
            System.out.println("List");
            System.out.println("1 .-  Add Costumer");
            System.out.println("2 .-  Remove Costumer");
            System.out.println("3 .-  Show Costumer");
            System.out.println("4 .-  Show the amount of Costumer");
            System.out.println("5 .-  Exit");
            Scanner read = new Scanner(System.in);
            int option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Database");
                    System.out.println("name of Costumer --->   ");
                    String name = read.next();
                    System.out.println("age of Costumer --->   ");
                    int age = read.nextInt();
                    System.out.println("customer identification --->   ");
                    float customr = read.nextFloat();
                    System.out.println("customer Address--->   ");
                    float customer = read.nextFloat();
                    System.out.println("phone ---> ");
                    int phone = read.nextInt();
                    supplier =new Supplier(name,age,customer,customer,phone);
                    list.add(supplier);
                    break;
                case 2:
                    list.remove(supplier);
                    break;
                case 3:
                    {
                        String list = null;
                        System.out.println("Customer address -->" + list);
                        break;
                    }
                case 4:
                    System.out.println("Customer's age -->" + list.countSuppliers());
                    break;
                case 5:
                    break OUTER;
                default:
                    break;
            }
        }
    }
}


        
   
        
        
    

