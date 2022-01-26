package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Tapia
 */

/* A -> Name            0.5/0.5
	atributtes      0.2/0.2
	Constructor     0.2 /0.2
	setters/getters 0.1/ 0.1
        Total           10/10
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
