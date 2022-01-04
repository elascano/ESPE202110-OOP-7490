
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Farm {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WS11 Associatons --> Camila Teca <-- "); 
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id=1;
        String name = "Lucy";
        String color = "white and brown";
        int age =2;
        boolean isMolting = false;
        
        
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
        
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2 --> " + chicken2);
        
        id=2;
        name= "Maruja";
        color= "black";
        age=1;
        isMolting= true;
        chicken2= new Chicken(id,name,color,age,isMolting);
        System.out.println("chicken 2 --> " + chicken2);
        
        
        System.out.println("HW04 FARM --> Camila Teca <-- ");
        System.out.println("Please enter data for chicken:");
        
        System.out.println("- id  --> ");
        id = scanner.nextInt();
        
        System.out.println("- name  --> ");
        name = scanner.next();
        
        System.out.println("- color  -->");
        color = scanner.next();
        
        System.out.println("- age  -->");
        age = scanner.nextInt();
        
        System.out.println("- Molting  -->");
        isMolting = scanner.nextBoolean();
        
        chicken= new Chicken(id,name,color,age,isMolting);
        System.out.println("chicken  --> " + chicken);
        
    }
}
