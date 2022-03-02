
package ec.edu.espe.sortApp.controller;

/**
 *
 * @author Arroba Cristian
 */

public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        
       quick(data, 0, 0);
       return null;
    }
    
        
    public void quick(int[] data, int c, int d){
        data = new int[data.length];
        int buf;
        int from = c;
        int to = d;
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
        if(c < to){
            quick(data, c, to);
        }
        if(from < d){
            quick(data, from, d);
        }
        
    } 

}