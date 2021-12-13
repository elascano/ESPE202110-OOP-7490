
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author malvarez
 */ 
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;   // Clase - nombre de la clase
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
                 
       int x=3;
       Scanner read = new Scanner(System.in);
       chickenCoop = new ChickenCoop(0, chickens);
       
        do{
            System.out.println("\nCHICKENCOOP MENU\n");
            System.out.println("1. Option 1: Add chicken by ID");
            System.out.println("2. Option 2: Remove chicken by ID");
            System.out.println("3. Option 3: Show chickens in the coop");
            System.out.println("4. Option 2: Amount of the chickens");
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
                    
                    System.out.println("Introduce the ID chicken to remove:");
                    id=read.nextInt();

                    //chickenCoop.remove(chicken);
                    break;
                    
                case 3:
                    System.out.println("chicken coop --> " + chickenCoop);
                    break;
                    
                case 4:
                    System.out.println("Chickens in the chicken coop: " + chickenCoop.countChickens());
                    break;
                    
                default:System.out.println("***Exit***"); 
                x=0;
                    break;      
            }
            
        }while(x!=0); 
        
   /*
                        WORKSHOP  -  MADE IN CLASS
        chicken = new Chicken(0, "Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken --> " + chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);
        
        chickenCoop.add(new Chicken(1, "Daysi", "white", 0, false));
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);        
               
        chicken = new Chicken(2, "Renata", "black", 0, false);
        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);       
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);
        
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop);   

        chicken = new Chicken(0,"Lucy", "White and brown", 0, true);
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " + chickenCoop);         
  
*/
       
    }
    
}
