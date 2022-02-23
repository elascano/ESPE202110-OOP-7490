
package ec.edu.espe.sortApp.controller;

/**
 *
 * @author Andrea Tapia
 */
public class InsertionSort implements SortingStrategy {
    
    @Override
    public int[] sort(int[] data) {
        System.out.println("Ranking" + data + ", using Insertion sort");
        int[] sortedData = data; 
        return sortedData;
    }
    
}
