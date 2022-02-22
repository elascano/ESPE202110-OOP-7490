
package ec.edu.espe.distanceThePoints;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Caisatoa
 */
public class calculationOperationTest {
    //deber correr con fallas y captura del dbr
    //captura 2 correjidos los errores mñn en el noche
    //deber 2 cada uno debe hacer un set de casos de prueba para el proyecto lunes en la noche
    public calculationOperationTest() {
    }

    /**
     * Test of add method, of class calculationOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.2F;
        calculationOperation instance = new calculationOperation();
        float expResult = 4.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtruct method, of class calculationOperation.
     */
    @Test
    public void testSubtruct() {
        System.out.println("subtruct");
        float minuend = 5.2F;
        float substraend = 2.5F;
        calculationOperation instance = new calculationOperation();
        float expResult = 2.7F;
        float result = instance.subtruct(minuend, substraend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddDecimals2() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        calculationOperation instance = new calculationOperation();
        float expResult = 4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        float addend1 = -1.2F;
        float addend2 = -3.4F;
        calculationOperation instance = new calculationOperation();
        float expResult = -4.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
}
