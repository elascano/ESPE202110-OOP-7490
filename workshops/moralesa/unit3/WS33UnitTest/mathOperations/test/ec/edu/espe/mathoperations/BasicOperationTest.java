
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anthony Morales, DEEE-ESPE
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
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
    public void testAddDecimals() {
        System.out.println("add decimals");
        float addend1 = 3.0F;
        float addend2 = 8.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 11.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testAddNegative() {
        System.out.println("add negative");
        float addend1 = -1.0F;
        float addend2 = -5.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -6.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testAddTest() {
        System.out.println("add test");
        float addend1 = 1.4F;
        float addend2 = 7.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = 6.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
}
