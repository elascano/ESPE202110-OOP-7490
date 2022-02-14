package hellooop;

/**
 *
 * @author usuario
 */
public class HelloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello from Leonel Mantuano");
        int addend1;
        int addend2;
        int sum;

        addend1 = 10;
        addend2 = 20;

        sum = addend1 + addend2;

        System.out.println("*********");
        System.out.println("The sum of " + addend1 + " + " + addend2 + " is-> " + sum);
        if (addend1<0){
            System.out.println("This is a negative addend");}
    }
    
}
