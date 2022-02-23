
package ec.edu.espe.ruleOfLaplace.view;

import static java.lang.Float.NaN;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebas
 */
public class RuleOfLaplaceTest {
    
    public RuleOfLaplaceTest() {
    }

    /**
     * Test of divide method, of class RuleOfLaplace.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float numerator = -5.2F;
        float denominator = 3.2F;
        RuleOfLaplace instance = new RuleOfLaplace();
        float expResult = -1.625F;
        float result = instance.divide(numerator, denominator);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
