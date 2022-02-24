
package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Caisatoa Sebastian
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int j = 1; j < n; j++) {
            int key = data[j];
            int i = j - 1;
            while ((i > -1) && (data[i] > key)) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }

}
