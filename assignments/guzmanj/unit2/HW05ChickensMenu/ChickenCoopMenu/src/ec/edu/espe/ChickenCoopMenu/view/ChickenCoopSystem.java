/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenCoopMenu.view;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.ChickenCoopMenu.model.Chicken;
import ec.edu.espe.ChickenCoopMenu.model.ChickenCoop;
/**
 *
 * @author Jose Guzman
 */
public class ChickenCoopSystem {
    public static void main(String[] args) {        
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        Chicken chicken=null;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens=new ArrayList<>();
        chickenCoop=new ChickenCoop(0,chickens);
        
        System.out.println("Welcomo to the Chicken Coop, please select one option");
        System.out.println("1. Add Chickens");
        System.out.println("2. Remove Chickens");
        System.out.println("3. Show chickens in the coop");
        System.out.println("4. Show the amount of chickens");
        System.out.println("5. Exit");
        
        Scanner scanner= new Scanner(System.in);
        
        int opcion=0;
            while(opcion!=5){
                opcion=scanner.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Insert the dates of the chicken");
                        System.out.println("-id -->");
                        id=scanner.nextInt();
                        System.out.println("-name -->");
                        name=scanner.next();
                        System.out.println("-color -->");
                        color=scanner.next();
                        System.out.println("-age -->");
                        age=scanner.nextInt();
                        System.out.println("Enter molting status");
                        isMolting=scanner.nextBoolean();
                        
                        chickenCoop.add(new Chicken(id,name,color,age,isMolting));
                        System.out.println("Please re-insert an option");
                        break;
                    case 2:
                        chickenCoop.remove(chicken);
                        System.out.println("Please re-insert an option");
                        break;
                    case 3:
                        System.out.println("chicken coop ->" + chickenCoop);
                        System.out.println("Please re-insert an option");
                        break;
                    case 4:
                        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
                        System.out.println("Please re-insert an option");
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println("Please re-insert an option");
                        break;
            }
        }
    }
}
