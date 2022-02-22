
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Lincango , DEEE-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method.
     */
    @Test
    public void testAddHours() {
        System.out.println("Doctor-Hours");
        float Doctor = 14.0F;
        float hours = 10.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 24.5F;
        float result = instance.add(Doctor, hours);
        assertEquals(expResult, result, 0.0);
       
        
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtructHous() {
        System.out.println("Doctor");
        float Doctor = 14.0F;
        float holidays = 6.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 7.5F;
        float result = instance.subtruct(Doctor, holidays);
        assertEquals(expResult, result, 0.0);
   
    }
    
}
