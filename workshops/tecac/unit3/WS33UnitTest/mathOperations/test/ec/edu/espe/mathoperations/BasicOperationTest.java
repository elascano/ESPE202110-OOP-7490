package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
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

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minued = 5.2F;
        float substraend = 2.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.7F;
        float result = instance.subtruct(minued, substraend);
        assertEquals(expResult, result, 0.0);
    }
}
