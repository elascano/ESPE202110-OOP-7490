
package ec.edu.espe.exam.model;

import ec.edu.espe.exam.controller.BubbleSort;
import ec.edu.espe.exam.controller.InsetionSort;
import ec.edu.espe.exam.controller.QuickSort;
import ec.edu.espe.exam.controller.SortingStrategy;

/**
 *
 * @author Simbaña J
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
        if( n >0 && n < 7 ){
        strategy = new BubbleSort();}

        if( n >= 7 && n < 10 ){
        strategy = new InsetionSort();}

        if( n >= 11 ){
        strategy = new QuickSort();}

        return strategy;
}
    }
