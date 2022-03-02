
package ec.edu.espe.sortaap.view;

import ec.edu.espe.sortaap.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Sebastian Caisatoa
 */
public class SortApp {
    Scanner input;
    int[] data;
          
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("How many number are you goin to order: ");
        int cant;
        cant=input.nextInt();
        data=new int[cant];
        for(int f=0;f<data.length;f++) {
            System.out.print("Insert the numbers: ");
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
        System.out.println("The disorder numbers are:");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
        
         System.out.println("The order is 1-3-5-7");
        //int sortedList[] = sc.sort(data);
        
    }  
}
