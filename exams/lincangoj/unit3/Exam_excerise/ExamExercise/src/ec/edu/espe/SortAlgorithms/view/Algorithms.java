
package ec.edu.espe.SortAlgorithms.view;

import java.util.Scanner;

/**
 *
 * @author Daniel Lincango DEEL-ESPE
 */

public class Algorithms {
    
    Scanner input;
    int[] data;
    int sortedList[];
    
      
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("Enter number are you goin to order: ");
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
         
        Algorithms sortapp = new Algorithms();
        sortapp.insertData();
        System.out.println("The order of the algorithm is:");
        sortapp.printData();
        
        ec.edu.espe.SortAlgorithms.model.SortAlgorithms sc = new ec.edu.espe.SortAlgorithms.model.SortAlgorithms();
        
        //sortedList[] = sc.sort(data);
        
    }  
}


