
package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Tapia
 */

/*
Name                    0.4/0.4
attributes              0.3/0.4
setters & getters       0.2/0.2  
*/

public class D {
    private ArrayList<F> f = new ArrayList<>();
    private ArrayList<E> e = new ArrayList<>();

    @Override
    public String toString() {
        return "D{" + "f=" + f + ", e=" + e + '}';
    }

    public D() {
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
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
