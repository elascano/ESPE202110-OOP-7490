
package ec.edu.espe.uml.view;

import ec.edu.espe.uml.model.A;
import ec.edu.espe.uml.model.B;
import ec.edu.espe.uml.model.C;
import ec.edu.espe.uml.model.D;
import ec.edu.espe.uml.model.E;

/**
 *
 * @author Christian Bravo
 */
public class UmlExercise {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int p = 10;
        String q = "Hello Christian";
        C cs[] = new C[15];
        
        a = new A(p, q);
        b = new B(cs);
        
        System.out.println("a -->" + a);
        a.m(b);
        
    }
    
}
