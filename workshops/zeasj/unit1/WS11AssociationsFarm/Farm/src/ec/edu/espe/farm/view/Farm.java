package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Joel Zeas
 */
public class Farm {
    public static void main(String[] args) {
        System.out.println("WS11 Associations --> Joel Zeas <--");      
               
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        int age;
        String color;
        boolean isMolting = false;
        Chicken chicken = new Chicken();
        boolean continuee = true;
        
        
        System.out.println(" -----> Welcome to the chicken data logging system on a farm <----");
        
        System.out.println("Please enter the ID of the chicken --> ");
        id = scanner.nextInt();
        
        System.out.println("Please enter the NAME of the chicken --> ");
        name = scanner.next();
        
        System.out.println("Please enter the AGE of the chicken --> ");
        age = scanner.nextInt();
        
        System.out.println("Please enter the COLOR of the chicken --> ");
        color = scanner.next();
        
        System.out.println("The ID of the chicken is = " + id + "; the name is = " + name + "; the age is = " + age + "; the color is = " + color );
        
    }
}
