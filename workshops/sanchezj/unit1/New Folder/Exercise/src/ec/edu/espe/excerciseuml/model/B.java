/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.excerciseuml.model;

/**
 *
 * @author José
 */
public class B {
   private C cs [];

    public B(C[] cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "B{" + "cs=" + cs + '}';
    }

   
    
   
    /**
     * @return the cs
     */
    public C[] getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(C[] cs) {
        this.cs = cs;
    }
   
   
   
}
