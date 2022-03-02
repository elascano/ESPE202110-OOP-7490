
package ec.edu.espe.tire.model;

import java.util.Scanner;
import java.util.Vector;
import ec.edu.espe.tire.model.Product;

/**
 *
 * @author WorBotsTeam
 */
public class InventoryTireStore {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        int price;
        int option;
        int quantity;
        int code;
        
        Product product = new Product();
        //ArrayList<Product> products = new ArrayList();
        Vector products = new Vector();        
        do{
            System.out.print("\nMENU \n 1. Register purchase -->\n");
            System.out.println("2. Register sale -->");
            System.out.println("3. Search product -->");
            System.out.println("4. Exit -->");
            
            option = input.nextInt();
            
            switch(option){
                case 1:
                     System.out.print("Please enter code: ");
                     code = input.nextInt(); 
                     System.out.print("Please enter name: ");
                     name = input.next();
                     System.out.print("Please enter price: ");
                     price = input.nextInt();
                     System.out.print("please quantity in the Stock: ");
                     quantity = input.nextInt();
                     product = search(code, products);
                     if(product ==null){
                        products.addElement(new Product(code,name,price,quantity));
                        System.out.print("Product added");
                     }
                     else
                         System.out.print("this product already exists"); 
                         
                    break;
                    
                case 2:  
                     System.out.print("Please enter code: ");
                     code = input.nextInt();
                     product = search(code, products);
                     if(product!=null){
                         if(product.getQuantity() > 0){ 
                            product.setQuantity(product.getQuantity() - 1);
                            System.out.print("Sale made");
                            product.print();
                         }
                         else
                             System.out.print("Out of stock");
                     }
                     else 
                        System.out.print("Non-existent product");
                     
                    break;
                    
                case 3:
                     System.out.print("Please enter code: ");
                     code = input.nextInt();
                     product = search(code, products);
                     if(product!=null)
                        product.print();
                     else 
                        System.out.print("Non-existent product");                     
                    break;
                    
                case 4:
                    break;
                    
                default: System.out.println("please enter menu option");
            }            
        }while(option!= 4);
    }    
    static Product search(int code, Vector products){
        boolean band = false;
        Product price,retornP = null;
        for(int x = 0; x < products.size(); x++){ 
            price = (Product) products.elementAt(x);
            if(price.getCode() == code)
                retornP = price;
        }
        return retornP;
    }
}
