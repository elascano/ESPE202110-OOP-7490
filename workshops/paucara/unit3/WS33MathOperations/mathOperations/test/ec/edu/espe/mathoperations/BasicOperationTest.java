
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier Paucar
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
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

     @Test
    public void testAddDecimals() {
        System.out.println("add");
        float addend1 = 3.2F;
        float addend2 = 4.6F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -3.1F;
        float addend2 = -4.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -7.1F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    
    
    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 4.3F;
        float subtraend = 2.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.2F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.001);
    }
    
}
