
package ec.edu.espe.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayerly Garcia
 */
public class CannedTest {
    
    public CannedTest() {
    }

    /**
     * Test of getProduct_id method, of class Canned.
     */
    @Test
    public void testGetProduct_id() {
        System.out.println("getProduct_id");
        Canned instance = new Canned();
        int expResult = 12345567;
        int result = instance.getProduct_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct_id method, of class Canned.
     */
    @Test
    public void testSetProduct_id() {
        System.out.println("setProduct_id");
        int product_id = 12345567;
        Canned instance = new Canned();
        instance.setProduct_id(product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCanned method, of class Canned.
     */
    @Test
    public void testGetCanned() {
        System.out.println("getCanned");
        Canned instance = new Canned();
        String expResult = "tuna";
        String result = instance.getCanned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanned method, of class Canned.
     */
    @Test
    public void testSetCanned() {
        System.out.println("setCanned");
        String canned = "tuna";
        Canned instance = new Canned();
        instance.setCanned(canned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvailability method, of class Canned.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        Canned instance = new Canned();
        boolean expResult = true;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class Canned.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean availability = true;
        Canned instance = new Canned();
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpiration method, of class Canned.
     */
    @Test
    public void testGetExpiration() {
        System.out.println("getExpiration");
        Canned instance = new Canned();
        String expResult = "2021";
        String result = instance.getExpiration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpiration method, of class Canned.
     */
    @Test
    public void testSetExpiration() {
        System.out.println("setExpiration");
        String expiration = "2021";
        Canned instance = new Canned();
        instance.setExpiration(expiration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Canned.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Canned instance = new Canned();
        String expResult = "medium";
        String result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Canned.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "medium";
        Canned instance = new Canned();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Canned.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Canned instance = new Canned();
        double expResult = 4.76;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Canned.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 4.76;
        Canned instance = new Canned();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
