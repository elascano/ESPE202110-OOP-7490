/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.mathoperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Palacios, DEEE-ESPE
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
        float addend2 = 3.4F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 4.4);
        
    }
    
    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 5.20F;
        float substraend = 2.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.1);
        
    }
    
}
