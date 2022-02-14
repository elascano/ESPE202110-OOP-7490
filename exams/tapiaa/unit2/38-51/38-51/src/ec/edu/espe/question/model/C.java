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
public class C extends A {

    private ArrayList<E> e = new ArrayList<>();

    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }

}
