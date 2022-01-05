
package farm;

import java.util.Scanner;

/**
 *
 * @author ALAN
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Assigments from ALAN SHUGULI");
        
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
  

        System.out.println("the id ");
        id=sc.nextInt ();

        System.out.println("The name ");
        name=sc.next();
     
        System.out.println("The age ");
        age=sc.nextInt ();
        
        System.out.println("The color");
        color=sc.next();

        System.out.println("Enter molting status");
        isMolting=sc.nextBoolean();
        
        Chicken chicken = new Chicken (id,name,color,age,isMolting);
        System.out.println ("chicken -->"+chicken);
    }
}
 
    

