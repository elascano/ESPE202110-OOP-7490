package es.edu.espe.farm.view;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author dylanasumaza
 */
public class farmSystem {

    public static void main(String[] args) {
        int a;
        Integer i = 58;
        float b;
        Float f = 3.9F;
        double c;
        Double d = 12.4D;
        String s = "Dylan";
        System.out.println("The int of the float --->" + f.intValue());
        b = 7.9F;

        System.out.println("float b -->" + b);
        System.out.println("float b -->" + (int) b);//casting

        a = 10;
        System.out.println("float a -->" + a);
        System.out.println("float a -->" + (float) a);
        System.out.println("float a -->" + a);

        System.out.println("String s +Integer i -->" + (s + i.toString()));

        System.out.println("int a + Integer i -->" + (a + i.toString()));
        System.out.println("int a + Integer i -->" + (a + i.intValue()));
        //Collection numbers;
        //Collection numbers=new Collection;it is nor posibole
        //ArrayList<int> numbers = new ArrayList<>();
    }

    //int, float , boolean, double,char, byte .....
}
