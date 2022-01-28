/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author José
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;   
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        chickenCoop = new ChickenCoop(0, chickens);
        int aux=3;              
        do{
            
            System.out.println("1. Option 1: Add chicken");
            System.out.println("2. Option 2: Remove chicken");
            System.out.println("3. Option 3: Show chickens");
            System.out.println("4. Option 2: chickens' amount");
            System.out.println("5. Exit");
            System.out.print("Your option: ");
            int option=read.nextInt();
            switch(option){                
                case 1:
                    System.out.print("Introduce the chicken ID: ");
                    chicken = new Chicken(0, " ", " ", 0, true);
                    int id=read.nextInt();
                    chicken.setId(id);
                    chickenCoop.add(chicken);
                    break;    
                    
                case 2:
                    System.out.print("Introduce the chicken ID: ");
                    id=read.nextInt();                    
                    for (int i = 0; i <chickens.size(); i++) {                       
                        if(chickens.get(i).getId()==id){
                            chickens.remove(chickens.get(i)); 
                        }                   
                    }
                    break;                    
                case 3:
                    System.out.println("chicken coop --> " + chickenCoop);
                    break;                    
                case 4:
                    System.out.println("Chickens in the chicken coop: " + chickenCoop.countChickens());
                    break;                    
                default:System.out.println("Exit"); 
                aux=0;
                    break;      
            }
            
        }while(aux!=0); 
        
       }
    
}
