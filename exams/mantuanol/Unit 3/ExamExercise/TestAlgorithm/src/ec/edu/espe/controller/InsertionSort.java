package ec.edu.espe.controller;

/**
 *
 * @author Leonel.M
 */
public class InsertionSort implements Strategy {

    @Override
    public int[] sort(int[] data) {
 int aux;
        int cont1;
        int cont2;
        for (cont1 = 1; cont1 < data.length; cont1++) {
            aux = data[cont1];
            for (cont2 = cont1 - 1; cont2 >= 0 && data[cont2] > aux; cont2--) {
                data[cont2 + 1] = data[cont2];
                data[cont2] = aux;
            }
        }
        int[] sortedData = data;  
        System.out.print("Ordening[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "/"  ) ;
        }
        System.out.println("] , by Insertion Sort");
        
        return sortedData;

    }


}
   
