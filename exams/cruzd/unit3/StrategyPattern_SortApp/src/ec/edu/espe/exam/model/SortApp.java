package ec.edu.espe.exam.model;

import java.util.Scanner;
import ec.edu.espe.exam.model.SortingContext;
/**
 *
 * @author darling.cruz
 */
public class SortApp {
    
    Scanner input;
    int[] data;
    //int sortedList[];   
      
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("The elements to be ordered");
        int cant;
        cant=input.nextInt();
        data=new int[cant];
        for(int f=0;f<data.length;f++) {
            System.out.print("Put the numbers: ");
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
        System.out.println("Here are the numbers:");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
        

        
    }  
}
