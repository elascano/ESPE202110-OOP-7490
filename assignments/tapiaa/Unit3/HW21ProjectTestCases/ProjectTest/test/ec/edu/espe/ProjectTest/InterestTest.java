
package ec.edu.espe.ProjectTest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea Tapia
 */
public class InterestTest {
    
    public InterestTest() {
    }

    /**
     * Test of amount method, of class Interest.
     */
    @Test
    public void testAmount() {
        System.out.println("Amount");
        float capital = 500.23F;
        float time = 2.0F;
        float reason = 0.022F;
        Interest instance = new Interest();
        float expResult = 522.48F;
        float result = instance.amount(capital, time, reason);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of Interest method, of class Interest.
     */
    @Test
    public void testInterest() {
        System.out.println("Interest");
        float amount = 1254.9F;
        float capital = 943.93F;
        Interest instance = new Interest();
        float expResult = 310.97F;
        float result = instance.Interest(amount, capital);
        assertEquals(expResult, result, 0.001);
    }
    
}
