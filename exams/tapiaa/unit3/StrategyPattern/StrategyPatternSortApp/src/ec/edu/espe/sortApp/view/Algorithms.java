package ec.edu.espe.sortApp.view;

import ec.edu.espe.sortApp.controller.SortingContext;

/**
 *
 * @author Andrea Tapia
 */
public class Algorithms {

    public class SortingAlgorithms {
        public static void main(String[] args) {
            // TODO code application logic here
            SortingContext sortingContext = new SortingContext();

            int data[] = {3, 5, 6, 7};
            int sortedList[] = sortingContext.sort(data);

            int data2[] = {3, 5, 6, 7, 5, 7};
            sortingContext.sort(data2);

            int data3[] = {3, 5, 6, 7, 5, 7, 10, 12, 34, 45, 12, 23};
            sortingContext.sort(data3);
        }

    }
}
