
package ec.edu.espe.electricalPower;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darling.cruz
 */
public class DiscountTest {
    
    public DiscountTest() {
    }

    /**
     * Test of add method, of class Voltage.
     */
    @Test
    public void testPower1() {
        System.out.println("testDiscount1");
        float addend1 = 20.0F;
        float addend2 = 9.0F;
        Discount instance = new Discount();
        float expResult = 180.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower2() {
        System.out.println("testDiscount2");
        float addend1 = 17.0F;
        float addend2 = 5.67F;
        Discount instance = new Discount();
        float expResult = 96.39F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower3() {
        System.out.println("testDiscount3");
        float addend1 = 16.23F;
        float addend2 = 4.28F;
        Discount instance = new Discount();
        float expResult = 69.4644F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower4() {
        System.out.println("testDiscount4");
        float addend1 = 12.0F;
        float addend2 = 8.78F;
        Discount instance = new Discount();
        float expResult = 105.36F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower5() {
        System.out.println("testDiscount5");
        float addend1 = -8.65F;
        float addend2 = 3.14F;
        Discount instance = new Discount();
        float expResult = -27.161F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower6() {
        System.out.println("testDiscount6");
        float addend1 = 5.22F;
        float addend2 = 7.25F;
        Discount instance = new Discount();
        float expResult = 37.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower7() {
        System.out.println("testDiscount7");
        float addend1 = 4.0F;
        float addend2 = 2.0F;
        Discount instance = new Discount();
        float expResult = 8.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower8() {
        System.out.println("testDiscount8");
        float addend1 = 2.3F;
        float addend2 = 1.2F;
        Discount instance = new Discount();
        float expResult = 2.76F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    
        @Test
    public void testPower9() {
        System.out.println("testDiscount9");
        float addend1 = 1.6F;
        float addend2 = 4.8F;
        Discount instance = new Discount();
        float expResult = 7.68F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower10() {
        System.out.println("testDiscount10");
        float addend1 = 0.0F;
        float addend2 = 2.67F;
        Discount instance = new Discount();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    
     
}
