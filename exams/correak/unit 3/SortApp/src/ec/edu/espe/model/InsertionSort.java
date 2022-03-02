/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author KERLY CORREA
 */
public class InsertionSort implements SortingStrategy {
    
    public static void Insertion(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            Integer aux = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > aux) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
    }

    @Override
    public int[] sort(int[] data) {
        for (int i=1; i < data.length; i++) {
         int aux = data[i];
         int j;
         for (j=i-1; j >=0 && data[j] > aux; j--){
              data[j+1] = data[j];
          }
         data[j+1] = aux;
      }
        return data;
    }
    
    
}
