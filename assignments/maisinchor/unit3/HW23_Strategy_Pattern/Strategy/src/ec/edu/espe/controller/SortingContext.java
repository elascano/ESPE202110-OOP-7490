
package ec.edu.espe.controller;

/**
 *
 * @author Richar Maisincho ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;
    
  public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 5) {
            sortingStrategy = new BubbleSort();
        }

        if (n >= 5 && n <= 10) {
            sortingStrategy = new InsertionSort();
        }

        if (n > 10) {
            sortingStrategy = new QuickSort();
        }

        return sortingStrategy;

    }

   
}
