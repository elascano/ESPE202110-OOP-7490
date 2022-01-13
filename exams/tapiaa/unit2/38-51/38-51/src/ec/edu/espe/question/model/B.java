
package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Tapia
 */
public class B {
    private ArrayList<H> h = new ArrayList<>();

    public B() {
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }

    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }
    
}
