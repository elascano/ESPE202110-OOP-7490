
package ec.edu.espe.sortApp.controller;

/**
 *
 * @author Andrea Tapia
 */

public class QuickSort implements SortingStrategy{
    
    @Override
    public int[] sort(int[] data) {
        System.out.println("Ranking" + data + ", using Quick sort");
        int[] sortedData = data; 
        return sortedData;
    }
    
}