
package ec.edu.espe.model;

/**
 *
 * @author Richar Maisincho, DEEE-ESPE
 */
public class InsertionSort {

    InsertionSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int[] sort(int[] data) {

        int aux;
        int num1;
        int num2;
        for (num1 = 1; num1 < data.length; num1++) {
            aux = data[num1];
            for (num2 = num1 - 1; num2 >= 0 && data[num2] > aux; num2--) {
                data[num2 + 1] = data[num2];
                data[num2] = aux;
            }
        }
        int[] sortedData = data;  
        
        
        System.out.print("Ordenando[");
        
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "/"  ) ;
        }
        
        
        System.out.println("] ,  Insertion Sort");
        
        return sortedData;

    }
}
