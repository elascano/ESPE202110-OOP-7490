package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristhian Arroba
 */
public class FarmSystem {
    public static void main(String[] args) {

        Integer option = 0;
        while (option != 2) {
            System.out.println("---------------------------");
            System.out.println("1.-Add Chickens\n2.-Remove Chickens");
            System.out.println("3.-Show Chickens in the coop\n4.-Show the amount of Chickens");
            System.out.println("5.-Exit");
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            option = Integer.parseInt(opcionTexto);

            ChickenCoop chickenCoop = null;
            int id;
            String name;
            String color;
            int age;
            boolean molting;


            ArrayList<Chicken> chickens = new ArrayList<>();


            if (option == 1) {

                System.out.println("\n---------------> DATA Chicken <--------------");
                scanner = new Scanner(System.in);
                System.out.println("---  id  --> ");
                id = scanner.nextInt();
                System.out.println("---  name  --> ");
                name = scanner.next();
                System.out.println("---  color --> ");
                color = scanner.next();
                System.out.println("---  age --> ");
                age = scanner.nextInt();
                System.out.println("---  modelting --> ");
                molting = scanner.nextBoolean();

                Chicken chicken = new Chicken(id, name, color, age, molting);
                chickenCoop.add(chicken);
                System.out.println("Chicken in the chicken coop -->" + chickenCoop.countChickens());
                System.out.println("chicken coop -->" + chickenCoop);

            }
            else
            {
                if (option == 2)
                {
                    System.out.println("ID -->");
                    int id = scanner.nextInt();
                    chickenCoop.remove(id);
                    System.out.println("Chicken has been removed ->" + chickenCoop.countChickens());

                }
                else{
                    if(option==3)
                    {
                        Chicken chicken = new Chicken(id,name,color, age, molting);
                        System.out.println("chicken coop -->" + chickenCoop);
                    }
                    else{
                        if (option == 4) 
                        {
                            chickenCoop = new ChickenCoop(0, chickens);
                            System.out.println("Chicken in the chicken coop -->" + chickenCoop.countChickens());
                        } 
                        else 
                        {
                            if (option == 5)                          
                            {
                                exit(0);
                            }
                        }
                    }
                       
                }

            }
        }
