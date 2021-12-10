/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.Egg;
import ec.edu.espe.model.Poop;
import java.util.Scanner;



/**
 *
 * @author Angel Guaman
 */
public class Farm {
  
   
    
    
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
        
        
        System.out.println("Please enter data for chiken --> ");        
        
        
        
        System.out.println("----->id<----");
        id = scanner.nextInt();
        
        System.out.println("- name --> ");
        name = scanner.next();
        
        System.out.println("--color-->");
        color  = scanner.next();
        
        System.out.println("Egg---->");
        age = scanner.nextInt();
        
        System.out.println("The id--> "+ id +"; name --> "+ name +"; color --> "+ color +"; Age --> "+ age);
        
        System.out.println("Good Luck");
        
    }
    
}
