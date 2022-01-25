package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author aandrade
 */
public class D extends A {  
    private ArrayList<F> fs = new ArrayList<>();
    private ArrayList<E> es = new ArrayList<>(); 

    public D() {
    }

    @Override
    public String toString() {
        return "D{" + "fs=" + getFs() + ", es=" + getEs() + '}';
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
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
