package ec.edu.espe.practicalTestUnit3.model;

import ec.edu.espe.practicalTestUnit3.control.BubbleSort;
import ec.edu.espe.practicalTestUnit3.control.InsertionSort;
import ec.edu.espe.practicalTestUnit3.control.QuickSort;
import ec.edu.espe.practicalTestUnit3.control.SortingStrategy;
import java.util.ArrayList;

/**
 *
 * @author darling.cruz
 */
public class SortingContext {

    public SortingStrategy setSortStrategy(int n,ArrayList<Integer> listQuick) {
        if (n >= 0 && n <= 3) {
            BubbleSort strategy = new BubbleSort();
            strategy.bubblekSort(listQuick);
        }

        if (n > 3 && n <= 7) {
            InsertionSort strategy = new InsertionSort();
            strategy.insertionSort(listQuick);
        }

        if (n > 7) {
            QuickSort strategy = new QuickSort();
            strategy.quickSort(listQuick, 0, listQuick.size()-1);
        }
        return null;
    }
}
