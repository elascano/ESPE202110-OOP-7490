package ec.edu.espe.model;

import ec.edu.espe.controller.BubbleSort;
import ec.edu.espe.controller.InsertionSort;
import ec.edu.espe.controller.QuickSort;
import ec.edu.espe.controller.SortingStrategy;

/**
 *
 * @author Sebastian Palacios, DEEE-ESPE
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
        strategy = (SortingStrategy) new InsertionSort();}

        if( n >= 11 ){
        strategy = new QuickSort();}

        return strategy;
    }

    public void sort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
