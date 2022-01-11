package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;

/**
 *
 * @author alex_
 */
public class UmlExercise {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int p=10;
        String q="Hello Alex";
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
