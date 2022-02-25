/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FinalExamExcercise.controller;

/**
 *
 * @author Jose Guzman
 */
public class QuickSort implements SortingStrategy{
     @Override
    public int[] sort(int[] data) {
        
       quick(data, 0, 0);
       return null;
    }
    
        
    public void quick(int[] data, int a, int b){
        data = new int[data.length];
        int buf;
        int from = a;
        int to = b;
        int pivot = data[(from+to)/2];
        do{
            while(data[from] < pivot){
                from++;
            }
            while(data[to] > pivot){
                to--;
            }
            if(from <= to){
                buf = data[from];
                data[from] = data[to];
                data[to] = buf;
                from++; to--;
            }
        }while(from <= to);
        if(a < to){
            quick(data, a, to);
        }
        if(from < b){
            quick(data, from, b);
        }
        
    } 
}
