
package ec.edu.espe.Operations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anderson
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of Operation method, of class Operation.
     */
    @Test
    public void testOperationPositive() {
        System.out.println("Operation");
        float a = 3.0F;
        float b = 4.0F;
        Operation instance = new Operation();
        float expResult = 5.0F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        
        @Test
    public void testOperationNegative() {
        System.out.println("Operation");
        float a = -3.0F;
        float b = -4.0F;
        Operation instance = new Operation();
        float expResult = 5.0F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationDecimal() {
        System.out.println("Operation");
        float a = 8.50F;
        float b = 4.30F;
        Operation instance = new Operation();
        float expResult = 9.525754928588867F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationtwocipher() {
        System.out.println("Operation");
        float a = 15.0F;
        float b = 12.0F;
        Operation instance = new Operation();
        float expResult = 19.2093734774121094F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationthreecipher() {
        System.out.println("Operation");
        float a = 314.0F;
        float b = 121.0F;
        Operation instance = new Operation();
        float expResult = 336.5070495605469F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationin() {
        System.out.println("Operation");
        float a = 5.0F;
        float b = 10.0F;
        Operation instance = new Operation();
        float expResult = 11.180339813232422F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationprimenumber() {
        System.out.println("Operation");
        float a = 11.0F;
        float b = 7.0F;
        Operation instance = new Operation();
        float expResult = 13.03840446472168F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationZero() {
        System.out.println("Operation");
        float a = 0.0F;
        float b = 0.0F;
        Operation instance = new Operation();
        float expResult = 0.0F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationOne() {
        System.out.println("Operation");
        float a = 1.0F;
        float b = 1.0F;
        Operation instance = new Operation();
        float expResult = 1.4142135381698608F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
        @Test
    public void testOperationhundred() {
        System.out.println("Operation");
        float a = 100.0F;
        float b = 200.0F;
        Operation instance = new Operation();
        float expResult = 223.60679626464844F;
        float result = instance.Pythagoras(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
}
