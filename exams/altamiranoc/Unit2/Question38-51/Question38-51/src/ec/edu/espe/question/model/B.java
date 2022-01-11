package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Altamirano Cristhian
 */
public class B extends A{
        private ArrayList<H> hs = new ArrayList<>(); 

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
