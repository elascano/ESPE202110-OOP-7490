package ec.edu.espe.Ordenation.model;

import ec.edu.espe.Ordenation.controller.InsertionSort;
import ec.edu.espe.Ordenation.controller.QuickSort;
import ec.edu.espe.ordenation.controller.BubbleSort;
import ec.edu.espe.ordenation.controller.SortingStrategy;

/**
 *
 * @author Salma Villegas DEEE-ESPE
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

