package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.ChickenCoop;
import ec.edu.espe.farm.model.Chicken;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Altamirano Cristhian
 */
public class FarmSystem {
    public static void main(String[] args) {

        Integer option = 0;
        while (option>=0 ) 
        {
            System.out.println("---------------------------");
            System.out.println("1.-Add Chickens\n2.-Remove Chickens");
            System.out.println("3.-Show Chickens in the coop\n4.-Show the amount of Chickens");
            System.out.println("5.-Exit");
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);
        
            Chicken chicken ;
            ChickenCoop chickenCoop; 
            ArrayList<Chicken> chickens = new ArrayList<>();
            chickenCoop = new ChickenCoop(0, chickens);

            if (option == 1) {

                chicken = new Chicken();
                chickenCoop.add(chicken);
                System.out.println("\n Chicken facts -->" + chicken);
                System.out.println("\n");

            } else {
                if (option == 2) {
                    System.out.println("Enter the id of the chicken you want to remove:");
                    int id = scanner.nextInt();
                    chickenCoop.remove(id);
                    System.out.println("The chicken has been eliminated -> " + chickenCoop.countChickens());

                } else {
                    if (option == 3) {
                        System.out.println("   --> The chickens in the farm <--   ");
                        chicken = new Chicken();
                        System.out.println("chicken coop -> " + chickenCoop);

                    } else {
                        if (option == 4) {
                            System.out.println("   --> Amount of chickens <--   ");
                            chicken = new Chicken();
                            System.out.println("Chickens in the chicken coop -> " + chickenCoop.countChickens());
                        } else {
                            if (option == 5) {
                                exit(0);
                            }
                        }
                    }

                }

            }
        }
       /*
        Chicken chicken ;
        ChickenCoop chickenCoop; 
        ArrayList<Chicken> chickens = new ArrayList<>();
       
        chicken = new Chicken (0, "Lucy", "White and brown", 0, true);
        chickenCoop = new ChickenCoop(0, hickens);
        
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

               
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/*      int a;
        Integer i=58;
        float b;
        Float f=3.4F;
        double c;
        Double d=12.4D;
        String s="Alexiz";
        System.out.println("tha int of the float -->" + f.intValue());
        b=7.9F;
        System.out.println("float b ->"+b);
        System.out.println("float b ->"+(int)b);
        
        a=10;
        System.out.println("float b ->"+a);
        System.out.println("float b ->"+(float)a);
        System.out.println("Integer i ->"+ (s+i.toString()));
        System.out.println("Integer i ->"+ (a+i.toString()));
        System.out.println("Integer i ->"+ (a+i.intValue()));
*/
    }
    
    
           
            }

