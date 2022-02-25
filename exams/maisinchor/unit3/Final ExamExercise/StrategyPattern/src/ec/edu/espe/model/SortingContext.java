
package ec.edu.espe.model;

/**
 *
 * @author Richar Maisincho, DEEE-ESPE
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

        if (n >= 2 && n <= 8) {
            sortingStrategy = new InsertionSort();
        }

        if (n > 8) {
            sortingStrategy = new QuickSort();
        }

        return sortingStrategy;

    }

    
    
}
