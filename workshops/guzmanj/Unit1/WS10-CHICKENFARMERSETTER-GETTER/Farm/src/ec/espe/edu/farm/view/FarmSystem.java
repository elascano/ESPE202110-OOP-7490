/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Egg;
import ec.espe.edu.farm.model.Poop;
import ec.espe.edu.farm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class FarmSystem {
    public static void main(String[] args){
        System.out.println("WS11 Associations ->Jose Guzman<-");
        Egg egg=new Egg();
        Poop poop=new Poop();
        Chicken chicken= new Chicken();
        
        System.out.println("the egg");
        System.out.println("->" + egg);
        
        System.out.println("the poop");
        System.out.println("->" + poop); 
        
        System.out.println("the Chicken");
        System.out.println("->" + chicken);
        int id=1;
        String name="Lucy";
        String color="white and brown";
        int age=2;
        boolean isMolting=false;
        
        Chicken chicken2=new Chicken(id,name,color,age,isMolting);
        System.out.println("chicken2 -->" + chicken2);
        
        id=2;
        name="Maruja";
        color="black";
        age=1;
        isMolting=true;
        
        chicken2=new Chicken(id,name,color,age,isMolting);
        System.out.println("chicken2 -->" + chicken2);
        
        System.out.println("Insert the dates of the chicken");
        
        Scanner scanner= new Scanner(System.in);
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
        chicken2=new Chicken(id,name,color,age,isMolting);
        System.out.println("chicken3 -->" + chicken2);
    }
}
