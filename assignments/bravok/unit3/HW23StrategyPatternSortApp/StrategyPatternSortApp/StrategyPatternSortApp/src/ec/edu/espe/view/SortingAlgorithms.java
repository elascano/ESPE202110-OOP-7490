
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import java.util.Scanner;
import javax.swing.JOptionPane;
import utils.MongoDB;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class SortingAlgorithms {
    public static void main(String[] args) {

        
        
        Scanner entry = new Scanner(System.in);
        SortingContext sortingContext = new SortingContext();
MongoDB mongo = null;

        int izq = 0;
        
        int der = izq;

        izq = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the arrangement"));

        int num[] = new int[izq];

        System.out.println("Enter the numbers");

        for (int i = 0; i < izq; i++) {
            System.out.println("Put your [" + (i + 1) + "] number: ");

            num[i] = entry.nextInt();
        }

        System.out.println("Your arrangement is: ");
        for (int i = 0; i < izq; i++) {
            System.out.println(num[i] + "");

        }

        //int izq[] = {1, 5,8,9};
        //int sortedList[] = sortingContext.sort(izq);

        sortingContext.sort(num,der);
        
               
        //for (int i = 0; i < izq.length; i++) {
        //sortingContext.sort(izq);
        //}
        //System.out.println("");
        //int izq2[] = {1, 9, 6, 2, 5, 7};
        //sortingContext.sort(izq2);
        //int izq3[] = {3, 99, 6, 100, 5, 7, 10000, 12, 34, 45, 12, 23};
        //sortingContext.sort(izq3);
    }
}
