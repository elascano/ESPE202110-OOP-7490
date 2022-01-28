
package ec.edu.espe.quetion38.model;

import java.util.ArrayList;

/**
 *
 * @author melig
 */
public class C extends A {          //0.5

    private ArrayList<E> es = new ArrayList<>();       //0.0

    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }

                                                     //0.0
    
    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**                                              
     * @param es the es to set
     */ 
    public void setEs(ArrayList<E> es) {                  //0.1
        this.es = es;
    }

   

}
