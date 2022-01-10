
package ec.edu.espe.inventory.view;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import utils.FileManager;

/**
 *
 * @author darling.cruz
 */
public class InventoryTireStore {  
    public static void main(String[] args) {
   
         
        Scanner input = new Scanner(System.in);
        String name;
        int price;
        int option;
        int quantity;
        int code;
        
        Product product;
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
                System.out.println("Inventory Control in a Tire Store ");
                ArrayList<String> productToFiles = new ArrayList<>();
                String fileName = "data/productToFiles.json";
                productToFiles = FileManager.read(fileName);
                System.out.println("  --> PRODUCT  \n"+ productToFiles); 
        
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
                String email = null;
                String telephone = null;
                         String jsonproductData =  "code: "+ code +  "name: "+name + "Price :"+price  + "quantity: "+quantity+"product: " + product; 
                         
                FileManager.save(fileName,jsonproductData); 
                        
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

class  Product{
    int code ,quantity;
    private double price;
    private String name;
    
    Product(int code, String name, double price, int quantity){
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;                     
    }
    public int getCode(){
        return this.code;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void showResult(){
        System.out.println("\nName is = " + this.getName() + "\t  Price is = "+ this.getPrice() + "\t  Stock is = "+ this.quantity);
    }
    public void showResultGraphic(){
        javax.swing.JOptionPane.showMessageDialog(null,"\nName is = " + this.getName() + "\t  Price is = "+ this.getPrice() + "\t  Stock is = "+ this.quantity);
    }
    public void print(){
        System.out.println("The id --> " + getCode());
        System.out.println("The name is --> " + getName());
        System.out.println("The color is --> " + getPrice());
        System.out.println("The age is --> " + getQuantity());
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
