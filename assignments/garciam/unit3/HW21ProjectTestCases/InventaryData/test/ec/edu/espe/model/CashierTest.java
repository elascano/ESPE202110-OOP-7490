
package ec.edu.espe.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayerly Garcia
 */
public class CashierTest {
    
    public CashierTest() {
    }

    /**
     * Test of sell method, of class Cashier.
     */
    @Test
    public void testSell() {
        System.out.println("sell");
        Cashier instance = new Cashier();
        instance.sell();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Cashier.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cashier instance = new Cashier();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Cashier.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cashier instance = new Cashier();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct method, of class Cashier.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        Cashier instance = new Cashier();
        int expResult = 0;
        int result = instance.getProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct method, of class Cashier.
     */
    @Test
    public void testSetProduct() {
        System.out.println("setProduct");
        int product = 0;
        Cashier instance = new Cashier();
        instance.setProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
