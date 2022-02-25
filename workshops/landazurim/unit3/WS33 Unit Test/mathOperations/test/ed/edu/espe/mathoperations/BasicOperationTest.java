/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ed.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateo Landazuri DEE-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.1F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.3F;
        float result = instance.add(addend1, addend2);
        
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 4.1F;
        float substraend = 1.2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.9F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
