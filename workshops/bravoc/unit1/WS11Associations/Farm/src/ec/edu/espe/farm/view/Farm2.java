package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Christian Bravo
 */
public class Farm2 {
    public static void main(String[] args) {
        System.out.println("HW04--> NAME<--");
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id =1;
        String name = "Lucy";
        String color = "white and brown";
        int age = 2;
        boolean isMolting = false;
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
        
       Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);
       
       id=2;
       name= "Maruja";
       color= "black";
       age=1;
       isMolting= true;
       chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);                                                                                                           System.out.println("Chicken 2 -->" + chicken2);
        
        System.out.println("Please enter Id of the Chicken");
       
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("- id  --> ");
        id = scanner.nextInt();
        
        System.out.println("Please enter the age of the Chicken");
        System.out.println("- age --> ");
        age = scanner.nextInt();
        
        System.out.println("Please enter the name of the Chicken");
        System.out.println("- name --> ");
        name = scanner.next();
        
        System.out.println("Please enter the color of the Chicken");
        System.out.println("- color --> ");
        color = scanner.next();
          
        isMolting = true;
        chicken2 = new Chicken(id, age, name, color, isMolting);
        System.out.println("chicken " + id + "-->" + chicken2  );
        
        System.out.println("chicken activities");
        chicken.doStuff(0);
    }
}