
package ec.edu.esoe.Exam3p.model;

import ec.edu.esoe.Exam3p.controller.BubbleSort;
import ec.edu.esoe.Exam3p.controller.InsertionSort;
import ec.edu.esoe.Exam3p.controller.QuickSort;
import ec.edu.esoe.Exam3p.controller.SortingStrategy;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
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
        if( n >0 && n <= 3 ){
        strategy = new BubbleSort();}

        if( n >= 4 && n < 7 ){
        strategy = new InsertionSort();}

        if( n > 7 ){
        strategy = new QuickSort();}

        return strategy;
    }
}
