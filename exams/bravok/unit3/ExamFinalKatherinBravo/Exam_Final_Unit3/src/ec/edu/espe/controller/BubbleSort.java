
package ec.edu.espe.controller;

import utils.SortingStrategy;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data, int der) {
        //TODO program the sort algorithm
        //sort the data and return
        int temp;
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        int[] sortedData = data;  //this is only here to complete
        System.out.print("Sorted using Bubble sort[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "-");
            //return sortedData;
            //System.out.println();
        }
       
        System.out.print("] ");
        return sortedData;
    }

}
