<<<<<<< HEAD

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
package ec.edu.espe.mathOperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author Alexander Ruano, DEEL-ESPE
=======
 * @author Jose Sanchez, DEEL-ESPE
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
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
<<<<<<< HEAD
        float addend1 = 1.2F;
        float addend2 = 3.2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result,0.0);
=======
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
>>>>>>> ce484174b950faef0a6691e272919111c42b3660

    }

    /**
     * Test of subtruct method, of class BasicOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
<<<<<<< HEAD
        float minuend = 5.2F;
        float subtraend = 2.5F;
        BasicOperation instance = new BasicOperation();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.1);

=======
        float minuend = 2.0F;
        float subtraend = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 1.0F;
        float result = instance.subtruct(minuend, subtraend);
        assertEquals(expResult, result, 0.0);
    
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
    }
    
}
