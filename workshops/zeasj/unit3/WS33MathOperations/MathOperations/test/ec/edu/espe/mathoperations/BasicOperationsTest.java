package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joel Zeas 
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 4F;
        float addend2 = 2F;
        BasicOperations instance = new BasicOperations();
        float expResult = 6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtruct method, of class BasicOperations.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 5.2F;
        float subtraend = 2.5F;
        BasicOperations instance = new BasicOperations();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.1);

    }
    
}
