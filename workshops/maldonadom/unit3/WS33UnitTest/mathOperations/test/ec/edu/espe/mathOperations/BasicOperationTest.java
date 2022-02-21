
package ec.edu.espe.mathOperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateo Maldonado
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
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
        assertEquals(expResult, result, 0.0001);
    }
}
