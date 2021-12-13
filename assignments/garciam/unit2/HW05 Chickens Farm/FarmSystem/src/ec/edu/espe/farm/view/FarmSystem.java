package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mayerly
 */
public class FarmSystem {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Chicken chicken;
        ChickenCoop chickenCoop = null;
        ArrayList<Chicken> chickens = new ArrayList<>();
         Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("Menu for the farm System");
        System.out.println("What do you want to do  --> Open menu-> Yes(1) // No (2)");
        int number = teclado.nextInt();
        while (number ==1){
            System.out.println("1.Add chickens\n 2.Remove chickens\n 3. Show chickens\n Show the amount ");
            int option = teclado.nextInt();
            
        if (option == 1){
            System.out.println("Enter data chicken -->");
          
            System.out.println("id-->");
                int id = teclado.nextInt();
            
            System.out.println("name-->");
            name= teclado.next();
            
            System.out.println("color -->");
            color = teclado.next();
            
            System.out.println("age -->");
                int age = teclado.nextInt();
            
            System.out.println("is Molting-->");
            molting = teclado.nextBoolean();
            
            chicken = new chicken(id, name, color, age, molting);
            chickenCoop.add(chicken);
            System.out.println("\n chicken-->"+chicken);
            System.out.println("\n");
            
            
            
     
        }
        
        if (option==2){
            
            chickenCoop.remove(id);
            System.out.println("Chicken has been removed"+chicken);
            
        }
        }

        
        
        
        
        
        
        
        
        
        chicken = new Chicken(0, "Lucy", "White and Brown", 0, true);
        chickenCoop = new ChickenCoop(0, chickens);

        System.out.println("chicken ->" + chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

        chickenCoop.add(chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

        chickenCoop.add(new Chicken(1, "Daysi", "white", 0, false));
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

        chicken = new Chicken(2, "Renata", "black", 0, false);
        chickenCoop.add(chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

        chickenCoop.remove(chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

        chicken = new Chicken(0, "Lucy", "White and Brown", 0, true);
        chickenCoop.remove(chicken);
        System.out.println("chickens in the chicken coop ->" + chickenCoop.countChickens());
        System.out.println("chicken coop ->" + chickenCoop);

    }

    private static class teclado {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public teclado() {
        }
    }

}
