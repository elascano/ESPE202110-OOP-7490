package ec.edu.espe.sortapp.model;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data []){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<5){
            System.out.println("-> Use Bubble Sort <-");
            ss = new BubbleSort();
        }
        if(n>5 && n<10){
            System.out.println("-> Use Insertion Sort <-");
            ss = new InsertionSort();
        }
        if(n>= 10){
            System.out.println("-> Use Quick Sort <-");
            ss = new QuickSort();
        }
        return ss;
    }

    
}
