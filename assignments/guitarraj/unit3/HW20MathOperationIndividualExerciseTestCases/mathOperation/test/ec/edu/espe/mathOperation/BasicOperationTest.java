
package ec.edu.espe.mathOperation;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Guitarra Jhon: ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double addend1 = 22;
        double addend2 = 17.9876;
        BasicOperation instance = new BasicOperation();
        double expResult = 1.9984288;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
        
    public void testAddSecondtry() {
        System.out.println("add");
        double addend1 = 0;
        double addend2 = 74;
        BasicOperation instance = new BasicOperation();
        double expResult = -0.6098509;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
        
        
    public void testAddThirdtry() {
        System.out.println("add");
        double addend1 = 59;
        double addend2 = 8;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.4388505;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
            
            
    public void testAddFourthTry() {
        System.out.println("add");
        double addend1 = 48.456;
        double addend2 = -99.123456;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.2476737;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddFifthTry() {
        System.out.println("add");
        double addend1 = 23;
        double addend2 = 40;
        BasicOperation instance = new BasicOperation();
        double expResult = 1.7879393;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddSixthTry() {
        System.out.println("add");
        double addend1 = 33;
        double addend2 = -22.753;
        BasicOperation instance = new BasicOperation();
        double expResult = -0.9074390;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddSeventhTry() {
        System.out.println("add");
        double addend1 = 5;
        double addend2 = -34;
        BasicOperation instance = new BasicOperation();
        double expResult = -1.9760818;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddEighthTry() {
        System.out.println("add");
        double addend1 = 46.159;
        double addend2 = 37;
        BasicOperation instance = new BasicOperation();
        double expResult = -1.9760446;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddNinethTry() {
        System.out.println("add");
        double addend1 = 6;
        double addend2 = 84.357951;
        BasicOperation instance = new BasicOperation();
        double expResult = -0.2468986;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    public void testAddTenthTry() {
        System.out.println("add");
        double addend1 = 60.123789;
        double addend2 = -100;
        BasicOperation instance = new BasicOperation();
        double expResult = 0.2617108;
        double result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
}
