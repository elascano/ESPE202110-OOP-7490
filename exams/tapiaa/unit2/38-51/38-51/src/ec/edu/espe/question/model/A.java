
package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Tapia
 */
public abstract class A {
   
    private ArrayList<A> as = new ArrayList<>();

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    public A() {
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
}
