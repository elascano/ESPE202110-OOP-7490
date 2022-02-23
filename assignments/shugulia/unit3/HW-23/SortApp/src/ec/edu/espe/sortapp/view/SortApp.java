package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Shuguli Alan, DEEE-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern -> Alan Shuguli <-");
        int data[] = {9,3,6,2,7,3,6};
        System.out.println("\nData --> " + Arrays.toString(data));
       
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.println("Sort Data --> " + Arrays.toString(sortedList));
    }
}
