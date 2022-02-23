/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import ec.edu.espe.controller.bubbleSort;
import ec.edu.espe.controller.insertionSort;
import ec.edu.espe.controller.quickSort;
import ec.edu.espe.controller.sortingStrategy;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class sortingContex {
    private sortingStrategy strategy;
    
    public int[] sort( int data[] ) {
        int size;
        size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }
    
    public sortingStrategy setSortStrategy(int n) {
        if( n >0 && n < 6 ){
        strategy = new bubbleSort();}

        if( n >= 6 && n < 10 ){
        strategy = new insertionSort();}

        if( n >= 11 ){
        strategy = new quickSort();}

        return strategy;
    }

       
}


