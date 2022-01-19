
package ec.edu.espe.quetion38.model;

import java.util.ArrayList;

/**
 *
 * @author Guitarra Jhon
 */
public class C extends A {

    private ArrayList<E> es = new ArrayList<>();

    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
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
