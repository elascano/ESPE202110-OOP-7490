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
public class InsertionSort {
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
