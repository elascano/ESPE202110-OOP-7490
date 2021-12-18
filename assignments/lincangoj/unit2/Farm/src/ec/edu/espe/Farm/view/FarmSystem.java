package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.ChickenCoop;
import ec.edu.espe.farm.model.Chicken;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Lincango
 */
public class FarmSystem {
    public static void main(String[] args) {
                
        int id = 0;
        String name = "";
        String color = "";
        int age = 0;
        boolean isMolting = true;
        
        Chicken chicken;
        ChickenCoop chickenCoop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickenCoop = new ChickenCoop(id, chickens);

        Integer option = 0;
        while (option>=0 ) 
        {
            System.out.println("----------->Chicken farm set<-----------");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("1.-Add Chickens\n2.-Remove Chickens");
            System.out.println("3.-Chicken data added\n4.-Number of chickens in the farm");
            System.out.println("5.-Exit");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            if (option == 1) {
                chicken = new Chicken();
                chickenCoop.add(chicken);
                System.out.println(chicken);
                System.out.println("\n");

            } else {
                if (option == 2) {
                    System.out.println("Please enter the ID to delete:");
                     id = scanner.nextInt();
                    chickenCoop.remove(id);
                    System.out.println("The chicken has been eliminated : " + chickenCoop.countChickens());
                    System.out.println("\n");

                } else {
                    if (option == 3) {
                        System.out.println("   --------> Chickens in the farm <--------   ");
                        chicken = new Chicken(id, name, color, age, isMolting);
                        System.out.println("chicken coop -> " + chickenCoop);
                        System.out.println("\n");

                    } else {
                        if (option == 4) {
                            System.out.println("  --------> Amount of chickens <---------   ");
                            chicken = new Chicken(id, name, color, age, isMolting);
                            System.out.println("Chickens in the chicken coop : " + chickenCoop.countChickens());
                            System.out.println("\n");
                            
                        } else {
                            if (option == 5) {
                                exit(0);
                            }
                        }
                    }

                }

            }
        }
       
    }

}
            
        
  
        
        
        
        
        
        
        
        
    /*  
    int a;
    Integer i=0;
    float b;
    Float f=3.4F;
    double c;
    Double d=12.D;
    String s= "Daniel";
    
       System.out.println("the int  of the  float -->"+ f.intValue());
        b=7.9F;
        
        System.out.println("float b-->"+b);
        System.out.println("float b-->"+(int)b);
        
        a=10;
        System.out.println("int a-->"+a);
        System.out.println("int a-->"+(float)a);
        System.out.println("int a-->"+a);
        
        System.out.println("String s + Integer i -->"+(s+ i.toString()));
        
        System.out.println("int a + Interger i-->"+(a+ i.toString()));
        System.out.println("int a + Interger i-->"+(a+ i.intValue()));
         */     

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
 
        //Collection numbers;
        //Collection numbers= new Collection();
        
        //ArrayList<int>numbers= new ArrayList<>();   
    
    //varibles primitivas int,float,bollean,double..
  
    
            
            
    

