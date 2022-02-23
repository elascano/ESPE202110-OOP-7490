
package ec.edu.espe.model;

/**
 *
 * @author Alex Andrango
 */
public class Context {
    private final SortingStrategy strategy;
    public Context(SortingStrategy strategy) {
    this.strategy = strategy;
    }
    public void arrange(int[] input){ 
    strategy.sort(input);
    }
    
}
