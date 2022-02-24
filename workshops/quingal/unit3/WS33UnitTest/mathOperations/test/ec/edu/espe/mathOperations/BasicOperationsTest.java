/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mathOperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.2F;
        BasicOperations instance = new BasicOperations();
        float expResult = 4.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtruct method, of class BasicOperations.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 5.2F;
        float substraend = 2.5F;
        BasicOperations instance = new BasicOperations();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.01);
       
    }
    
}
