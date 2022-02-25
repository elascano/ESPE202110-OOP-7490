
package ec.edu.espe.controller;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class bubbleSort {

    public bubbleSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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

