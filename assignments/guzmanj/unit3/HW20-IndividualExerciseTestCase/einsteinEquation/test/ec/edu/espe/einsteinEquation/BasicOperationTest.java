/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.einsteinEquation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Guzman
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiplyElectron() {
        float mass = 0.0000000000000000000000000009109F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.000000000081981F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiplyProton() {
        float mass = 0.000000000000000000000000000000911F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.00000000000008199F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiplyPhoton() {
        float mass = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiply1kg() {
        float mass = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 90000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiply10kg() {
        float mass = 10.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 900000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiply25kg() {
        float mass = 25.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2250000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiply50kg() {
        float mass = 50.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4500000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiply100kg() {
        float mass = 100.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 9000000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiplyTon() {
        float mass = 1000.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 90000000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMultiplyCar() {
        float mass = 1857.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 167130000000000000000.0F;
        float result = instance.multiply(mass);
        assertEquals(expResult, result, 0.0);
    }
}
