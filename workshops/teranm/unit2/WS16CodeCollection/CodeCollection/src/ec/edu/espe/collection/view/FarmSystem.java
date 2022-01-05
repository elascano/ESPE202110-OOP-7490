package ec.edu.espe.collection.view;

import java.util.Collection;

/**
 *
 * @author Melanie
 */
public class FarmSystem {

    public static void main(String[] args) {

        System.out.println("WS16 CodeCollections -->Melanie Terán<--");

        int a;
        Integer i = 58;
        float b;
        Float f = 3.9F;
        double c;
        Double d = 12.4D;
        String s = "Melanie";

        System.out.println("the int of the float --> " + f.intValue());
        b = 7.9F;

        System.out.println("float b --> " + b);
        System.out.println("float b --> " + (int) b);

        a = 10;
        System.out.println("int a --> " + a);
        System.out.println("int a --> " + (float) a);
        System.out.println("int a --> " + a);

        System.out.println("String s + Integer i -->" + (s + i.toString()));

        System.out.println("int a + Integer i --> " + (a + i.toString()));
        System.out.println("int a + Integer i --> " + (a + i.intValue()));
    }
}
