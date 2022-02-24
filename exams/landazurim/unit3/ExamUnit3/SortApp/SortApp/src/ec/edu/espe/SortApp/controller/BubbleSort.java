
package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) { 
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }

        }
        return data;
    }
}