
package ec.edu.espe.quetion38.model;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRO DELACRUZ Gómez
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

