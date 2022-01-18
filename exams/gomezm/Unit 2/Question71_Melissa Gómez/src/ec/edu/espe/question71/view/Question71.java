
package ec.edu.espe.question71.view;

import ec.edu.espe.question71.model.Specification;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Melissa Gomez
 */
public class Question71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        Specification specification = new Specification(); 

    do{
    
    System.out.println("Melissa Gómez");
    System.out.println("\t\n Menu");    
    System.out.println("1 To add a new specification");
    System.out.println("2 To search the specification by ID");        
    System.out.print("\n");
    System.out.println("select an option");
        
        int option;
        option = read.nextInt();
    boolean opc = (option <= 2);
    if (opc) {
            switch(option){                
            case 1: 
                    specification.AddSpecification();
            break;
            case 2: 
                    specification.SearchSpecificationID();
            break;
            }
            } else {
            System.out.println("Select a number between 1 to 2"); 
            }
            System.out.println("Do you want to do any other option?\n");
            System.out.println("Yes 'y'");
            System.out.println("No'n'");
            tecla = new Scanner(System.in).nextLine();
    } while (tecla.equals("y") || tecla.equals("Y"));                
    }   
  }
    
