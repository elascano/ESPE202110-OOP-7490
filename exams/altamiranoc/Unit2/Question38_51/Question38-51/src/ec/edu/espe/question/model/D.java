package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Altamirano Cristhian
 */
public class D extends A {                          // 0.4/0.4
    private ArrayList<F> fs = new ArrayList<>();
    private ArrayList<E> es = new ArrayList<>(); 

    public D() {                     //This constructor must have the ArrayList from F and A    0.1/0.4
    }

    @Override
    public String toString() {
        return "D{" + "fs=" + getFs() + ", es=" + getEs() + '}';
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {     //0.2/0.2 Setter and getters
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }

}
