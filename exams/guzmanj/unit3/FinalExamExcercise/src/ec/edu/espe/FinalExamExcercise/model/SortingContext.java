/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FinalExamExcercise.model;

import ec.edu.espe.FinalExamExcercise.controller.BubbleSort;
import ec.edu.espe.FinalExamExcercise.controller.InsertionSort;
import ec.edu.espe.FinalExamExcercise.controller.QuickSort;
import ec.edu.espe.FinalExamExcercise.controller.SortingStrategy;

/**
 *
 * @author Jose Guzman
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
