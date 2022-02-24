/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.mathoperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andrade Alan
 */
public class TimeEcuationTest {
    
    public TimeEcuationTest() {
    }

    /**
     * Test of add method, of class TimeEcuation.
     */
    @Test
    public void testAdd() {
        
        System.out.println("TimeEcuation");
        float distance = 2.5F;
        float speed = 1.5F;
        TimeEcuation instance = new TimeEcuation();
        float expResult = 1.66F;
        float result = instance.add(distance, speed);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
