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
            
            
   
       /*chicken = new Chicken (0, "Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);
        
        System.out.println("Chicken ->" + chicken);
        System.out.println("Chicken in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->"+ chickenCoop);
        
        chickenCoop.add(chicken);
        System.out.println("Chicken in the Chucken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop -> " + chickenCoop);
        
        chickenCoop.add(new Chicken(1, "Daysi", "White", 0, false));
        System.out.println("Chicken in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->"+ chickenCoop);
        
        chickenCoop.add(new Chicken(2, "Renata", "black", 0, false));
        chickenCoop.add(chicken);
        System.out.println("Chicken in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->"+ chickenCoop);
        
        chickenCoop.remove(chicken);
        System.out.println("Chicken in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->"+ chickenCoop);
       
        chicken = new Chicken (0, "Lucy", "White and brown", 0, true);
        chickenCoop.remove(chicken);
        System.out.println("Chicken in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->"+ chickenCoop);
         
            
        /*Integer option = 0;
        while (option >= 0) {
            System.out.println("xxxxxxxx Welcome to Farm chicken xxxxxxx");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("1.-Add Chickens\n2.-Remove Chickens");
            System.out.println("3.-Show Chickens in the coop\n4.-Show the amount of Chickens");
            System.out.println("5.-Exit");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            Chicken chicken;
            ChickenCoop chickenCoop;
            //chicken = new Chicken();
            ArrayList<Chicken> chickens = new ArrayList<>();
            chickenCoop = new ChickenCoop(0, chickens);

            if (option == 1) {
                chicken = new Chicken();
                chickenCoop.add(chicken);
                System.out.println(chicken);
                System.out.println("\n");

            }
        
            if (option == 2) {
                System.out.println("Enter the id of the chicken you want to remove:");
                int id = scanner.nextInt();
                chickenCoop.remove(id);
                System.out.println("The chicken has been eliminated : " + chickenCoop.countChickens());
                System.out.println("\n");

            }
            if (option == 3) {
                System.out.println("   --------> Chickens in the farm <--------   ");
                chicken = new Chicken(id, name, color, age, isMolting);
                System.out.println("chicken coop -> " + chickenCoop);
                System.out.println("\n");

            }
            if (option == 4) {
                System.out.println("  --------> Amount of chickens <---------   ");
                System.out.println("Chickens in the chicken coop : " + chickenCoop.countChickens());
                System.out.println("\n");

            }
            if (option == 5) {
                exit(0);
            }
        }*/
                    
        
        
       
     

        
        /*System.out.println("========Leandro Quinga=========");
        int a;
        Integer i = 58;
        float b;
        Float f = 3.9F;
        double c;
        Double d = 12.40;
        String s = "Leandro";
        
        System.out.println("the int of the float " + f.intValue());
        b = 7.9F;
        
        System.out.println("float b ->" + b);
        System.out.println("float ->" + (int)b); //cating
        
        a = 10;
        System.out.println("int a ->" + a);
        System.out.println("int a ->" +(float)a);
        System.out.println("int a ->" + a);
        
        System.out.println("String s + Integer i ->" + (s + i.toString()));
        
        System.out.println("int a + Integer i ->" + (a + i.toString()));
        System.out.println("int a + Integer i ->" + (a + i.intValue()));*/
        
    }    
}
}