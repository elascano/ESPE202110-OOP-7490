
package ec.edu.espe.sortApp.controller;

/**
 *
 * @author Andrea Tapia
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        System.out.println("Ranking" + data + ", using Bubble sort");
        int[] sortedData = data; 
        return sortedData;
    }
    
}