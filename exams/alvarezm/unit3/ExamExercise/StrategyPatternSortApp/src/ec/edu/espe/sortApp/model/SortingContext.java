
package ec.edu.espe.sortApp.model;

import ec.edu.espe.sortApp.controller.BubbleSort;
import ec.edu.espe.sortApp.controller.InsertionSort;
import ec.edu.espe.sortApp.controller.QuickSort;
import ec.edu.espe.sortApp.controller.SortingStrategy;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class SortingContext {
    
    private SortingStrategy strategy;
    
    public int[] sort( int data[] ) {
        int size;
        size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n) {
        if( n >=0 && n < 4 ){
        strategy = new BubbleSort();}

        if( n >= 4 && n < 8 ){
        strategy = new InsertionSort();}

        if( n >= 8 ){
        strategy = new QuickSort();}

        return strategy;
    }

       
}
