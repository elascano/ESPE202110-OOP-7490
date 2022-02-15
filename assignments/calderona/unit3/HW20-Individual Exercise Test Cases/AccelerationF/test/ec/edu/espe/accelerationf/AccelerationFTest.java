
package ec.edu.espe.accelerationf;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andy Calderon, DEEE-ESPE
 */
public class AccelerationFTest {
    
    public AccelerationFTest() {
    }

    /**
     * Test of divide method, of class AccelerationF.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float force = 50F;
        float mass = 110F;
        AccelerationF instance = new AccelerationF();
        float expResult = 0.45F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide2() {
        System.out.println("divide");
        float force = 100F;
        float mass = 90F;
        AccelerationF instance = new AccelerationF();
        float expResult = 1.11F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide3() {
        System.out.println("divide");
        float force = 20F;
        float mass = 50F;
        AccelerationF instance = new AccelerationF();
        float expResult = 0.4F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.0);

    
    }
    @Test
    public void testDivide4() {
        System.out.println("divide");
        float force = 220F;
        float mass = 70F;
        AccelerationF instance = new AccelerationF();
        float expResult = 3.14F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide5() {
        System.out.println("divide");
        float force = 500F;
        float mass = 60F;
        AccelerationF instance = new AccelerationF();
        float expResult = 8.33F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide6() {
        System.out.println("divide");
        float force = 25F;
        float mass = 5F;
        AccelerationF instance = new AccelerationF();
        float expResult = 5F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.0);

    
    }
    @Test
    public void testDivide7() {
        System.out.println("divide");
        float force = 350F;
        float mass = 25F;
        AccelerationF instance = new AccelerationF();
        float expResult = 14F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide8() {
        System.out.println("divide");
        float force = 700F;
        float mass = 550F;
        AccelerationF instance = new AccelerationF();
        float expResult = 1.27F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide9() {
        System.out.println("divide");
        float force = 30F;
        float mass = 0.15F;
        AccelerationF instance = new AccelerationF();
        float expResult = 200F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
    @Test
    public void testDivide10() {
        System.out.println("divide");
        float force = 1000F;
        float mass = 850F;
        AccelerationF instance = new AccelerationF();
        float expResult = 1.17F;
        float result = instance.divide(force, mass);
        assertEquals(expResult, result, 0.01);

    
    }
}
