
package ec.edu.espe.mathoperations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

     // Unit
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
    
    @Test
    public void testAddDecimals2() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        BasicOperations instance = new BasicOperations();
        float expResult = 4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
        @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -1.2F;
        float addend2 = -3.4F;
        BasicOperations instance = new BasicOperations();
        float expResult = -4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0001);

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
        
        //Java Method wich is called assertEquals
        assertEquals(expResult, result, 0.001); //Decimal numbers

    }
    
}
