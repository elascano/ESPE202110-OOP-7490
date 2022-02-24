
package ec.edu.espe.controller;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class sortingStrategy {
    
public int[] sort(int[] data) {
          
    int size;
    size = data.length;
    sortingStrategy strategy = setSortStrategy(size);
    return strategy.sort(data);
    }
    
public sortingStrategy setSortStrategy(int n) {
        if( n >0 && n < 6 ){
            bubbleSort strategy = new bubbleSort();
}

        if( n >= 6 && n < 10 ){
            insertionSort strategy = new insertionSort();
}

        if( n >= 11 ){
            quickSort strategy = new quickSort();
}
        sortingStrategy strategy = null;

        return strategy;
    }
    
}    

