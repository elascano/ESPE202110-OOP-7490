package ec.edu.espe.uml.view;

import ec.edu.espe.uml.mode.A;
import ec.edu.espe.uml.mode.B;
import ec.edu.espe.uml.mode.C;
import ec.edu.espe.uml.mode.D;
import ec.edu.espe.uml.mode.E;

/**
 *
 * @author USUARIO
 */
public class UmlExercise {
    public static void main(String[] args) {
       A a;
       B b;
       C c;
       D d;
       E e;
       int p=10;
       String q ="Hello Kerly";
       C cs[]= new C[10];
       D[] ds = new D[10];
       
       a = new A(p, q);
       b = new B(cs);
       c = new C(ds); 
       d = new D(); 
       e = new E(); 
       
        System.out.println("a-->"+a);
        System.out.println("c-->"+c);
        System.out.println("d-->" + d);
        System.out.println("e-->" + e);
        a.m(b);  
    }
    
}
