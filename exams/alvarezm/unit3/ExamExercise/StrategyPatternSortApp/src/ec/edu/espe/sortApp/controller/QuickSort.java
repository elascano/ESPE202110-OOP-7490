
package ec.edu.espe.sortApp.controller;

import java.util.Arrays;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */


public class QuickSort implements SortingStrategy{
     
    private int temp_array[];
    private int len;
 
    @Override
    public int[] sort(int[] data) {
         
        if (data == null || data.length == 0) {
            
        }
        this.temp_array = data;
        len = data.length;
        quickSort(0, len - 1);
        return null;
    }
     private void quickSort(int low_index, int high_index) {
         
        int i = low_index;
        int j = high_index;
        // calculate pivot number 
        int pivot = temp_array[low_index+(high_index-low_index)/2];
        // Divide into two arrays
        while (i <= j) {
               while (temp_array[i] < pivot) {
                i++;
            }
            while (temp_array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (low_index < j)
            quickSort(low_index, j);
        if (i < high_index)
            quickSort(i, high_index);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = temp_array[i];
        temp_array[i] = temp_array[j];
        temp_array[j] = temp;
    }
     
     // Method to test above
    public static void main(String args[])
    {
        QuickSort ob = new QuickSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}