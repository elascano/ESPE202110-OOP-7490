/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author melig
 */
public class FarmSystem {
    public static void main(String[] args) {
    Chicken chicken = null;
    ChickenCoop chickenCoop;
    ArrayList<Chicken>chickens= new ArrayList<>();
    chickenCoop = new ChickenCoop(0, chickens); 
    Scanner read = new Scanner(System.in);
    boolean Exit = false;
    
    while (!Exit) {
        
        int id=1;
        String name="Lucy";
        String colour="white and brown";
        int age= 1;
        boolean molting= true;
        
            System.out.println("Melissa Gómez Homework");   
            System.out.println("1. Add chickens");
            System.out.println("2. Display the chickens in the chicken coop");
            System.out.println("3. Display the chicken amount");
            System.out.println("4. Remove chickens");
            System.out.println("5. Exit");

            try {
 
                System.out.println("Please, choose an option");
                int option = read.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("You've select the first option");
                        System.out.println("Insert the chicken data: ");
                        System.out.println("Chicken id --->   ");
                        id = read.nextInt();
                        System.out.println("Chicken name --->   ");
                        name = read.next();
                        System.out.println("Chicken colour --->   ");
                        colour = read.next();
                        System.out.println("Chicken age --->   ");
                        age = read.nextInt();
                
                        chicken =new Chicken(id,name,colour,age,true);
                        chickenCoop.add(chicken);
                    case 2:
                        System.out.println("You've select the second option");
                        System.out.println("chicken in the coop -->" + chickenCoop);
                        break;
                    case 3:
                        System.out.println("You've select the third option");
                        System.out.println("Chicken amount -->" + chickenCoop.countChickens());
                        break;
                        
                    case 4:
                        System.out.println("You've select the fourth option");
                        chickenCoop.remove(chicken);
                        break;
                    case 5:
                        Exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                read.next();
            }
        }
    }
}

