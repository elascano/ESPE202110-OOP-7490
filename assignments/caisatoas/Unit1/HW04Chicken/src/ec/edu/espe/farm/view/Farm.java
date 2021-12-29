
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;



/**
 *
 * @author Caisatoa
 */
public class Farm {
  
    int id=0;
    String name ="";
    String color ="";
    boolean isMolting = false;
    
    public static void main(String[] args) {
        
        Egg egg = new Egg(1);
        Poop poop = new Poop(); 
        Chicken chicken = new Chicken();
        int id =1;
        String name = "Lucy";
        String color = "While";
        int age=2;
        boolean isMolting = false;
        
        
        System.out.println("Egg --->" + egg);
        System.out.println(" Poop-->" + poop);
        System.out.println("Chicken -->" + chicken);
        
        Chicken chicken2 = new Chicken(id , name, color , age, isMolting);
        System.out.println("chicken2--->" + chicken2);
        
        id = 2;
        name = "Maruja";
        color = "black";
        age = 1;
        isMolting = true;
        chicken2 = new Chicken(id, name, color, age, isMolting);
        
        System.out.println("chicken 2 --> " + chicken2);
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("\n\nPlease enter data for chiken --> ");        
<<<<<<< HEAD
        
        
        
=======

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
        System.out.println("Enter ID --->");
        id = scanner.nextInt();
        
        System.out.println("Enter name --->");
        name = scanner.next();
        
        System.out.println("Enter Color --->");
        color  = scanner.next();
        
        System.out.println("Enter Egg --->");
        age = scanner.nextInt();
        
        
        
        System.out.println("It was done with success");
        
    }
    
}
