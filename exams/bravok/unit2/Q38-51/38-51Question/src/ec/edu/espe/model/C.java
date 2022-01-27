
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Katherin Bravo
 */
public class C extends A{
private ArrayList<E> es;
public C(ArrayList<E> es,ArrayList<a> as){
super(as);
this.es = es;
}

    @Override
    public String toString() {
        return "C{" + "es=" + getEs() + '}';
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
