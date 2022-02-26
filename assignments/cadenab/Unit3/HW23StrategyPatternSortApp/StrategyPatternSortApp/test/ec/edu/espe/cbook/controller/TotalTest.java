
package ec.edu.espe.cbook.controller;

import ec.edu.espe.tire.controller.Total;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Caisatoa
 */
public class TotalTest {
    
    public TotalTest() {
    }

    /**
     * Test of total method, of class Total.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        float multiply = 7.3F;
        float multiplier = 2.6F;
        Total instance = new Total();
        float expResult = 18.98F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testTotal1() {
        System.out.println("total");
        float multiply = 8.6F;
        float multiplier = 4.6F;
        Total instance = new Total();
        float expResult = 39.56F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testTotal2() {
        System.out.println("total");
        float multiply = 1.5F;
        float multiplier = -4.7F;
        Total instance = new Total();
        float expResult = -7.04F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testTotal3() {
        System.out.println("total");
        float multiply = 25.8F;
        float multiplier = 6.1F;
        Total instance = new Total();
        float expResult = 157.3F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testTotal4() {
        System.out.println("total");
        float multiply = 9.7F;
        float multiplier = -1.7F;
        Total instance = new Total();
        float expResult = -16.49F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testTotal5() {
        System.out.println("total");
        float multiply = 7.3F;
        float multiplier = 2.6F;
        Total instance = new Total();
        float expResult = 18.98F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testTotal6() {
        System.out.println("total");
        float multiply = 8.7F;
        float multiplier = 0.0F;
        Total instance = new Total();
        float expResult = 0.0F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }@Test
    public void testTotal7() {
        System.out.println("total");
        float multiply = 5.8F;
        float multiplier = 2.9F;
        Total instance = new Total();
        float expResult = 16.82F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testTotal8() {
        System.out.println("total");
        float multiply = 14.8F;
        float multiplier = 9.8F;
        Total instance = new Total();
        float expResult = 145.04F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testTotal9() {
        System.out.println("total");
        float multiply = 32.0F;
        float multiplier = 9.0F;
        Total instance = new Total();
        float expResult = 288.0F;
        float result = instance.total(multiply, multiplier);
        assertEquals(expResult, result, 0.0);
    }
}
