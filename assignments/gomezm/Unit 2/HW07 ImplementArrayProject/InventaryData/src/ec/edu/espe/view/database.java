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
        String last_name="";
        boolean availability = true;
        String expiration = "";
        double price= 0.0;
        String size="";
        int quantity =0; 
        String birth= "";
        String phone ="";
        String email = "";
        String category= "";
        
        CleaningSupply cleaningSupply;
        Supplier supplier;
        ArrayList<CleaningSupply>cleaningSupplies= new ArrayList<>();
        supplier = new Supplier();
        
        DairyProduct dairyProduct;
        Product product4=null;
        ArrayList<DairyProduct>dairyProducts= new ArrayList<>();
   
        
        Snack snack;
        Product product1;
        ArrayList<Snack>snacks= new ArrayList<>();
        product1= new Product(snacks);
        
        GrainsPasta grainspasta;
        ArrayList<GrainsPasta>grainspastas= new ArrayList<>();
        supplier = new Supplier();
       
        Costumer costumer;
        ArrayList<Costumer> costumers = new  ArrayList<>();
        
        Drink drink;
        Product product3 = null;
        ArrayList<Drink>driks = new ArrayList<>();
        
        Canned canned;
        Product product2 = null;
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
                        System.out.println("Enter the size of the canned: ");
                        size =read.next();                        
       		 	System.out.println("Enter the price of the canned: ");
        		price = read.nextDouble();
                        
                        canned = new Canned(id, name, availability, expiration, size, price);
                        product2.add(canned);
                        
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
                        System.out.println("Enter the costumer last name: ");
                        last_name=read.next();
        		System.out.println("Enter the costumer birth:");
        		birth = read.next();
       		 	System.out.println("Enter the costumer phone: ");
        		phone = read.next();
                        System.out.println("Enter the costumer email: ");
        		email = read.next();
                        

                        break;  
                    case 4:
                        
                        System.out.println("----->Please enter the data of the DairyProduct <-----");
        		System.out.println("Enter the id of teh Dairy Product: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the Dairy Product: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the Dairy Product:");
        		availability = read.nextBoolean();
                        System.out.println("Enter the date of expiration of the Dairy Product: ");
        		expiration = read.next();
                        System.out.println("Enter the quantity of the Dairy Product: ");
                        quantity=read.nextInt();
       		 	System.out.println("Enter the price of the Dairy Product: ");
        		price = read.nextDouble();
                        
                        dairyProduct = new DairyProduct(id, name, availability, expiration, quantity, price);
			product4.add(dairyProduct);
           
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
                        System.out.println("Enter the quantity of the drink: ");
                        quantity=read.nextInt();
                        System.out.println("Enter the size of the drink");
                        size =read.next();
       		 	System.out.println("Enter the price of the drink: ");
        		price = read.nextDouble();
                        
                        drink = new Drink(id, name, availability, expiration, quantity, size, price);
                        product3.add(driks);
                       
                       break;
                    case 6:
                        System.out.println("----->Please enter the data of the Grains and Pasta<-----");
        		System.out.println("Enter the id of grains and pasta: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the grains and pasta: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of grains and pasta:");
        		availability = read.nextBoolean();
                        System.out.println("Enter the date of expiration of the grains and pasta: ");
        		expiration = read.next();
       		 	System.out.println("Enter the price of the grains and pasta: ");
        		price = read.nextDouble();
                        
                        grainspasta = new GrainsPasta(id, name, availability, expiration, price);
			supplier.add(grainspasta);
                        break;
                    case 7:  
			System.out.println("----->Please enter the data of the product<-----");
        		System.out.println("Enter the id of the meat or seafood: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the meat or seafood: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the meat or seafood:");
        		availability = read.nextBoolean();
        		System.out.println("Enter the date of expiration of the meat or seafood: ");
        		expiration = read.next();
       		 	System.out.println("Enter the price of the meat or seafood: ");
        		price = read.nextDouble();
                        
			meatSeafood = new MeatSeafood(id, name, availability, expiration, price);
			product.add(meatSeafood);
                       break;
                    case 8:
                        
                        System.out.println("----->Please enter the data of the Snack<-----");
        		System.out.println("Enter the id of snack: ");
                        id = read.nextInt();
        		System.out.println("Enter the name of the snack: ");
       			name = read.next();
        		System.out.println("Enter true or false depending on the availability of the snack:");
        		availability = read.nextBoolean();
                        System.out.println("Enter the date of expiration of the snack: ");
        		expiration = read.next();
                        System.out.println("Enter the size of the snack: ");
                        size = read.next();
                        System.out.println("Enter the quantity of the snack: ");
                        quantity = read.nextInt();
       		 	System.out.println("Enter the price of the snack: ");
        		price = read.nextDouble();
                        
                        snack = new Snack(id, name, availability, expiration, size, (int) quantity, price);
			product1.add(snack);
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