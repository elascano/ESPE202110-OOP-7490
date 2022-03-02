
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaime Eivar DEEL-ESPE
 */
public class BasicOperationsTest {
    
        @Test
        public void testAdd() {
        System.out.println("add");
        float addend1 = 1.3F;
        float addend2 = 1.9F;
        BasicOperations instance = new BasicOperations();
        float expResult = 3.2F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
  
    }

    /**
     * Test of subtruct method, of class BasicOperations.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 3.2F;
        float substraend = 3.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.2F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
