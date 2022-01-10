
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Bustillos 
 */ 
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;   
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
                 
       int x=3;
       Scanner read = new Scanner(System.in);
       chickenCoop = new ChickenCoop(0, chickens);
       
        do{
            System.out.println("\nCHICKENCOOP MENU\n");
            System.out.println("1. Option 1: Add chicken by ID");
            System.out.println("2. Option 2: Show chickens in the coop");
            System.out.println("3. Option 3: Remove chicken by ID");
            System.out.println("4. Option 4: Amount of the chickens");
            System.out.println("5. Exit");
            
            System.out.println("\nIntroduce an option: ");
            
            int option=read.nextInt();
            
            switch(option){
                
                case 1:
                    System.out.println("Introduce the ID chicken to add:");
                    chicken = new Chicken(0, " ", " ", 0, true);
                    int id=read.nextInt();
                    chicken.setId(id);
                    chickenCoop.add(chicken);
                    System.out.println("You have added a chicken by the ID");
                    
                    break; 
                    
                case 2:
                    System.out.println("chicken coop --> " + chickenCoop);
                    break;
                   
                    
                case 3:
                     System.out.println("Introduce the ID chicken to remove:");
                    id=read.nextInt();

                    break;
                    
                    
                case 4:
                    System.out.println("Chickens in the chicken coop: " + chickenCoop.countChickens());
                    break;
                    
                default:System.out.println("***Exit***"); 
                x=0;
                    break;      
            }
            
        }while(x!=0);        
    }
    
}
