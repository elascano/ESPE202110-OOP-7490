
package ec.edu.espe.warehouse.view;

import ec.edu.espe.warehouse.model.Weapon;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author José
 */
public class Warehouse {

    
 /*
    public static void main(String[] args) {
        System.out.println("list of weapons from my Warehouse");
        String weapons;
        String fileName = "bases/weapon.csv"; //carpeta donde se guarda 
        weapons = FileManager.read(fileName);
        System.out.println("--> " + weapons);
        
        fileName = "bases/devices.csv"; //carpeta donde se guarda 
        String devices = FileManager.read(fileName);
        System.out.println("--> " + devices);
        //todo menu
        //todo codigo
        String weapon = "6,morter,heavy,operable,10";
        FileManager.save("bases/weapon.csv",weapon);
    }

   

    
}
*/
    
 public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String tecla = null;
        Weapon weapon = new Weapon(); 

    do{
	System.out.println("\n*******************Assigment 9*******************\n");
	System.out.println("******Sebastian Bernardo Caisatoa Ramirez******");
        System.out.println("\t\t Tire Data Management\n\n");
        
	System.out.println("1 ===> Add New weapon ");
	System.out.println("2 ===> View All weapon ");	
	System.out.println("3 ===> Delete All weapon in CSV ");
	System.out.println("4 ===> Search  weapon ID ");
	System.out.println("5 ===> Update weapon Data ");	        
	    
	System.out.print("\n\n");
	System.out.println("Enter your choice: ");
        
        int option;
        option = read.nextInt();
	boolean opc = (option <= 5);
	if (opc) {
            switch(option){                
            case 1 -> weapon.AddWeapons();
            case 2 -> weapon.ViewAllWeapons();
            case 3 -> weapon.DeleteWeapons();
            case 4 -> weapon.SearchWeaponID();
            case 5 -> weapon.updateWeaponID();
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
