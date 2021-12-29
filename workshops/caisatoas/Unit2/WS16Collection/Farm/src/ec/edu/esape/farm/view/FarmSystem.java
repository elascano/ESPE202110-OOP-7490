
package ec.edu.esape.farm.view;

//import java.util.ArrayList;
//import java.util.Collection;

/**
 *
 * @author Caisatoa
 */
public class FarmSystem {
    public static void main(String[] args) {
        int a;
        Integer i = 58;
        float b;
        Float f = 3.9f;
        double c;
        Double d = 12.4D;
        String s = "Edison";
        
        System.out.println("the int of the float --> " + f.intValue());
        b= 7.9f;
        
        System.out.println("float b --> " + b);
        System.out.println("float b --> " +(int)b);
        
        a=10;
        System.out.println("int a--> " +a);
        System.out.println("int a--> " +(float)a);
        System.out.println("int a--> " +a);
        
        System.out.println("String s + Integer i" +(s + i.toString()));
        
        System.out.println("int a + Integer i" +(a + i.toString()));
        System.out.println("int a + Integer i" +(a + i.intValue()));
        //Collection numbers;
        //ArrayList<int> numbers = new ArrayList<>();   
    }
}
