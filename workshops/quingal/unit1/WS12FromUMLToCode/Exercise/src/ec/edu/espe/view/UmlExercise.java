/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;

/**
 *
 * @author Usuario
 */
public class UmlExercise {
    public static void main(String[] args) {

        A a;
        B b;
        C c;
        D d;
        E e;
        int p = 10;
        String q = "Hello Leandro";
        C cs[] = new C[15];
        D[] ds = new D[10];

        a = new A(p, q);
        b = new B(cs);
        c = new C(ds);
        d = new D();
        e = new E();

        System.out.println("a-->" + a);
        a.m(b);

        System.out.println("b-->" + b);
        System.out.println("c-->" + c);
        System.out.println("d-->" + d);
        System.out.println("e-->" + e);
    }

}
