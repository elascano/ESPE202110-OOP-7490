
package ec.edu.espe.sortaap.model;

import ec.edu.espe.sortaap.controller.BubbleSort;
import ec.edu.espe.sortaap.controller.InsertionSort;
import ec.edu.espe.sortaap.controller.QuickSort;
import ec.edu.espe.sortaap.controller.SortingStrategy;

/**
 *
 * @author Sebastian Caisatoa
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
        if( n >0 && n < 6 ){
        strategy = new BubbleSort();}

        if( n >= 6 && n < 10 ){
        strategy = new InsertionSort();}

        if( n >= 11 ){
        strategy = new QuickSort();}

        return strategy;
    }
}
