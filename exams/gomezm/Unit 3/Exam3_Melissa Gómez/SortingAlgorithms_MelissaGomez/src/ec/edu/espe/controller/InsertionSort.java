
package ec.edu.espe.controller;

/**
 *
 * @author Melissa Gómez
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering"+ data + ", using Insertion sort" );
        int[] sortedData = data; 
        return sortedData;
    
    }
    
}
