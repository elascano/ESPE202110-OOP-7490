package inventory;

import Utils.FileManager;
import com.google.gson.Gson;
import ec.espe.edu.inventory.model.Product;
import ec.espe.edu.inventory.model.Stock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product ;
        Stock stock;
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String>producto=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        int code1 = 0 ;
        String name;
        float price1;
        int stockQuantity1;
        
        do{
            System.out.println("TO ENTER PRODUCTS AND SE THE FILE ");
            System.out.println("------MENU-------");
            System.out.println("1.Save the data in csv \n2.Read the data in csv \n3.Find the data in csv");
            System.out.println("4.Read the data in json \n5.Save the data in json \n6.Find the data injson \n7.EXIT");
            System.out.println("Ingrese la opcion:");
            option=sc.nextInt();;
            
            switch(option){
                case 1:
                    System.out.println("-----Enter the product-----");
                    System.out.println("name:");
                    name=sc.next();
                    System.out.println("code:");
                    code1=sc.nextInt();
                    System.out.println("price:");
                    price1=sc.nextFloat();
                    System.out.println("In stock:");
                    stockQuantity1=sc.nextInt();
                    String code = String.valueOf(code1);
                    String price = String.valueOf(price1);
                    String stockQuantity=String.valueOf(stockQuantity1);
                    
                    product= new Product(code, name, price, stockQuantity);
                    products.add(product);
                    stock=new Stock(code,name, products);
                    
                    
                    
                    String fileName = "data/producto.csv";
                    FileManager.save(fileName,"\n"+product); 
                    producto = FileManager.read(fileName);
                    System.out.println("-> DEVICES\n"+product);
     
                    break;
                case 2:
                    fileName = "data/producto.csv";
                    producto =FileManager.read(fileName);
                    System.out.println("->DEVICES \n"+ producto);
                    
                    break;
                    
                         
                case 3:
                    System.out.println("----Los productos en Stock---");
                    System.out.println( producto.toString());
                    
                    System.out.println("Enter to code that you want find:");
                    code1= sc.nextInt();
                    boolean exist = producto.contains(code1);
                    if(code1==code1){
                        System.out.println("the product exist");
                        System.out.println("->"+producto.get(code1));
                    }else{
                        System.out.println("no exist");
                    }
                    
                    break;                   
                    
                case 4:
                    System.out.println("-----Enter the product-----");
                    System.out.println("name:");
                    name=sc.next();
                    System.out.println("code:");
                    code1=sc.nextInt();
                    System.out.println("price:");
                    price1=sc.nextFloat();
                    System.out.println("In stock:");
                    stockQuantity1=sc.nextInt();
                     code = String.valueOf(code1);
                     price = String.valueOf(price1);
                     stockQuantity=String.valueOf(stockQuantity1);
                    
                    product= new Product(code, name, price, stockQuantity);
                    products.add(product);
                    stock=new Stock(code,name, products);
                  
                    
                    Gson gson = new Gson();
                    fileName="data/producto.json";
                    String jsonProducto= gson.toJson(producto);
                    FileManager.save(fileName, jsonProducto);
                    producto = FileManager.read(fileName);
                    System.out.println("-> DEVICES\n"+product);
                    
                    
                    break;
                case 5:
                    fileName = "data/producto.json";
                    producto = FileManager.read(fileName);
                    System.out.println("-> DEVICES\n"+producto);
                    break;
                case 6:
                    System.out.println("----Los productos en Stock---");
                    System.out.println( producto.toString());
                    
                    System.out.println("Enter to code that you want find:");
                    code1= sc.nextInt();
                    boolean exis = producto.contains(code1);
                    if(code1==code1){
                        System.out.println("the product exist");
                        System.out.println("->"+producto.get(code1));
                    }else{
                        System.out.println("no exist");
                    }
                    
                    
                    break;
                case 7:
                    System.out.println("Good bye...");
                    break;
            }
                    
            
        }while(option!=7);
    }

    
    
}