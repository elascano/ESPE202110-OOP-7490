
package ec.edu.espe.bank.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class ManagementTest {
    
    public ManagementTest() {
    }

  /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testTransfers() {
        System.out.println("add");
        float addend1 = 200.50F;
        float addend2 = 0.0F;
        Management instance = new Management();
        float expResult = 200.50F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);

    }
@Test
    public void testDeposits() {
        System.out.println("add");
        float addend1 = 100F;
        float addend2 = 100F;
        Management instance = new Management();
        float expResult = 200F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.001);

    }
    
    /**
     * Test of subtruct method, of class Management.
     */
    @Test
    public void testWithDrawals() {

        System.out.println("subtruct");
        float minuend = 50.20F;
        float subtraend = 20.50F;
        Management instance = new Management();
        float expResult = 29.70F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.001);
    }
    
}

