/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FarmIntroduce.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author malvarez
 */
public class FarmIntroduce {
    public static void main(String[] args) {
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
          
        int id =1;
        String name = "Lucy";
        String color = "white and brown";
        int age =2;
        boolean isMolting = false;
        
        System.out.println("MICHELLE ALVAREZ");    
        System.out.println("Egg-->" + egg);
        System.out.println("Poop--> " + poop);
        System.out.println("Chicken-->" + chicken);
        
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2 -->" + chicken2);
        
        chicken2 = new Chicken(id, name, color, age, isMolting);
        id=2;
        name="Maruja";
        color ="black";
        age = 1;
        isMolting = true;
        chicken2 =new Chicken(id ,name ,color , age, isMolting);
        System.out.println("chicken2-->" + chicken2);
        
        System.out.println("***Please enter data for chicken***");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter data for Id:");
        id = scanner.nextInt();
        System.out.println("The Chicken Id is : " + id);
        
        System.out.println("Please enter data for Chicken name: ");
        name = scanner.next();
        System.out.println("The Chicken name is: " + name);
        
        System.out.println("Please enter data for Chicken color:");
        color = scanner.next();
        System.out.println("The Chicken color is: " + color );
        
        System.out.println("Please enter data for Chicken age:");
        age = scanner.nextInt();
        System.out.println("The Chicken age is: " + age);
        
        System.out.println("Please enter data for is Molting:");
        isMolting = scanner.nextBoolean();
        System.out.println("The Chicken is molting?? " + isMolting);
        
    }
  
}
