/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Leandro Quinga 
 */
public class A {

    private int p;
    private String q;

    public void m(B b) {
        System.out.println("b-->" + b + "inside class A");
    }

    @Override
    public String toString() {
        return "A{" + "p=" + p + ", q=" + q + '}';
    }

    public A(int p, String q) {
        this.p = p;
        this.q = q;
    }

    /**
     * @return the p
     */
    public int getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(int p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public String getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(String q) {
        this.q = q;
    }
    
    
}
