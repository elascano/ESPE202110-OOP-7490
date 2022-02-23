
package ec.edu.espe.ordenation.controller;

import ec.edu.espe.ordenation.controller.SortingStrategy;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class BubbleSort implements SortingStrategy{
    
    @Override
    public int[] sort(int[] data) {
        int temp;
        for(int i=1;i < data.length;i++){
            for (int j=0 ; j < data.length- 1; j++){
                if (data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        
        return data;
       
    }
}
