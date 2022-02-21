
package ec.edu.espe.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayerly Garcia
 */
public class CleaningSupplyTest {
    
    public CleaningSupplyTest() {
    }

    /**
     * Test of toString method, of class CleaningSupply.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CleaningSupply instance = new CleaningSupply();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct_id method, of class CleaningSupply.
     */
    @Test
    public void testGetProduct_id() {
        System.out.println("getProduct_id");
        CleaningSupply instance = new CleaningSupply();
        int expResult = 89645;
        int result = instance.getProduct_id();
        assertEquals(expResult, result,01);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct_id method, of class CleaningSupply.
     */
    @Test
    public void testSetProduct_id() {
        System.out.println("setProduct_id");
        int product_id = 0;
        CleaningSupply instance = new CleaningSupply();
        instance.setProduct_id(product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCleaningSupply method, of class CleaningSupply.
     */
    @Test
    public void testGetCleaningSupply() {
        System.out.println("getCleaningSupply");
        CleaningSupply instance = new CleaningSupply();
        String CleaningSupply;
        String expResult = "mop";
        String result = instance.getCleaningSupply();
        assertEquals(expResult, "mop");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCleaningSupply method, of class CleaningSupply.
     */
    @Test
    public void testSetCleaningSupply() {
        System.out.println("setCleaningSupply");
        String cleaningSupply = "";
        CleaningSupply instance = new CleaningSupply();
        instance.setCleaningSupply(cleaningSupply);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvailability method, of class CleaningSupply.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        CleaningSupply instance = new CleaningSupply();
        boolean expResult = false;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class CleaningSupply.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean availability = false;
        CleaningSupply instance = new CleaningSupply();
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class CleaningSupply.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        CleaningSupply instance = new CleaningSupply();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class CleaningSupply.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 10.0;
        CleaningSupply instance = new CleaningSupply();
        double expResult = 10.0;
        instance.setPrice(price);
        double result;
        //double result = instance.getPrice(price);
         assertEquals(expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
