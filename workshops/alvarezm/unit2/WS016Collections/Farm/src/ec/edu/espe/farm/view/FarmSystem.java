
<<<<<<< HEAD
=======

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c

/**
 *
 * @author malvarez
<<<<<<< HEAD
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
=======
 */ 
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;   // Clase - nombre de la clase
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        chickenCoop = new ChickenCoop(0, chickens);
        int aux=3;              
        do{
            System.out.println("\nCHICKENCOOP MENU\n");
            System.out.println("1. Option 1: Add chicken by ID");
            System.out.println("2. Option 2: Remove chicken by ID");
            System.out.println("3. Option 3: Show chickens in the coop");
            System.out.println("4. Option 2: Amount of the chickens");
            System.out.println("5. Exit");
            System.out.print("\nIntroduce an option: ");
            int option=read.nextInt();
            switch(option){                
                case 1:
                    System.out.print("Introduce the ID chicken to add:\t");
                    chicken = new Chicken(0, " ", " ", 0, true);
                    int id=read.nextInt();
                    chicken.setId(id);
                    chickenCoop.add(chicken);
                    System.out.println("** You have added a chicken by the ID**");                    
                    break;                     
                case 2:
                    System.out.print("Introduce the ID chicken to remove:\t");
                    id=read.nextInt();                    
                    for (int i = 0; i <chickens.size(); i++) {                       
                        if(chickens.get(i).getId()==id){
                            chickens.remove(chickens.get(i)); 
                        }                   
                    }
                    break;                    
                case 3:
                    System.out.println("chicken coop --> " + chickenCoop);
                    break;                    
                case 4:
                    System.out.println("Chickens in the chicken coop: " + chickenCoop.countChickens());
                    break;                    
                default:System.out.println("***Exit***"); 
                aux=0;
                    break;      
            }
            
        }while(aux!=0); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   /*
                        WORKSHOP  -  MADE IN CLASS
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
        chicken = new Chicken(0, "Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("chicken --> " + chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
<<<<<<< HEAD
        System.out.println("chicken coop --> " +chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop);
        
        chickenCoop.add(new Chicken(1, "Daysi", "white", 0, false));
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop);        
               
        chickenCoop.add(new Chicken(2, "Renata", "black", 0, false));
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop);       
        
        chickenCoop.remove(chicken);
        System.out.println("Chickens in the chicken coop " + chickenCoop.countChickens());
        System.out.println("chicken coop --> " +chickenCoop);           
        
        
        
        
        
        

        
=======
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
       
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    }
    
}
