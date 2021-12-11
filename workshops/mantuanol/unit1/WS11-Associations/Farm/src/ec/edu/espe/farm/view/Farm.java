
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class Farm {
    public static void main(String[] args) {
        Egg egg =new Egg(1);
        Poop poop= new Poop();
        Chicken chicken = new Chicken();
        int id=1;
        String name ="Kirito";
        String color="blue and green";
        int age=20;
        boolean isMolting=false;
        
        System.out.println("The egg");
        System.out.println("--->" + egg);
        
        System.out.println("The poop");
        System.out.println("--->" + poop);
        
        System.out.println("The chicken");
        System.out.println("--->" + chicken);
        
        System.out.println("Chicken activities");
        chicken.doStuff(0);
    
        Chicken chicken2= new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2--->"+chicken2);
        
        id = 2;
        name ="Minato";
        color="yellow";
        age=12;
        isMolting=true;
        chicken2= new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2--->"+chicken2);
    
        Scanner read = new Scanner(System.in);
        /*Leonel Mantuano
        */
        Chicken chicken3= new Chicken(id, name ,color,age,isMolting);
        System.out.println("Please enter data for chicken");
        System.out.println("Enter ID");
        id=read.nextInt();
        System.out.println("Enter chiken name");
        name=read.next();
        System.out.println("Enter chicken color");
        color=read.next();
        System.out.println("Enter chicken age");
        age= read.nextInt();
        System.out.println("enter chicken T(1) or F(0)->");
        int option = read.nextInt();
        if(option==1)
        {
            isMolting=true;
        }
        if (option==0){d.next();
            System.out.println("Enter chicken color -> ");
            color= read.next();
            System.out.println("Enter chicken  age-> ");
            age=read.nextInt();
                isMolting=false;
         
        }
        chicken3 = new Chicken(id,name,color,age,isMolting);
        System.out.println("Chicken 3 -> " +chicken3);
        
        
    }
    
    
}
