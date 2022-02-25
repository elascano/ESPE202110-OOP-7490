
package ec.edu.espe.controller;

import utils.SortingStrategy;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public int[] sort(int data[],int der) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data,der);
    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 4) {
        sortingStrategy = new BubbleSort();
        }
        //if (n <= 3) {
            //sortingStrategy = new BubbleSort();
        //}
        if (n >= 4 && n < 7) {
        sortingStrategy = new InsertionSort();
        }
        //if (n > 3 && n <= 7) {
            //sortingStrategy = new InsertionSort();
        //}
        if (n >= 7) {
        sortingStrategy = new QuickSort();
        }
        //if (n > 8) {
            //sortingStrategy = new QuickSort();
        //}

        return sortingStrategy;

    }

}
