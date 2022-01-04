
package ec.edu.espe.excerciseuml.view;

import ec.edu.espe.excerciseuml.model.A;
import ec.edu.espe.excerciseuml.model.B;
import ec.edu.espe.excerciseuml.model.C;
import ec.edu.espe.excerciseuml.model.D;
import ec.edu.espe.excerciseuml.model.E;

/**
 *
 * @author José
 */
public class umlexcercise {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int p = 10;
        String q = "Hello Jose"; 
        C cs[] = new C[15];
        
        a = new A(p, q);
        b = new B(cs);
        
        System.out.println("a -->" + a );
        a.m(b);
    }
}
