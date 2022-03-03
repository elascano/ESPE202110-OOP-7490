
package ec.edu.espe.view;

import ec.edu.espe.model.BubbleSort;
import ec.edu.espe.model.Context;
import ec.edu.espe.model.QuickSort;

/**
 *
 * @author Alex Andrango
 */
public class Test {
    public static void main(String args[]) throws InterruptedException {
         int[] var = {1, 2, 3, 4, 5 };
         Context ctx;
        ctx = new Context(new BubbleSort()); 
    ctx.arrange(var);
// we can change the strategy without changing Context class 
    ctx = new Context(new QuickSort()); 
    ctx.arrange(var);
}

    
}
