package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
* @author Altamirano Cristhian
 */
public class C extends A {  //   extends 0.5/0.5
    private ArrayList<E> es = new ArrayList<>();    // 0.2/0.2
    
    // The constructor is missing 0/0.2
    
    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "es=" + getEs() + '}';
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {      //Setters and getters 0.1/0.1
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }

}

