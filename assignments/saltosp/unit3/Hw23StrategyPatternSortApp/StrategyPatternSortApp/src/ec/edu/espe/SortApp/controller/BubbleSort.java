
package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
 */
public class BubbleSort implements SortingStrategy {

    public BubbleSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int[] sort(int[] data) {
        int temp;
        for(int i=1;i < data.length;i++){
            for (int j=0 ; j < data.length- 1; j++){
                if (data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        
        return data;
       
    }
}

    

