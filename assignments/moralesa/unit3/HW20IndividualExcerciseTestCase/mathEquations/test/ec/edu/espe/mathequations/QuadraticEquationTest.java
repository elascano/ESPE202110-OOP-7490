
package ec.edu.espe.mathequations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class QuadraticEquationTest {
    
    public QuadraticEquationTest() {
    }

    /**
     * Test of equation method, of class QuadraticEquation.
     */
    @Test
    public void testEquation() {
        System.out.println("equation");
        float valuea = 1.0F;
        float valueb = 2.0F;
        float valuec = 1.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = -1.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);

    }
        
        @Test
    public void testEquationNegative() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = 2.0F;
        float valuec = -63.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 0.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative2() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = 2.0F;
        float valuec = -63.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 7.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationDecimals() {
        System.out.println("equation negative");
        float valuea = 2.0F;
        float valueb = 7.0F;
        float valuec = 6.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = -1.5F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative3() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = -81.0F;
        float valuec = 0.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 81.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationDecimals2() {
        System.out.println("equation negative");
        float valuea = 6.0F;
        float valueb = -19.0F;
        float valuec = 10.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 2.5F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative4() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = 3.0F;
        float valuec = -88.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 8.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative5() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = -37.0F;
        float valuec = -0.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 37.0F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative6() {
        System.out.println("equation negative");
        float valuea = 1.0F;
        float valueb = 2.0F;
        float valuec = -72.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 7.5F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
        
        @Test
    public void testEquationNegative7() {
        System.out.println("equation negative");
        float valuea = 7.0F;
        float valueb = -13.0F;
        float valuec = -1.0F;
        QuadraticEquation instance = new QuadraticEquation();
        float expResult = 1.9F;
        float result = instance.equation(valuea, valueb, valuec);
        assertEquals(expResult, result, 0.0);
    }
}
