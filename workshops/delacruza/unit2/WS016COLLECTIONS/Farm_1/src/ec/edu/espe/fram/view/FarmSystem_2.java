package ec.edu.espe.fram.view;
import java.util.ArrayList;
import java.util.Collection;

//@author // Alejandro De La Cruz//

public class FarmSystem_2 {
    public static void main (String[] args) {
    int a;
    Integer i = 58;
    float b;
    Float f = 3.9F;
    double c;
    Double d = 12.4D;
    String s= "Alejandro DLC ";
    
    System.out.println("the int of the float -->" + f.intValue());
    b = 7.9F;
    
    System.out.println("float b ->" + b);
    System.out.println("float b ->" + (int)b); //casting
    
    a=10;
        System.out.println("int a ->" + a);
        System.out.println("int a ->" + (float)a);
        System.out.println("int a ->" + a);
        
        System.out.println("String + Integer i ->" + (s + i.toString()));
        System.out.println("int a + Integer i ->" + (a + i.toString()));
        System.out.println("int a + Integer i ->" + (a + i.intValue()));



        //Collection numers;
        //Collection numbers = new collecion(); it is
        //ArrayList<int> numbers = new ArrayList<>();
    }

}
