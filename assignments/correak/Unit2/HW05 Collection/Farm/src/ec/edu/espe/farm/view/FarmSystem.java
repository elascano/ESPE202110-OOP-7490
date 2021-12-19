/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class FarmSystem {
    
   
    
    public static void main(String[] args){
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
       
        int option;
        int id; 
        String name; 
        String color; 
        int age; 
        Scanner sc = new Scanner(System.in);
        
      
        do{
        System.out.println("-------MENU-------");
        System.out.println(" 1.Add Chicken \n 2.remove chickens \n 3.Show chickens in the coop");
        System.out.println(" 4.Show the amount of the chickens \n 5.Exit");
        System.out.println("write your option: ");
        option = sc.nextInt();
        
         switch(option){
             case 1:
                System.out.println("Color: ");
                color = sc.next();                
                System.out.println("Name: ");
                name = sc.next();       
                System.out.println("Age: ");
                age =sc.nextInt();               
                System.out.println("ID: ");
                id = sc.nextInt();
                
                 chicken= new Chicken(id, name, color, age);
                  chickenCoop=new ChickenCoop(id, chickens);
                 chickens.add(chicken);
                System.out.println( chickenCoop);
                 
                 break;
             case 2:

                System.out.println("Enter chicken id: ");
                id = sc.nextInt();
                chickens.remove(id);
                System.out.println( chickens);
                 break;
                 
            case 3:
                 
                System.out.println("Chickens in the coop:" + chickens.toString());
                for (int i=0; i<chickens.size();i++){
                System.out.println(chickens.get(i).getName());
                }  
            break;
            
            case 4:
                System.out.println("the number the chickens in the coop is:");
                int amount=chickens.size();
                System.out.println(amount);
                
            case 5:
         }
         } while(option!=5);
     
        }
}
