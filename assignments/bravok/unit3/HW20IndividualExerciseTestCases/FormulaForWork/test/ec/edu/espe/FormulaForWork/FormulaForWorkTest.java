
package ec.edu.espe.FormulaForWork;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class FormulaForWorkTest {
    
    public FormulaForWorkTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testFormulaForWork1() {
        System.out.println("mult");
        float int1 = 4.2F;
        float int2 = 2.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 9.24F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testFormulaForWork2() {
        System.out.println("mult");
        float int1 = 1.2F;
        float int2 = 2.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 2.64F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
    
}
    
    @Test
    public void testFormulaForWork3() {
        System.out.println("mult");
        float int1 = 6.4F;
        float int2 = 4.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 26.88F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
    
}
    
    @Test
    public void testFormulaForWork4() {
        System.out.println("mult");
        float int1 = 7.34F;
        float int2 = 2.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 16.148F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork5() {
        System.out.println("mult");
        float int1 = 25.2F;
        float int2 = 2.7F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 68.04F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork6() {
        System.out.println("mult");
        float int1 = 26.7F;
        float int2 = 8.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 218.94F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork7() {
        System.out.println("mult");
        float int1 = 74.2F;
        float int2 = 1.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 89.04F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork8() {
        System.out.println("mult");
        float int1 = 1.2F;
        float int2 = 1.2F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 1.44F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork9() {
        System.out.println("mult");
        float int1 = 11.2F;
        float int2 = 2.27F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 25.424F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testFormulaForWork10() {
        System.out.println("mult");
        float int1 = 8.2F;
        float int2 = 8.8F;
        FormulaForWork instance = new FormulaForWork();
        float expResult = 72.16F;
        float result = instance.mult(int1, int2);
        assertEquals(expResult, result, 0.0);
}
    }