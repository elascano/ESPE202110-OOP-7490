/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;

/**
 *
 * @author ASUS
 */
public class UmlExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        A a;
        B b;
        C c;
        D d;
        E e;
        int p=10;
        String q="Hello Anderson";
        C cs[]=new C[15];
        D[] ds = new D[10];
                
        a = new A(p, q);
        c = new C(ds);
        d = new D();
        e = new E();
        b = new B(cs);
        
        System.out.println("a--> " + a);
        
        a.m(b);
        
        System.out.println("c-> " + c );
        
        System.out.println("d-> " + d );
        
        System.out.println("e-> " + e);
    }
    
}
