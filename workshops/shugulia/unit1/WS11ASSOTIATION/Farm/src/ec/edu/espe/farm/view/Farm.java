
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Ajshuguli 
 */
public class Farm {
    public static void main(String[] args){
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id =1;
        String name = "Lucy";
        String color= "White and brown";
        int age = 2;
        boolean isMolting = false;
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
        
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("Chicken 2 --> " + chicken2);
        
        id = 2;
        name = "Maruja";
        color = "black";
        age = 1;
        isMolting = true;
       
        chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("Chicken 2 --> " + chicken2);        
        
        Scanner sc = new Scanner(System.in);

        String color;
        boolean isMolting;
        int id;
        int age;
        String name;
  

        System.out.println("--age --->");
        age=sc.nextInt ();

        System.out.println("--color --->");
        color=sc.next();
     
        System.out.println("--id --->");
        id=sc.nextInt ();
        
        System.out.println("--name --->");
        name=sc.next();

        System.out.println("--molting status --->");
        isMolting=sc.nextBoolean();
        
        chicken= new Chicken (id,name,color,age,isMolting);
        System.out.println ("chicken -->"+chicken);
    }
}
    
