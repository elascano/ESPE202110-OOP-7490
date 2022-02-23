package ec.edu.espe.view;

import ec.edu.espe.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Leonel.M
 */
public class StrategyPattern {

    public static void main(String[] args) {
    Scanner input;
    int[] data;
    int sortedList[];
    
      
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("Amount of numbers to enter: ");
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
         
        StrategyPattern sortapp = new StrategyPattern();
        sortapp.insertData();
        System.out.println("Disorder numbers are:");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
        
        sortedList[] = sc.sort(data);
        
    }  
 }
    
