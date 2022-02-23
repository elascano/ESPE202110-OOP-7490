package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        System.out.println("WS23 Strategy Pattern -> Camila Teca <-");
        int data[] = {12,12,111,19,8,0,2,9,3,6,2,7,3,6};
        System.out.println("\nData --> " + Arrays.toString(data));
       
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.println("Sort Data --> " + Arrays.toString(sortedList));
    }
}
