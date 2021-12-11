package hellooop;

/**
 *
 * @author Sebas
 */
public class HelloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World From Sebastian Tayo");
        int addend1;
        int addend2;
        int sum;

        addend1 = 10;
        addend2 = 20;

        sum = addend1 + addend2;
        
        System.out.println("**********************+");
        System.out.println(" The sum of " + addend1 + " + " + addend2 + " is -> " + sum);
             if (addend1 < 0){
                 System.out.println("This is a negative addend");
             }
    }

}
