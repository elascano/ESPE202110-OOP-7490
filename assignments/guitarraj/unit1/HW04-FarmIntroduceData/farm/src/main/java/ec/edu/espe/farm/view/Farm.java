
package ec.edu.espe.farm.view;
import java.util.Scanner;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author Guitarra Jhon
 */

public class Farm {
    public static void main(String[] args) {
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id=1;
        String name= "Lucy";
        String color="white and brown";
        int age = 2;
        boolean isMolting = false;
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
          
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2 --> "+ chicken2);
        
        id=2;
        name="Maruja";
        color = "black";
        age = 1;
        isMolting= true;
        chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2--> "+chicken2);
        
        Scanner read = new Scanner(System.in);
                
        Chicken chicken3 = new Chicken(id, name, color, age, isMolting);
        System.out.println ("Please enter data for chicken");
        System.out.println ("Enter the ID --> ");
        id= read.nextInt();
        System.out.println ("Enter the Chick's name --> ");
        name = read.next();
        System.out.println ("Enter the Chick's color--> ");
        color = read.next();
        System.out.println ("Enter the Chick's age--> ");
        age = read.nextInt();
        System.out.println ("Enter the Chick's T(1) or F(0)--> ");
        int option = read.nextInt();        
        if (option==1) {
            isMolting= true;
        }
        if (option==0) {
            isMolting= false;
        }
        chicken3 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 3 --> "+ chicken3);
       
    }
}