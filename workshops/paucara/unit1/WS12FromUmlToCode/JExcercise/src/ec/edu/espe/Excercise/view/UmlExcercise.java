
package ec.edu.espe.Excercise.view;

import ec.edu.espe.Excercise.model.A;
import ec.edu.espe.Excercise.model.B;
import ec.edu.espe.Excercise.model.C;
import ec.edu.espe.Excercise.model.D;
import ec.edu.espe.Excercise.model.E;

/**
 *
 * @author Javier Paucar
 */
public class UmlExcercise {
      public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;

        int p = 10;
        String q = " Hello From Javier Paucar";
        C cs[]= new C[15];
        D[] ds = new D[10];
        
        a = new A(p, q);
        b = new B(cs);
        c = new C(ds);
        d = new D();
        e = new E();
        
        System.out.println("a ->" + a);
        a.m(b);
        
        System.out.println("c ->" + c);
        
        System.out.println("d ->" + d);
        
        System.out.println("e ->"+ e);
        
    }
}


