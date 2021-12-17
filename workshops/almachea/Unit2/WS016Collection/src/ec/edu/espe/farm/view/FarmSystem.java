package ec.edu.espe.farm.view;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ASUS
 */
public class FarmSystem {
    public static void main(String[] args) {
        int a;
        Integer i= 58;
        float b;
        Float f = 3.4F;
        double c;
        Double d = 12.4D;
        String s = "Anderson";
        
        System.out.println("the int of the float -->" + f.intValue());
        b= 7.9F;
        
        System.out.println("float b -> " + b);
        System.out.println("float b -> " + (int)b);//casting
        
        a=10;
        System.out.println("int a -> " + a);
        System.out.println("int a -> " + (float)a);
        System.out.println("int a -> " + a);
        
        System.out.println("String s + Integer i ->" + (s + i.toString()));
        System.out.println("int a + Integer i -> " + (s +i.toString()));
        System.out.println("int a + Integer i -> " + (a + i.toString()));
        //Collection numbers;
        //Collection numbers
        //Collection numbers = bew Collection();
        //ArrayList <int> numbers = new ArrayList<>();
        
    }
    // inr, float, boolean, double
}
