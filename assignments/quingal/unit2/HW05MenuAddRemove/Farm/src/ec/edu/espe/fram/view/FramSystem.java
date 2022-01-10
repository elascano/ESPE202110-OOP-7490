package ec.edu.espe.fram.view;
import ec.edu.espe.fram.model.Chicken;
import ec.edu.espe.fram.model.ChickenCoop;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leandro Quinga
 */
/*
HOMEWORK HW05 : Keyboard input, add chickens, remove chickens by id
main infinite loop witch an if that allows me to introduce several chickens at a time
   -add chickens 
   -remove chickens 
   -show chickens in the coop 
   -show thew amount of chickens 
   -exit

HOMEWORK HW06 : Implement ArrayLists in your project
*/
public class FramSystem {
    public static void main(String[] args) {
        int id = 0;
        String name = null;
        String color = null;
        int age = 0;
        boolean molting = false;
        Chicken chicken;
        ChickenCoop chickenCoop ; 
        ArrayList<Chicken> chickens = new ArrayList<>();
        int option = 0;
       
        
        while (option != 5) {
            System.out.println("||||||||||||||||||||Selec option||||||||||||||||||");
            System.out.println("1.-Add Chickens \n2.-Remove Chickens \n3.-Show Chickens in the Coop \n4.-Show thew Amount of Chickens \n5.-Exit");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
            Scanner scanner = new Scanner(System.in);
            option = Integer.parseInt(scanner.next());                         
            chicken = new Chicken(id, name, color, age, molting);
            chickenCoop = new ChickenCoop(1, chickens);
                            
            if (option==1){
                
                
                System.out.println("<<<<<<<<<<<<<Add Chicken>>>>>>>>>>>>");
                System.out.println("id->");
                id = scanner.nextInt();
                System.out.print("Name->");
                name = scanner.next();
                System.out.println("Age->");
                age = scanner.nextInt();
                System.out.println("Molting->");
                molting=scanner.hasNext();
                chickenCoop.add(chicken); 
                
            }
            if (option==2){
                System.out.println("<<<<<<<<<<<<<<Remove ID>>>>>>>>>>>>>");
                System.out.println("id ->");
                id = scanner.nextInt();
                chickenCoop.remove(chicken);
            }
            if (option==3){
                System.out.println("<<<<<<<<<<<<<<<<<<<Show Chickens in the coop>>>>>>>>>>>>>>>>");
                chicken =new Chicken(id, name, color, age, molting);
                System.out.println("Cchicken Coop->"+chickenCoop);
            }
            if (option==4){
                System.out.println("<<<<<<<<<<<<<<<<<<<show thew amount of chickens>>>>>>>>>>>>>>>");
                System.out.println("Chicken in the chicekn coop->"+chickenCoop.countChickens());
            }
            if (option==5){
                System.out.println("exit");
                exit(0);
            }
            
    }    
}
}