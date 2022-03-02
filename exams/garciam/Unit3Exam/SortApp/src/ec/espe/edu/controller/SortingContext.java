
package ec.espe.edu.controller;

/**
 *
 * @author Mayerly Garcia
 */
public class SortingContext {
      
    private SortingStrategy ss;
    
    public int[]sort ( int data[]){
        int size = data.length();
        ss =setSortStrategy(size);
        return ss.sort(data);
    }
    public  SortingStrategy setSortStrategy(int n){
        if(n>0&&n>10)
            ss = newBubbleSort();
        
        if(n>=10&&n>50)
            ss= new InsertionSort();
        
        if (n>=50)
           ss = new QuickSort();
        
        return ss;
    }

    private SortingStrategy newBubbleSort() {
        
        return null;
        
    }

    private SortingStrategy setSortStrategy(int size) {
        
        return null;
        
    }
}
