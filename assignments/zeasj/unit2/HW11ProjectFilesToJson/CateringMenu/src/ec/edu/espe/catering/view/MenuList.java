package ec.edu.espe.catering.view;

import Utils.FileManager;
import com.google.gson.Gson;
import ec.espe.edu.catering.model.Menu;
import ec.espe.edu.catering.model.Stock;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joel Zeas 
 */
public class MenuList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu;
        Stock stock;
        ArrayList<Menu> menus = new ArrayList<>();
        ArrayList<String>menulist=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        int code1 = 0 ;
        String name;
        float price1;
        int stockQuantity1;
        
        do{
            System.out.println("   --> Welcome to the Catering Planner project files to json -Menu- <--   ");
            System.out.println("                       HW11ProjectFilesToJson                           ");
            System.out.println("Author: Joel Zeas");
            System.out.println("\nSelect the option you want to make");
            System.out.println("1.Save menu data in csv");
            System.out.println("2.Read the data from the menu in csv");
            System.out.println("3.Search for the data of a menu in csv");
            System.out.println("4.Save menu data in json");
            System.out.println("5.Read the data from the menu in json");
            System.out.println("6.Search for the data of a menu in json");
            System.out.println("7.Exit");
            option=sc.nextInt();;
            
            switch(option){
                case 1:
                    System.out.println("\n  --> Enter the menu data <--- ");
                    System.out.println("Enter menu name: ");
                    name=sc.next();
                    System.out.println("Enter the menu code: ");
                    code1=sc.nextInt();
                    System.out.println("Enter menu price: ");
                    price1=sc.nextFloat();
                    System.out.println("Enter the menu stock: ");
                    stockQuantity1=sc.nextInt();
                    String component = String.valueOf(code1);
                    String price = String.valueOf(price1);
                    String stockQuantity=String.valueOf(stockQuantity1);
                    
                    menu= new Menu(name, component, price, stockQuantity);
                    menus.add(menu);
                    stock=new Stock(name, component, menus);
                                       
                    String fileName = "data/menulist.csv";
                    FileManager.save(fileName,"\n"+menu); 
                    menulist = FileManager.read(fileName);
                    System.out.println("-> Menu data entered\n"+menu);
     
                    break;
                    
                    
                case 2:
                    fileName = "data/menulist.csv";
                    menulist =FileManager.read(fileName);
                    System.out.println("->Menu data entered \n"+ menulist);
                    
                    break;  
                    
                         
                case 3:
                    System.out.println("  --> The menus in stock are <-- ");
                    System.out.println( menulist.toString());
                    
                    System.out.println("Enter the code from the menu:");
                    code1= sc.nextInt();
                    boolean exist = menulist.contains(code1);
                    if(code1==code1){
                        System.out.println("The quantity of menus in stock is:");
                        System.out.println("->"+menulist.get(code1));
                    }else{
                        System.out.println("This menu is no longer in stock");
                    }
                    
                    break;                   
                     
                    
                case 4:
                    System.out.println("\n  --> Enter the menu data <--- ");
                    System.out.println("Enter menu name: ");
                    name=sc.next();
                    System.out.println("Enter the menu code: ");
                    code1=sc.nextInt();
                    System.out.println("Enter menu price: ");
                    price1=sc.nextFloat();
                    System.out.println("Enter the menu stock: ");
                    stockQuantity1=sc.nextInt();
                    component = String.valueOf(code1);
                    price = String.valueOf(price1);
                    stockQuantity=String.valueOf(stockQuantity1);
                    
                    menu = new Menu(name, component, price, stockQuantity);
                    menus.add(menu);
                    stock=new Stock(name, component, menus);                
                    
                    Gson gson = new Gson();
                    fileName="data/menulist.json";
                    String jsonMenulist= gson.toJson(menulist);
                    FileManager.save(fileName, jsonMenulist);
                    menulist = FileManager.read(fileName);
                    System.out.println("-> List of device json: ");
                    System.out.println("{name:" + name + ",component:" + component + ",price:" + price + ",stockQuantity:" + stockQuantity + "}");
                                       
                    break;
                    
                    
                case 5:
                    fileName = "data/menulist.json";
                    menulist = FileManager.read(fileName);
                    System.out.println("-> DEVICES\n"+menulist);
                    
                    break;
                    
                    
                case 6:
                    System.out.println("----Los productos en Stock---");
                    System.out.println( menulist.toString());
                    
                    System.out.println("Enter to code that you want find:");
                    code1= sc.nextInt();
                    boolean exis = menulist.contains(code1);
                    if(code1==code1){
                        System.out.println("the product exist");
                        System.out.println("->"+menulist.get(code1));
                    }else{
                        System.out.println("no exist");
                    }
                    
                    
                case 7:
                    System.out.println("Thanks for using our system, come back soon");
                    break;
            }
                    
            
        }while(option!=7);
    }
  
    
}
