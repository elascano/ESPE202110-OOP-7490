package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Paul Saltos 
 */
public class Farm {
     public static void main(String[] args) {
         Egg egg = new Egg(1);
         Poop poop = new Poop();
         Chicken chicken = new Chicken();
         int id=1;
         String name="lucy";
         String color= "white and brown";
         int age=2;
         boolean isMolting= false;
        System.out.println("Egg -->" + egg);
        System.out.println("Poop ->" + poop);
        System.out.println("Chicken ->" + chicken);
     
     
     Chicken chicken2 = new Chicken (0 ,name , color , 0 ,true );
     System.out.println("Chicken2 ->" + chicken2);
     
     id =2;
     name="Maruja";
     color="black";
     age=1;
     isMolting = true;
     chicken2 = new Chicken (id , name, color , age, isMolting);
     System.out.println("Chicken2 ->" + chicken2);
     
     System.out.println("chicken 2 --> " + chicken2);
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("\n Please enter data for chiken ");        
        
        System.out.println("\n id ");
        id = scanner.nextInt();
        
        System.out.println("\n name  ");
        name = scanner.next();
        
        System.out.println("\n color ");
        color  = scanner.next();
        
        System.out.println("\n Egg ");
        age = scanner.nextInt();
        
        System.out.println("The id--> "+ id +"; name --> "+ name +"; color --> "+ color +"; Age --> "+ age );
        
        System.out.println("Good Luck");
    }
}
