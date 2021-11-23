
package hello.world;

/**
 *
 * @author TOSHIBA
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Hello from Gustavo Simbaña ---");
        
        int addend1;
        int addend2;
        int sum;
        
        addend1 = 10;
        addend2 = 20;
        
        sum = addend1 + addend2;
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("The sum of" +  addend1 + "+" + addend2 + "is  " +sum);
        
        
        if (addend1 < 0){
            System.out.print("This is a negative addend");
        }
        
    }
    
}
