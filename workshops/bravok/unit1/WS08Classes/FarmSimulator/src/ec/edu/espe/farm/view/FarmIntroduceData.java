
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;
/**
 *
 * @author Kathy
 */
public class FarmIntroduceData {
    public static void main(String[] args) {
        System.out.println("HW04FarmIntroduceData--> Katherin Bravo <--");
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id =1;
        String name = "Lucy";
        String color = "white and brown";
        int age = 2;
        boolean isMolting = false;
        
        System.out.println("Egg --> " + egg);
        System.out.println("Poop --> " + poop);
        System.out.println("Chicken --> " + chicken);
        
       Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);
       
       id=2;
       name= "Maruja";
       color= "black";
       age=1;
       isMolting= true;
       chicken2 = new Chicken(id, name, color, age, isMolting);
       System.out.println("Chicken 2 --> " + chicken2);
       
       Scanner read = new Scanner (System.in);
       
       Chicken chicken3 = new Chicken (id, name, color, age, isMolting);
       
       System.out.println("Please enter data for chicken");
       System.out.println("- Put the chicken ID ---> ");
       id = read.nextInt();
       
       System.out.println("- Put the chicken name --->");
       name = read.next();
       
       System.out.println("- Put the chicken color --->");
       color = read.next();
       
       System.out.println("- Put the age of the chicken --->");
       age = read.nextInt();
       
       System.out.println("- Put the Chick's F(0) or T(1) --->");
        int option = read.nextInt();
        if (option==1){
            isMolting= true;
        }
        if (option==0){
          isMolting= false;  
        }
        
       chicken3 = new Chicken(id, name, color, age, isMolting);
       System.out.println("chicken 3 -->" + chicken3);
       
                 
    }
   
}
