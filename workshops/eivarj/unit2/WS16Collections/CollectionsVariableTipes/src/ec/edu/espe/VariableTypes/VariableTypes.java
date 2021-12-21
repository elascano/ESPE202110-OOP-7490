
package ec.edu.espe.VariableTypes;

/**
 *
 * @author LENOVO
 */
public class VariableTypes {
     public static void main(String[] args) {
       
        
        int a;
        Integer i =58;
        float b;
        Float f =3.4F;
        double c;
        Double d = 12.4D;
        String s = "Jaime";
        
        System.out.println("the int of the float --<"+ f.intValue());
        b = 7.9F;
        System.out.println("float b -->"+ b);
        System.out.println("float b -->"+ (int)b);
        
        a=10;
        System.out.println("int a -->"+ a );
        System.out.println("int a -->"+ (float)a);
        System.out.println("int a -->"+ a);
        
        System.out.println("String s + Integer i-->" + (s + i.toString()));
        
        System.out.println("String a + Integer i-->" + (a + i.toString()));
        System.out.println("String a + Integer i-->" + (a + i.intValue()));
        
        
                
                
        
        
        //Collection numbers;
        //ArrayList<int> numbers = new ArrayList<>();//
    }
    
}
