package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Altamirano Cristhian
 */
public class B extends A{             //  0.2/0.5 You do not need the extends
        private ArrayList<H> hs = new ArrayList<>(); // OK  0.5/0.5

    public B() {
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + getHs() + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }

}
