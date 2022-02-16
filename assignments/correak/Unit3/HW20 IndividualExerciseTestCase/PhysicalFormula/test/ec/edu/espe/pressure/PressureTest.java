/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.pressure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KERLY CORREA
 */
public class PressureTest {
    
    public PressureTest() {
    }

    /**
     * Test of pressure method, of class Pressure.
     */
    @Test
    public void testPressure() {
        System.out.println("pressure");
        float force = 14.2F;
        float area = 14.5F;
        Pressure instance = new Pressure();
        float exp = 0.9793F;
         float expResult=(float)Math.round(exp*1000f)/1000;
        float result = instance.pressure(force, area);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testPressure2() {
        System.out.println("pressure");
        float force = 23.5F;
        float area = 19.4F;
        Pressure instance = new Pressure();
        float exp = 1.2113F;
        float expResult=(float)Math.round(exp*1000f)/1000;
        float result = instance.pressure(force, area);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testPressure3() {
        System.out.println("pressure");
        float force = 16.2F;
        float area = 20.3F;
        Pressure instance = new Pressure();
        float exp = 0.79803F;
         float expResult=(float)Math.round(exp*1000f)/1000;
        float result = instance.pressure(force, area);
        assertEquals(expResult, result, 0.0);
       
    }
    
    @Test
    public void testPressure4() {
        System.out.println("pressure");
        float force = 22.1F;
        float area = 32.6F;
        Pressure instance = new Pressure();
        float exp = 0.6779F;
         float expResult=(float)Math.round(exp*1000f)/1000;
        float result = instance.pressure(force, area);
        assertEquals(expResult, result, 0.0);
       
    }
    
    @Test
    public void testPressure5() {
        System.out.println("pressure");
        float force = 23.1F;
        float area = 10.6F;
        Pressure instance = new Pressure();
        float expResult = 2.1792F;
        float result = instance.pressure(force, area);
        assertEquals(expResult, result, 0.0000000);
    }
    
    
   
}
