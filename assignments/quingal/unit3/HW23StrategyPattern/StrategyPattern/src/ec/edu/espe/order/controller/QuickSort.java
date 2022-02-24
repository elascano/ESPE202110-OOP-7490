/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.order.controller;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class QuickSort {
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
