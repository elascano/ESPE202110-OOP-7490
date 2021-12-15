
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author melig
 */
public class Farm {
    public static void main(String[] args) {
        System.out.println("WS11 Associations ---> Melissa Gómez <---");
        Egg egg=new Egg(1);
        Poop poop=new Poop();
        Chicken chicken= new Chicken();
        int id=1;
        String name="Lucy";
        String color="White and brown";
        int age=2;
        boolean isMolting=false;
        
        System.out.println("Egg --->" + egg);
        System.out.println("Poop --->" + poop);
        System.out.println("Chicken -->" + chicken);
        
        Chicken chicken2= new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken2 --->" + chicken2);
        
        id=2;
        name= "Maruja";
        color="black";
        age=1;
        isMolting= true;
        chicken2= new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken2 --->" + chicken2);
        
       
        System.out.println("HW04 Farm Introduce Data ---> Melissa Gómez <---");
        Scanner scanner= new
        Scanner(System.in);
        Chicken chicken3= new Chicken(id, name, color, age, isMolting);
        System.out.println("Please enter the data for the Chicken: ");
        System.out.println("Enter the id of the Chicken: ");
        id = scanner.nextInt();
        System.out.println("Enter the name:");
        name = scanner.next();
        System.out.println("Enter the color:");
        color = scanner.next();
        System.out.println("Enter the age of the chicken:");
        age = scanner.nextInt();
        System.out.println("Enter the molting: ");
        isMolting = scanner.nextBoolean();
        chicken3= new Chicken(id, name, color, age, isMolting);
        System.out.println("chimeastSeafoodcken3 --->" + chicken3);
    }
}
