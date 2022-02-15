package ec.edu.espe.view;

import ec.edu.espe.model.Canned;
import ec.edu.espe.model.Cashier;
import ec.edu.espe.model.CleaningSupply;
import ec.edu.espe.model.Costumer;
import ec.edu.espe.model.DairyProduct;
import ec.edu.espe.model.Drink;
import ec.edu.espe.model.GrainsPasta;
import ec.edu.espe.model.Invoice;
import ec.edu.espe.model.MeatSeafood;
import ec.edu.espe.model.Product;
import ec.edu.espe.model.Snack;
import ec.edu.espe.model.Supplier;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author the1/2programmer's
 */
public class database {
    public static void main(String[] args) {
        MeatSeafood meatSeafood;
        Product product;
        ArrayList<MeatSeafood>meatsSeafoods= new ArrayList<>();
        product= new Product(0, meatsSeafoods);
        Scanner read = new Scanner(System.in);
        boolean Exit = false;
        
        
        while (!Exit) {  
        int id = 0;
        String name = "";
        boolean availability = true;
        String expiration = "";
        double price= 0.0;
        String size="";
        double quantity =0.0; 
        String birth= "";
        String phone ="";
        String email = "";
        String category= "";
        
        CleaningSupply cleaningSupply;
        Supplier supplier;
        ArrayList<CleaningSupply>cleaningSupplies= new ArrayList<>();
        supplier = new Supplier();
       
        Costumer costumer;
        ArrayList<Costumer> costumers = new  ArrayList<>();
        
         Drink drink;
         Product product2;
        ArrayList<Drink>driks = new ArrayList<>();
        
        Canned canned;
        Product product1;
        ArrayList<Canned> canneds = new ArrayList<>();
        
        while (!Exit) {
       
        
       
   
        
  
            System.out.println("1. Canned");
            System.out.println("2. Cleanning Supply");
            System.out.println("3. Costumer");
            System.out.println("4. Dairy product");
	    System.out.println("5. Drink");
	    System.out.println("6. Grains and pasta");
	    System.out.println("7. Meat and Seafood");
	    System.out.println("8. Snack");
            System.out.println("9. Exit");

            try {
 
                System.out.println("Please, choose an option");
                int option = read.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("----->Please enter the data of the canned product<-----");
        		System.out.println("Enter the id of the Canned: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the canned product: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the canned:");
        		availability = read.nextBoolean();
        		System.out.println("Enter the date of expiration of the canned: ");
        		expiration = read.next();
       		 	System.out.println("Enter the price of the canned: ");
        		price = read.nextDouble();
                        canned = new Canned(option, phone, availability, expiration, size, price);
                        product.add(canned);
                        
                        break;
                    case 2:
                        System.out.println("----->Please enter the data of the cleaning supply<-----");
        		System.out.println("Enter the id of Cleaning Supply: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the cleaning supply: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of cleaning supply:");
        		availability = read.nextBoolean();
       		 	System.out.println("Enter the price of the cleaning supply: ");
        		price = read.nextDouble();
                        
                        cleaningSupply = new CleaningSupply(id, name, availability, price);
			supplier.add(cleaningSupply);
		
                        break;
                    case 3: 
                        System.out.println("----->Please enter customer data<-----");
        		System.out.println("Enter the costumer id: ");
                        id = read.nextInt();
        		System.out.println("Enter the costumer name: ");
       			name = read.next();
        		System.out.println("Enter the costumer birth:");
        		birth = read.next();
       		 	System.out.println("Enter the costumer phone: ");
        		phone = read.next();
                        System.out.println("Enter the costumer email: ");
        		email = read.next();
                        System.out.println("Enter the costumer email: ");
        		category = read.next();
                        
                       
                        break;  
                    case 4:
                       break;
                    case 5:
                        System.out.println("----->Please enter the data of the product<-----");
        		System.out.println("Enter the id of the Drink: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the Drink: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the Drink:");
        		availability = read.nextBoolean();
        		System.out.println("Enter the date of expiration of the Drink: ");
        		expiration = read.next();
       		 	System.out.println("Enter the price of the Drink: ");
        		price = read.nextDouble();
                        System.out.println("--->Enter the size you want--->");
                        size =read.next();
                        System.out.println("----Please enter the quantity---->");
                        quantity=read.nextDouble();
                        drink = new Drink(option, phone, availability, expiration, size, option, price);
                        product.add(driks);
                       
                       break;
                    case 6:
                       break;
                    case 7:  
			System.out.println("----->Please enter the data of the product<-----");
        		System.out.println("Enter the id of the meat or seafood: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the product: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the product:");
        		availability = read.nextBoolean();
        		System.out.println("Enter the date of expiration of the product: ");
        		expiration = read.next();
       		 	System.out.println("Enter the price of the product: ");
        		price = read.nextDouble();
                        
			meatSeafood = new MeatSeafood(id, name, availability, expiration, price);
			product.add(meatSeafood);
                       break;
                    case 8:
                       break;
                    case 9:
                        Exit = true;
                        break;
                    default:
                        System.out.println("Just numbers between 1 to 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must select a number");
                read.next();
            }
        }  
    } 
}
}