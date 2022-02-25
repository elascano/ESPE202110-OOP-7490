
package ec.edu.espe.view;

import ec.edu.espe.model.SortingContext;

/**
 *
 * @author Richar Maisincho, DEEE-ESPE
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     SortingContext sortingContext = new SortingContext();
        int data[] = {5, 8, 7, 2};
       
        sortingContext.sort(data);

        int data2[] = {2, 5, 7, 8};
        sortingContext.sort(data2);

        int data3[] = {3, 5, 6, 7, 5, 7};
        sortingContext.sort(data3);
    }

