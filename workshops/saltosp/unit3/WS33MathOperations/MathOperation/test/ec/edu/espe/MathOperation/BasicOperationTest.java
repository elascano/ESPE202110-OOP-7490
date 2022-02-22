
package ec.edu.espe.MathOperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
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
        float addend1 = 1.4F;
        float addend2 = 2.4F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 0.0F;
        float substraend = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
