
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salma Villegas DEEE-ESPE
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
        float addend1 = 4.2F;
        float addend2 = 3.4F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
