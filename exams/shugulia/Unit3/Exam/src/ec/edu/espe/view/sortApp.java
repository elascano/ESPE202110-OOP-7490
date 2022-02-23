
package ec.edu.espe.view;

import java.util.Scanner;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class sortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input;
        int[] data;
        int sortedList[];
    
      
    public void insertData(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number are you goin to order: ");
        int cant;
        cant=input.nextInt();
        int[] data = new int[cant];
        for(int f=0;f<data.length;f++) {
            System.out.print("Insert the numbers: ");
            data[f]=input.nextInt();
        }	
    }
	
    public void printData() {
        for(int f=0;f<data.length;f++){
            System.out.println(data[f]);
        }
    }
    
public static void main(String args[]) {
         
        sortApp sortapp = new sortApp();
        sortapp.insertData();
        System.out.println("The disorder numbers are:");
        sortapp.printData();
        
        sortingContext sc = new sortingContext();
        sortedList[] = sc.sort(data);
        
        
    }  
}



    }
    

