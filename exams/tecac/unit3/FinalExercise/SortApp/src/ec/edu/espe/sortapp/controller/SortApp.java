package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        int data[] = {12,12,111,9,6,2,2,8,6,3,5,2,35,6,3,2,2};
        System.out.println("Data --> " + Arrays.toString(data));
       
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.println("Sort Data --> " + Arrays.toString(sortedList));
    }
}
