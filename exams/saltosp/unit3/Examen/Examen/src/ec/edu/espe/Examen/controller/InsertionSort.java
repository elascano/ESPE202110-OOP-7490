/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Examen.controller;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
 */
public class InsertionSort implements SortingStrategy {
    
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
