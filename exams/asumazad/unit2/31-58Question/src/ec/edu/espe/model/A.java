package ec.edu.espe.model;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylanasumaza
 */
public class A {
    private ArrayList<A> as;
    public A(ArrayList<A> as){
    this.as = as;
    }
  @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
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


}
