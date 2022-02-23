package ec.edu.espe.amperage;

import ec.edu.espe.amperage.CircuitAmperge;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joel Zeas 
 */
public class CircuitAmperageTest {
    
    public CircuitAmperageTest() {
    }

    /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testLess() {
        System.out.println("less");
        float dividend = 2F;
        float divider = -85F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = -0.02F;
        float result = instance.less(dividend, divider);
        assertEquals(expResult, result, -0.00);

    }

    /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testTenth() {
        System.out.println("Tenth");
        float dividend = 5.5F;
        float divider = 547F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 0.01F;
        float result = instance.tenth(dividend, divider);
        assertEquals(expResult, result, 0.01);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testZero() {
        System.out.println("zero");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.zero(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testError() {
        System.out.println("error");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.error(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testPoint() {
        System.out.println("point");
        float dividend = 0.84F;
        float divider = 15.8F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 0.05F;
        float result = instance.point(dividend, divider);
        assertEquals(expResult, result, 0.01);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testNegative() {
        System.out.println("negative");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.negative(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testApproximate() {
        System.out.println("approximate");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.approximate(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.values(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testFigure() {
        System.out.println("figure");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.figure(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testNear() {
        System.out.println("near");
        float dividend = 4F;
        float divider = 2F;
        CircuitAmperge instance = new CircuitAmperge();
        float expResult = 2F;
        float result = instance.near(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
}
