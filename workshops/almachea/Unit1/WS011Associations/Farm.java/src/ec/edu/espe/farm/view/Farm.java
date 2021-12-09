/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Farm {
    public static void main(String[] args) {
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken= new Chicken();
        int id;
        String name;
        String color;
        int age;
        boolean isMolting = true;
        
        System.out.println("Chicken  -->" + chicken);
        
        System.out.println("Please enter Id of the Chicken");
        Scanner scanner = new Scanner(System.in);
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
        chicken = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken " + id + "-->" + chicken  );
    }
}   