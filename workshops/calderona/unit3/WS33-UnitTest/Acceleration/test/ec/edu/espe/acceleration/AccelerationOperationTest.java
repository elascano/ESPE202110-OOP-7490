/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.acceleration;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andy Calderon, DEEE-ESPE
 */
public class AccelerationOperationTest {
    
    public AccelerationOperationTest() {
    }

    /**
     * Test of add method, of class AccelerationOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 4.2F;
        float addend2 = 3.4F;
        AccelerationOperation instance = new AccelerationOperation();
        float expResult = 7.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
