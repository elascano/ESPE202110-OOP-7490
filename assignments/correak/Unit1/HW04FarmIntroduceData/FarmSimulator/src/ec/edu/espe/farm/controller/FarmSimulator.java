package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Chiken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Egg egg=new Egg(1);
        Poop poop =new Poop();
        Chiken chiken=new Chiken();
        int id=1;
        String name= "Lucy";
        String color ="white and brown";
        int age=2;
        boolean isMolting=false;
        
        System.out.println("HW  Kerly Correa");   
        System.out.println("Egg-->"+egg);
        System.out.println("Poop-->"+poop);
        System.out.println("Chicken-->"+chiken);
        
        Chiken chicken2=new Chiken(id, name, color, age, isMolting);
        System.out.println("Chicken2-->"+chicken2);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--Please enter the chicken data--");
        System.out.println("Color: ");
         color = sc.next(); 
        System.out.println("ID: ");
         id = sc.nextInt();
        System.out.println("Name: ");
         name = sc.next();       
         System.out.println("Age: ");
          age=sc.nextInt();
        System.out.println("Is molting");
         isMolting=sc.hasNextBoolean();
        
         
         System.out.println("The chicken: "+id+", "+name+ ", "+color+", "+age+", "+isMolting);
         
      
    }
    
    
}
