package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author SETayoRuiz
 */
public class FarmData {

 int id=0;
    String name ="";
    String color ="";
    
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
        System.out.println("author: Sebastian Tayo");
        System.out.println(" Please enter chicken information --> ");        
        
       
        System.out.println(" id -->");
        id = scanner.nextInt();
        
        System.out.println(" name --> ");
        name = scanner.next();
        
        System.out.println(" color-->");
        color  = scanner.next();
        
        System.out.println(" age -->");
        age = scanner.nextInt();
        
        System.out.println("The id --> "+ id +" ;name --> "+ name +" ;color --> "+ color +" ;Age --> "+ age);
             
    }
}
    

