package ec.edu.espe.farm.view;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Paul Saltos
 */
public class FarmSystem {

    public static void main(String[] args) {
       
        int a;            //primitive data type
        Integer i = 58;   //referenced data types
        float b;
        Float f = 3.4F;
        double c;
        Double d = 12.4D;
        String s = "Paul Saltos";

        System.out.println("the int of the float -->" + f.intValue());
        b= 7.9F;
        System.out.println("float b -->"+b);
        System.out.println("float b -->" + (int)b);//casting
        
        a=10;
        System.out.println("int a -->" + a);
        System.out.println("int a -->" + (float)a);
        System.out.println("int a -->" +a);
        
        System.out.println("Integer i-->"+ i.toString());
        System.out.println("String s + Integer i -->"+(s+i.toString()));
        System.out.println("int a + Integer i -->"+(a+ i.toString()));
        System.out.println("int a + Integer i -->"+ (a+ i.intValue()));
        
        //Collection numbers;
        //Collection numbers = new Collection();
        //ArrayList<int>numbers= new ArrayList<>();
        
        
        

    }
    //int , float,boolean , double ,char,byte;...
}
