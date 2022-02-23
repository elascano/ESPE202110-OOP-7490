
package ec.edu.espe.cbook.controller;

import ec.edu.espe.tire.controller.Discount;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Caisatoa
 */
public class DiscountTest {
    
    public DiscountTest() {
    }

    /**
     * Test of distance method, of class Discount.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        float priceDiscount = 3.0F;
        float totalPrice = 125.3F;
        Discount instance = new Discount();
        float expResult = 122.0F;
        float result = instance.distance(priceDiscount, totalPrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
