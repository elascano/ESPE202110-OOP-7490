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
        if(n>0 && n<=3){
            System.out.println("-> Use Bubble Sort <-");
            ss = new BubbleSort();
        }
        if(n>4 && n<=7){
            System.out.println("-> Use Insertion Sort <-");
            ss = new InsertionSort();
        }
        if(n> 7){
            System.out.println("-> Use Quick Sort <-");
            ss = new QuickSort();
        }
        return ss;
    }

    
}
