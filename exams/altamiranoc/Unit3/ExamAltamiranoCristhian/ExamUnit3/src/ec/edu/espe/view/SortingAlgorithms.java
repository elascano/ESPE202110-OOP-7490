package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;

/**
 *
 * @author Altamirano Cristhian
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext();
        
        int data[] = {2,4,7,9};
        int sortedList[] = sortingContext.sort(data);
        
        int data2[] = {1,4,5,8,2,9};
        sortingContext.sort(data2);
        
        int data3[] = {3,5,7,4,6,9, 11, 15, 33, 47, 13 ,25};
        sortingContext.sort(data3);
    }
    
}