
package ec.edu.espe.smart.view;

import ec.edu.espe.smart.model.ClassPro;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Angel guaman
 */
public class SmartHome {
     public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        ClassPro NaldrixClass = new ClassPro(); 

    do{
	
	
        System.out.println("\t\t Employee Information System\n\n");
       
        
	System.out.println("1. ---> Add New Product to CSV<------ ");
	System.out.println("2.  View All CSV Products---> ");	
	System.out.println("3. Delete Data in CSV --->");
	System.out.println("4.  Search Product from CSV---> ");
	System.out.println("5.  Update Product from CSV --->");	        
	    
	System.out.print("\n\n");
	System.out.println("Enter your choice: ");
        
        int option;
        option = read.nextInt();
	boolean opc = (option <= 5);
	if (opc) {
            switch(option){                
            case 1: 
                    NaldrixClass.AddRecord();
            break;
            case 2: 
                    NaldrixClass.ViewAllRecord();
            break;
            case 3:
                    NaldrixClass.DeleteRecordByID();                
            break;
            case 4: 
                    NaldrixClass.SearchRecordbyID();                
            break;
            case 5: 
                    NaldrixClass.updateRecordbyID();
            break;
            }
            } else {
            System.out.println("Enter a Number from 1 to 4."); 
            }
            System.out.println("\n\tDo you want to do any other option?\n");
            System.out.println("\t\t1. If you enter the 's'");
            System.out.println("\t\t2. Do not enter the 'n'");
		
            tecla = new Scanner(System.in).nextLine();
 	} while (tecla.equals("s") || tecla.equals("S"));                
    }        
}

        