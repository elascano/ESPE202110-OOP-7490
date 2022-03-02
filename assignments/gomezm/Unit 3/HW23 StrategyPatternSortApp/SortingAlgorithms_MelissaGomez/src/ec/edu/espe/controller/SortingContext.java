
package ec.edu.espe.controller;

/**
 *
 * @author Melissa Gómez
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[]sort(int data[]){
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
      if (n>0 && n<3){
          sortingStrategy = new BubbleSort();
      }  
      if (n >=4 && n<7){
          sortingStrategy = new InsertionSort();  
        }
      if (n>=7){
          sortingStrategy = new QuickSort();  
         }
      return sortingStrategy;
      
    }
}
