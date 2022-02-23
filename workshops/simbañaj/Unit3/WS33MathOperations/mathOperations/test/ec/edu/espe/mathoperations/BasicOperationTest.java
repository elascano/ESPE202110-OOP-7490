package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simbaña J
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
        float addend1 = 2.5F;
        float addend2 = 3.3F;
        BasicOperation instance = new BasicOperation();
        float expResult = 5.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);

    }
@Test
    public void testAddDecimals2() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);

    }
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -1.2F;
        float addend2 = -3.4F;
        BasicOperation instance = new BasicOperation();
        float expResult = -4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);

    }
    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 5.2F;
        float subtraend = 2.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.001);

    }
    
}

