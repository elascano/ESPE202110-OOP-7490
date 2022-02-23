
package ec.edu.espe.sortApp.controller;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class SortingStrategy {

public int[] sort(int[] data) {
          
    int size;
    size = data.length;
    SortingStrategy strategy = setSortStrategy(size);
    return strategy.sort(data);
    }
    
public SortingStrategy setSortStrategy(int n) {
        if( n >0 && n < 6 ){
            BubbleSort strategy = new BubbleSort();
}

        if( n >= 6 && n < 10 ){
            InsertionSort strategy = new InsertionSort();
}

        if( n >= 11 ){
            QuickSort strategy = new QuickSort();
}
        SortingStrategy strategy = null;

        return strategy;
    }
    
}
