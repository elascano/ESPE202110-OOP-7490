
package ec.edu.espe.quetion38.model;

import java.util.ArrayList;

/**
 *
 * @author melig
 */
public class D extends A {
    private ArrayList<F> fs = new ArrayList<>();
     private E[] es = new E[5];

    public D() {
    }

    @Override
    public String toString() {
        return "D{" + "fs=" + fs + ", es=" + es + '}';
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
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }  
}
