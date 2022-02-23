/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Examen.model;

import ec.edu.espe.Examen.controller.BublbleSort;
import ec.edu.espe.Examen.controller.InsertionSort;
import ec.edu.espe.Examen.controller.QuickSort;
import ec.edu.espe.Examen.controller.SortingStrategy;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
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
        strategy = new BublbleSort();}

        if( n >= 6 && n < 10 ){
        strategy = new InsertionSort();}

        if( n >= 11 ){
        strategy = new QuickSort();}

        return strategy;
    }

    
}
