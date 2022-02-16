/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.circunference;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TOSHIBA
 */
public class CircumferenceTest {
    
    public CircumferenceTest() {
    }

    /**
     * Test of add method, of class Circumference.
     */
    @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 1.8F;
        Circumference instance = new Circumference();
        float expResult = 5.652F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
    
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 0.5F;
        Circumference instance = new Circumference();
        float expResult = 1.57F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 1.3F;
        Circumference instance = new Circumference();
        float expResult = 4.082F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 0.9F;
        Circumference instance = new Circumference();
        float expResult = 2.826F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 25.3F;
        Circumference instance = new Circumference();
        float expResult =79.442F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 50.5F;
        Circumference instance = new Circumference();
        float expResult = 158.57F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 105.5F;
        Circumference instance = new Circumference();
        float expResult = 331.27F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 78.4F;
        Circumference instance = new Circumference();
        float expResult = 246.176F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 22.1F;
        Circumference instance = new Circumference();
        float expResult = 69.394F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
      @Test
    public void testAdd() {
        System.out.println("circumference");
        float pi = 3.14F;
        float diameter = 56.6F;
        Circumference instance = new Circumference();
        float expResult = 177.724F;
        float result = instance.add(pi, diameter);
        assertEquals(expResult, result, 0.001);
        
    }
    
    
}
