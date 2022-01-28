
package ec.edu.espe.quetion38.model;

import java.util.ArrayList;

/**
 *
 * @author Melissa Gómez
 */
public abstract class A {                      //0.5

    private ArrayList<A> as = new ArrayList<>();//0.2

    @Override
    public String toString() {                 //0.2
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
                                    //0.1
    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }

}

