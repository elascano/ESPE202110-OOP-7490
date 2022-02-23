
package ec.edu.espe.caffe.view;

import ec.edu.espe.caffe.model.Coffee;
import ec.edu.espe.caffe.model.Tea;
import ec.edu.espe.caffe.model.CaffeineBeverage;

/**
 *
 * @author Sebastian Caisatoa
 */
public class BerageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\n Making tea ...");
        tea.prepareRecipe();
        
        System.out.println("\n Making coffee...");
        coffee.prepareRecipe();
    }
}
