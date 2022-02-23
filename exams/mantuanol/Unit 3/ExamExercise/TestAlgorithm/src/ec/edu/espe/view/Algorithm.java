package ec.edu.espe.view;

import ec.edu.espe.model.SortingContext;

/**
 *
 * @author Leonel.M
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();
        int data[] = {1, 3, 5, 9};
       
        sortingContext.sort(data);

        int data2[] = {1, 4, 6, 8, 2, 9};
        sortingContext.sort(data2);

        int data3[] = {1, 5, 6, 8, 2, 9, 10, 13, 29, 35, 19, 32};
        sortingContext.sort(data3);
    }

}
   
