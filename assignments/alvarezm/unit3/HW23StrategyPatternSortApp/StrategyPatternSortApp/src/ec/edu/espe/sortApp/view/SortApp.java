
package ec.edu.espe.sortApp.view;

import ec.edu.espe.sortApp.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */

public class SortApp {
    
    Scanner input;
    int[] data;
    int sortedList[];
    
      
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("How many number are you goin to order: ");
        int cant;
        cant=input.nextInt();
        data=new int[cant];
<<<<<<< HEAD
        for(int f=0;f<data.length;f++) {
            System.out.print("Insert the numbers: ");
            data[f]=input.nextInt();
=======
        System.out.print("Insert the numbers: ");
        for(int f=0;f<data.length;f++) {
                        data[f]=input.nextInt();
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
        }	
    }
	
    public void printData() {
        for(int f=0;f<data.length;f++) {
            System.out.println(data[f]);
        }
    }
    
     public static void main(String args[ ]) {
         
        SortApp sortapp = new SortApp();
        sortapp.insertData();
        System.out.println("The disorder numbers are:");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
        
<<<<<<< HEAD
        sortedList[] = sc.sort(data);
=======
       // sortedList[] = sc.sort(data);
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
        
    }  
}


