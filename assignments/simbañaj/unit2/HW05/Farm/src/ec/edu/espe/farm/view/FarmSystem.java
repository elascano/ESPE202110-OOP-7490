
package ec.edu.espe.farm.view;


import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Simbaña J
 */
public class FarmSystem {
    public static void main(String[] args) {
    int option;
    int id = 0;
    String name;
    String color;
    int age;
    String tecla = null;
    Chicken chicken;
    ChickenCoop chickenCoop;
    ArrayList<Chicken>  chickens = new ArrayList<>();
              
    chicken = new Chicken(0,"Lucy","white and brown", 0, true);
    chickenCoop = new ChickenCoop(0, chickens);
    
    
    
    Scanner read = new Scanner(System.in);
    System.out.println("\n\tOption menu:\n" );
    System.out.println("\t1.Add chicken:\n" );
    System.out.println("\t2.Remove chicken:\n" );
    System.out.println("\t3.Show chicken in the coop:\n" );
    System.out.println("\t4.Show the amount of chicken:\n" );
    
  
    }
    
    
   
}
