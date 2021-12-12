
package ec.edu.espe.introduce.view;
import ec.edu.espe.introduce.model.Chicken;
import ec.edu.espe.introduce.model.Egg;
import ec.edu.espe.introduce.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales
 */
public class FarmIntroduce {
  
    int id=0;
    String name ="";
    String color ="";
    
    public static void main(String[] args) {
        System.out.println("HW04FarmIntroduceData --> Anthony Morales <--");
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
        
        System.out.println("\nEnter the chicken's data");        
        
       
        System.out.println("Enter the id: ");
        id = scanner.nextInt();
        
        System.out.println("Enter the name: ");
        name = scanner.next();
        
        System.out.println("Enter the color: ");
        color  = scanner.next();
        
        System.out.println("Enter the age: ");
        age = scanner.nextInt();
        
        System.out.println("The id is --> "+ id +"; The name is --> "+ name +"; The color is --> "+ color +"; The age is --> "+ age);
        System.out.println("Good Luck");       
    }
}