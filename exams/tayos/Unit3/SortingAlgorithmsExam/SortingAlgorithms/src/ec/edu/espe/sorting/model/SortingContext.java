package ec.edu.espe.sorting.model;

import ec.edu.espe.sorting.controller.BubbleSort;
import ec.edu.espe.sorting.controller.InsertionSort;
import ec.edu.espe.sorting.controller.QuickSort;
import ec.edu.espe.sorting.controller.SortingStrategy;

/**
 *
 * @author Sebas
 */
public class SortingContext {

    private SortingStrategy strategy;

    public int[] sort(int data[]) {
        int size;
        size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 6) {
            strategy = new BubbleSort();
        }

        if (n >= 6 && n < 10) {
            strategy = new InsertionSort();
        }

        if (n >= 11) {
            strategy = new QuickSort();
        }

        return strategy;
    }
}
