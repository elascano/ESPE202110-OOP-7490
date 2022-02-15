
package ec.edu.espe.areaOfARhombus;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Saltos , DEEE-ESPE
 */
public class BasicOperationRhombusTest {
    
    public BasicOperationRhombusTest() {
    }

    /**
     * Test of diagonal method, of class BasicOperationRhombus.
     */
    @Test
    public void testDiagonal() {
        System.out.println("diagonal");
        float D1 = 16.2F;
        float d2 = 12.2F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 98.82F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
        
    }
    
    @Test
    public void testDiagonal2() {
        System.out.println("diagonal");
        float D1 = 10.07F;
        float d2 = 7.93F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 39.92755F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal3() {
        System.out.println("diagonal");
        float D1 = 6.8F;
        float d2 = 4.2F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 14.2800F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal4() {
        System.out.println("diagonal");
        float D1 = -15.42F;
        float d2 = 6.37F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = -49.1127F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
     @Test
    public void testDiagonal5() {
        System.out.println("diagonal");
        float D1 = 32.1406F;
        float d2 = 9.8356F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 158.0610427F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal6() {
        System.out.println("diagonal");
        float D1 = 8.2F;
        float d2 = 6.2F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 25.42F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal7() {
        System.out.println("diagonal");
        float D1 = 12.6894F;
        float d2 = -3.4598F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = -21.95139306F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal8() {
        System.out.println("diagonal");
        float D1 = 17.5485F;
        float d2 = 1.2458F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 10.93096065F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal9() {
        System.out.println("diagonal");
        float D1 = 2.4582F;
        float d2 = 0.9845F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = 1.21004895F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testDiagonal10() {
        System.out.println("diagonal");
        float D1 = 0.1404F;
        float d2 = -24.0620F;
        BasicOperationRhombus instance = new BasicOperationRhombus();
        float expResult = -1.6891524F;
        float result = instance.diagonal(D1, d2);
        assertEquals(expResult, result, 0.01);
    }

}
