
package ec.edu.esoe.Exam3p.view;

import ec.edu.esoe.Exam3p.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
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
        System.out.println("their scrambled numbers are");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
     }
        
}
