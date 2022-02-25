
package ec.edu.espe.controller;

import utils.SortingStrategy;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data,int der) {
        //TODO program the sort algorithm
        //sort the data and return
        int aux;
        int cont1;
        int cont2;
        for (cont1 = 1; cont1 < data.length; cont1++) {
            aux = data[cont1];
            for (cont2 = cont1 - 1; cont2 >= 0 && data[cont2] > aux; cont2--) {
                data[cont2 + 1] = data[cont2];
                data[cont2] = aux;
            }
        }
        int[] sortedData = data;  //this is only here to complete
        System.out.print("Sorted using Insertion sort[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "-");
        }


        System.out.println("] ");
        //System.out.println("ordering " + data + "], using Insertion sort");
        return sortedData;
    }

}
