package ec.edu.espe.mathoperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Guzman
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
        float addend1 = 4.4F;
        float addend2 = 3.2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);
    }   
}
