package ec.edu.espe.farm.view;

/**
 *
 * @author Joel Zeas
 */
public class FarmSystem {
   public static void main(String[] args) {
   int a = 0;
   Integer i = 58;
   float b;
   Float f = 3.9F;
   double c;
   Double d = 12.4D;
   String s = "Joel_Zeas"; 
   
        System.out.println("the int of the float --> " + f.intValue());
        b = 7.9F;
        
        System.out.println("float b --> " + b);
        System.out.println("float b --> " + (int)b); //casting
        
        a=10;
        System.out.println("int a --> " + a);
        System.out.println("int a --> " + (float)a);
        System.out.println("int a -->" + a);

       System.out.println("String s + Integer i --> " + (s + i.toString()));  
       
       System.out.println("int a + Integer i --> " + (a + i.toString()));
       System.out.println("int a + Integer i --> " + (a + i.intValue()));
       

       
        //Collection numbers;
        //Colletion numbers = new Colletion(); it is no posible 
        //ArrayList<int> numbers = new ArrayList<>();
    }
 }
