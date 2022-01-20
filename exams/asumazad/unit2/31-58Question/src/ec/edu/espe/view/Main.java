/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.C;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.J;

/**
 *
 * @author dylanasumaza
 */
public class Main {

    public static void main(String[] args) {
        A a;
        J j;
        C c;
        E e;
        F f;
        C c;
        ArrayList<A> as;
        ArrayList<E> es;

        j = new J();
        e = new E();
        f = new F();
        as = new Arrylist<>();
        es = new Arrylist<>();
        a = new A(as);
        as.add(a);
        as.add(a);
        System.out.println("j-->" + j);
        System.out.println("e-->" + e);
        System.out.println("f-->" + f);
        System.out.println("a-->" + a);
        System.out.println("as-->" + as);
        System.out.println("es-->" + es);
    }
}
