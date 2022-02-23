/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author Richar Maisincho, DEEE-ESPE
 */
public class BubbleSort {

    BubbleSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public int[] sort(int [] data){
        

        int temp;
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        int[] sortedData = data;  
        System.out.print("Ordeanndo[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "/" );
       
        }
        System.out.print("] ,  Bubble Sort" + "\n");
        return sortedData;
    }
    }

