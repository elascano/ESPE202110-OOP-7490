/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.BubbleSort;
import ec.edu.espe.model.InsertionSort;
import ec.edu.espe.model.QuickSort;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author KERLY CORREA
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int arraySize; 
        int sumaTotal=0;
	int arreglo[]; 
        int nElements,aux;	
		
//	System.out.println("enter the size of the array:");
//	arraySize=sc.nextInt(); 
//		
//        int[] number= new int[arraySize]; 
//		
//	System.out.println("Enter the number of array:");
//	for (int i = 0; i < number.length; i++) {
//            number[i]=sc.nextInt();  
//	}
//        
//        
//          BubbleSort bubble =new BubbleSort();
//        QuickSort quick = new QuickSort();
//	InsertionSort insertion = new InsertionSort();
//        
//	if (arraySize >= 0 && arraySize <= 3 ){
//            
//            bubble.Bubble(number);
//            for (int i = 0; i < number.length; i++) {
//                System.out.println("arreglado por bubble");
//                System.out.println(number[i]);
//                
//            }
//        }	
		
	
        nElements=Integer.parseInt(JOptionPane.showInputDialog("enter the size of the array:"));
        arreglo = new int[nElements];
        if(nElements <= 3){
        for (int i = 0; i < nElements; i++) {
            System.out.println((i+1)+". Enter number : ");
            arreglo[i]=sc.nextInt();
        }
        
      //metodo
           for (int i = 0; i < (nElements-1); i++) {
            for (int j = 0; j < (nElements-1); j++) {
                 if (arreglo[j]>arreglo[j+1]) {
                     aux=arreglo[j];
                     arreglo[j]=arreglo[j+1];
                     arreglo[j+1]=aux;
                 }
             }
        }
           
           System.out.println("method bubble:");
           for (int i = 0; i < nElements; i++) {
               System.out.println(arreglo[i]+" - "); 
        }
           System.out.println("");
    }
        else{
            System.out.println("el numero es mayor o menor que 3");
        }}
    
}
