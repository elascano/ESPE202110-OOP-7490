
package ec.edu.espe.sortApp.view;

import ec.edu.espe.sortApp.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */

public class SortApp {
    
    Scanner input;
    int[] data;
    int sortedList[];
    
      
    public void insertData(){
        System.out.println("--> HW23 - Sort App <--");
        input=new Scanner(System.in);
        System.out.print("How many numbers do you want sort?: ");
        int cant;
        cant=input.nextInt();
        data=new int[cant];
        for(int f=0;f<data.length;f++) {
            System.out.print("Enter the number: ");
            data[f]=input.nextInt();
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
        System.out.println("The unordered numbers are: ");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
    }  
}


