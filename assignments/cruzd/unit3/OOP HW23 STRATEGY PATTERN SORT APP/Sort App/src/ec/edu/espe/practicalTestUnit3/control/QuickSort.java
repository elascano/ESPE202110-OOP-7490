package ec.edu.espe.practicalTestUnit3.control;

import java.util.ArrayList;

/**
 *
 * @author darling.cruz
 */
public class QuickSort implements SortingStrategy {

    public void quickSort(ArrayList<Integer> listQuick, int first, int end) {
        if (first >= end) {
            return;
        }
        int pivot = listQuick.get(first);
        int leftElement = first + 1;
        int rightElement = end;
        while (leftElement <= rightElement) {
            while (leftElement <= end && listQuick.get(leftElement) < pivot) {
                leftElement++;
            }
            while (rightElement > first && listQuick.get(rightElement) >= pivot) {
                rightElement--;
            }
            if (leftElement < rightElement) {
                int temp = listQuick.get(leftElement);
                listQuick.set(leftElement, listQuick.get(rightElement));
                listQuick.set(rightElement, temp);
            }
        }

        if (rightElement > first) {
            int temp = listQuick.get(first);
            listQuick.set(first, listQuick.get(rightElement));
            listQuick.set(rightElement, temp);
        }
        quickSort(listQuick, first, rightElement - 1);
        quickSort(listQuick, rightElement + 1, end);
    }

    @Override
    public int[] sort(int[] data) {

        return null;

    }

}
