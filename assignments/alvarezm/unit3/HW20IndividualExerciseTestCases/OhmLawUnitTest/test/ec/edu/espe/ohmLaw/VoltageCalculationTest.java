
package ec.edu.espe.ohmLaw;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class VoltageCalculationTest {
    
    public VoltageCalculationTest() {
    }

    /**
     * Test of voltage method, of class VoltageCalculation.
     */
    @Test
    public void testVoltageLowInteger1() {
        System.out.println("voltage");
        float intensity = 6.0F;
        float resistance = 0.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 0.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
        @Test
    public void testVoltageLowInteger2() {
        System.out.println("voltage");
        float intensity = 10.0F;
        float resistance = 8.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 80.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltageLowInteger3() {
        System.out.println("voltage");
        float intensity = 20.0F;
        float resistance = 5000.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 100000.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
                @Test
    public void testVoltageLowInteger4() {
        System.out.println("voltage");
        float intensity = 25.0F;
        float resistance = 15.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 375.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
                    @Test
    public void testVoltageHighInteger1() {
        System.out.println("voltage");
        float intensity = 200.0F;
        float resistance = 9.8F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 1960.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltagePositiveLowFloat() {
        System.out.println("voltage");
        float intensity = 2.3F;
        float resistance = 20.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 46.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltageNegativeLowFloat1() {
        System.out.println("voltage");
        float intensity = -5.7F;
        float resistance = 23.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = -131.10F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltageNegativeLowFloat2() {
        System.out.println("voltage");
        float intensity = -9.6F;
        float resistance = 5.2F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = -49.92F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltageZero() {
        System.out.println("voltage");
        float intensity = 0.0F;
        float resistance = 0.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 0.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
            @Test
    public void testVoltageZeroLowInteger() {
        System.out.println("voltage");
        float intensity = 0.0F;
        float resistance = 15.0F;
        VoltageCalculation instance = new VoltageCalculation();
        float expResult = 0.0F;
        float result = instance.voltage(intensity, resistance);
        assertEquals(expResult, result, 0.01);
    }
    
}
