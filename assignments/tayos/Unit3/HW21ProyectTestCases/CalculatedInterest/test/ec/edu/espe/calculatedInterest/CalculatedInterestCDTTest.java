
package ec.edu.espe.calculatedInterest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Sebas
 */
public class CalculatedInterestCDTTest {
    
    public CalculatedInterestCDTTest() {
    }

    /**
     * Test of calculatedInterest method, of class CalculatedInterestCDT.
     */
    @Test
    public void testCalculatedInterest() {
        System.out.println("amount");
        float capital = 0.0F;
        float time = 4.0F;
        float reason = 1.0F;
        CalculatedInterestCDT instance = new CalculatedInterestCDT();
        float expResult = 0.0F;
        float result = instance.amount(capital, time, reason);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Interest method, of class CalculatedInterestCDT.
     */
    @Test
    public void testInterest() {
        System.out.println("Interest");
        float amount = -5000.2320F;
        float capital = 520.4321F;
        CalculatedInterestCDT instance = new CalculatedInterestCDT();
        float expResult = -5520.6640625F;
        float result = instance.Interest(amount, capital);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
