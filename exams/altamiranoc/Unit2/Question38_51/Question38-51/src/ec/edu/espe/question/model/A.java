package ec.edu.espe.question.model;

import java.util.ArrayList;

/**
 *
 * @author Altamirano Cristhian         All the clases from A to J are complete
 */
       
//name                   0.5 /0.5
//attributes              0.2 /0.2
//constructor            0.2 /0.2
//setters & getters     0.1/0.1
//You need the "To String"


public abstract class A {    // Clase name
    private ArrayList<A> as = new ArrayList<>(); 
    private A a1;
    private A a2;

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }

    /**
     * @return the a1
     */
    public A getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(A a1) {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public A getA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(A a2) {
        this.a2 = a2;
    }
    
}
