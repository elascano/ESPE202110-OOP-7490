
package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Tapia
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
