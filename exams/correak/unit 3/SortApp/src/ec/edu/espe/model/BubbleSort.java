/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author KERLY CORREA
 */
public class BubbleSort {
    
     public void Bubble(int[] data) {
         int aux;
        for (int i = 1; i < data.length; i++) {
            
                if (data[i] > data[i - 1]) {
                    aux = data[i];
                    data[i] = data[i + 1];
                    data[i-1] = aux;
                }
            
        }
    }

    
}
