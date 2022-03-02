
package ec.edu.espe.controller;

/**
 *
 * @author Melissa Gómez
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering"+ data + ", using Bubble sort" );
        int[] sortedData = data; 
        return sortedData;
    }
    
}
