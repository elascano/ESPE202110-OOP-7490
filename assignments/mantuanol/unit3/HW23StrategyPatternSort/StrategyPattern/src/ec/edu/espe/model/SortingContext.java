package ec.edu.espe.model;

import ec.edu.espe.controller.Bubblesort;
import ec.edu.espe.controller.Insertionsort;
import ec.edu.espe.controller.Quicksort;
import ec.edu.espe.controller.SortinS;

/**
 *
 * @author Leonel.M
 */
public class SortingContext {
    
    private SortinS strategy;
    
    public int[] sort( int data[] ) {
        int size;
        size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }
    
    public SortinS setSortStrategy(int n) {
        if( n >0 && n < 9 ){
        strategy = new Bubblesort();}

        if( n >= 9 && n < 20 ){
        strategy = new Insertionsort();}

        if( n >= 20 ){
        strategy = new Quicksort();}

        return strategy;
    }
}
    
    

