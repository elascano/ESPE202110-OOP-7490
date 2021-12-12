
package ec.edu.espe.ws12.view;

import ec.edu.espe.ws12.model.A;
import ec.edu.espe.ws12.model.B;
import ec.edu.espe.ws12.model.C;
import ec.edu.espe.ws12.model.D;
import ec.edu.espe.ws12.model.E;

/**
 *
 * @author LENOVO
 */
public class WsUmlExercise {
    
     public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int p=10;
        String q ="Hello Jaime";
        C cs[]=new C[15];
        
        a= new A(p,q);
        b= new B(cs);
        c= new C ();
        d= new D();
        e= new E();
        
        System.out.println("a->"+ a);
        a.m (b);
        
         System.out.println("c->"+c);
         System.out.println("d->"+d);
         System.out.println("e->"+e);
    }
}

   
