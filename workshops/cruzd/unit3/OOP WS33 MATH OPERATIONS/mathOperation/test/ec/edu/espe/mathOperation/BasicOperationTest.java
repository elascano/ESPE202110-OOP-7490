
package ec.edu.espe.mathOperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darling.cruz
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
        float addend1 = 1.2F;
        float addend2 = 3.2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    
    public void testAddSecondTry() {
        System.out.println("add");
        float addend1 = 1.5F;
        float addend2 = 6.7F;
        BasicOperation instance = new BasicOperation();
        float expResult = 8.2F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
}
