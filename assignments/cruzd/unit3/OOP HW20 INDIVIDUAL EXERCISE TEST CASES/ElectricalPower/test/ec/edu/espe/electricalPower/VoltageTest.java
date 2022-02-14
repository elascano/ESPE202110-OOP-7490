
package ec.edu.espe.electricalPower;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darling.cruz
 */
public class VoltageTest {
    
    public VoltageTest() {
    }

    /**
     * Test of add method, of class Voltage.
     */
    @Test
    public void testPower1() {
        System.out.println("testPower1");
        float addend1 = 20.0F;
        float addend2 = 9.0F;
        Voltage instance = new Voltage();
        float expResult = 180.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower2() {
        System.out.println("testPower2");
        float addend1 = 17.0F;
        float addend2 = 5.67F;
        Voltage instance = new Voltage();
        float expResult = 96.39F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower3() {
        System.out.println("testPower3");
        float addend1 = 16.23F;
        float addend2 = 4.28F;
        Voltage instance = new Voltage();
        float expResult = 69.4644F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower4() {
        System.out.println("testPower4");
        float addend1 = 12.0F;
        float addend2 = 8.78F;
        Voltage instance = new Voltage();
        float expResult = 105.36F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower5() {
        System.out.println("testPower5");
        float addend1 = -8.65F;
        float addend2 = 3.14F;
        Voltage instance = new Voltage();
        float expResult = -27.161F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower6() {
        System.out.println("testPower6");
        float addend1 = 5.22F;
        float addend2 = 7.25F;
        Voltage instance = new Voltage();
        float expResult = 37.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
        @Test
    public void testPower7() {
        System.out.println("testPower7");
        float addend1 = 4.0F;
        float addend2 = 2.0F;
        Voltage instance = new Voltage();
        float expResult = 8.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower8() {
        System.out.println("testPower8");
        float addend1 = 2.3F;
        float addend2 = 1.2F;
        Voltage instance = new Voltage();
        float expResult = 2.76F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testPower9() {
        System.out.println("testPower9");
        float addend1 = 1.6F;
        float addend2 = 4.8F;
        Voltage instance = new Voltage();
        float expResult = 7.68F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
        @Test
    public void testPower10() {
        System.out.println("testPower10");
        float addend1 = 0.0F;
        float addend2 = 2.67F;
        Voltage instance = new Voltage();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    
     
}
