
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.Scanner;


/**
 *
 * @author mayerly
 */
public class FarmSystem {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        ChickenCoop chickencoop = new ChickenCoop();
        
        int option;
        int id = 0;
        String name;
        String color;
        int age;
        String tecla = null;
        
	do{
	System.out.println("\n HW05 5 by Mayerly Garcia\n");
	
	System.out.println("\n\t Option menu: \n");
	System.out.println("\t1. Add chicken: \n");
	System.out.println("\t2. Remove chickens: \n");
        System.out.println("\t3. Show chickens in the coop: \n");
        System.out.println("\t4. Show the amount of chickens: \n");
        
	option = read.nextInt();
        
	boolean opc = (option <= 4);
	if (opc) {
            
            switch(option){                
            case 1:
                System.out.println("\n\n  enter data for chiken --> ");        

                System.out.println(" ID->");
                id = read.nextInt();

                System.out.println(" name->");
                name = read.next();

                System.out.println(" Color->");
                color  = read.next();

                System.out.println(" Age->");
                age = read.nextInt();
                
               chickencoop.AddChicken(id, name, color, age);
                
		break;
		case 2: 
                    System.out.println("ID ->");
                    id =read.nextInt(); 
                    chickencoop.Remove(id);
                    
		break;
		case 3:
                
                    System.out.println("your data is--> \n");
                    chickencoop.Print();
                    
                break;
		case 4:
                    
                    chickencoop.QuantityTotal();
                    
		break;
                }
		} else {
		System.out.println("Enter a number from 1 to 4."); 
		}
		System.out.println("\n\t Do you want to do any other option?\n");
		System.out.println("\t\t1. If you enter the 's'");
		System.out.println("\t\t2. Do not enter the 'n'");
		tecla = new Scanner(System.in).nextLine();
 
	} while (tecla.equals("s") || tecla.equals("S"));
    } 
}  

