/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q38.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Guzman
 */
public class A {
   private int a;
   private int b;
   private int d;
   private ArrayList<C> cs;
   private B bs[]=new B[1];

    public A(int a, int b, int d, ArrayList<C> cs) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.cs = cs;
    }
   
   
   
    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", d=" + d + ", cs=" + cs + ", bs=" + bs + '}';
    }
   
   
   
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the d
     */
    public int getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }
   
}
