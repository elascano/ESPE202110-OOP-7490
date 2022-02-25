/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.view;

import ec.edu.espe.SortApp.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Mateo Landazuri OOP
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
    
    public void sortData(){
        SortingContext sc = new SortingContext();
        int sortedList[]=sc.sort(data);
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
        sortapp.sortData();        
    }
}
