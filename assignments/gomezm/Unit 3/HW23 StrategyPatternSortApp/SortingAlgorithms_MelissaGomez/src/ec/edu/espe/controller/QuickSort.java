
package ec.edu.espe.controller;

/**
 *
 * @author Melissa Gómez
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering"+ data + ", using Quick sort" );
        int[] sortedData = data; 
        return sortedData;
    }
    
}
