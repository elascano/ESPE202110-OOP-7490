
package ec.edu.espe.mathOperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class mathOperationTest {
    
    public mathOperationTest() {
    }

    /**
     * Test of main method, of class mathOperation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double diameter= 5;
        double circumference = pi*diameter;
        double expResult = 31.4;
        double result = mathOperation.main(args, circumference, (float) diameter);
        assertEquals(expResult, result, 0.001);

    }
    
}
