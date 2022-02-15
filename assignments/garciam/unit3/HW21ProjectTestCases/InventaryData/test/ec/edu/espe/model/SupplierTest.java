
package ec.edu.espe.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayerly Garcia
 */
public class SupplierTest {
    
    public SupplierTest() {
    }

    

   
  
    /**
     * Test of seeAvailability method, of class Supplier.
     */
    @Test
    public void testSeeAvailability() {
        System.out.println("seeAvailability");
        boolean forTime = true;
        Supplier instance = new Supplier();
        instance.seeAvailability(forTime);
        
    }

    /**
     * Test of getId method, of class Supplier.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Supplier instance = new Supplier();
        int expResult =1718921578 ;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Supplier.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1718921578;
        int expResult =1718921578;
        Supplier instance = new Supplier();
        instance.setId(id);
        
    }

    /**
     * Test of getNameSupplier method, of class Supplier.
     */
    @Test
    public void testGetNameSupplier() {
        System.out.println("getNameSupplier");
        Supplier instance = new Supplier();
        String expResult = "cookies";
        String result = instance.getNameSupplier();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNameSupplier method, of class Supplier.
     */
    @Test
    public void testSetNameSupplier() {
        System.out.println("setNameSupplier");
        String nameSupplier = "";
        Supplier instance = new Supplier();
        instance.setNameSupplier(nameSupplier);
        
    }

    /**
     * Test of isProductAvailability method, of class Supplier.
     */
    @Test
    public void testIsProductAvailability() {
        System.out.println("isProductAvailability");
        Supplier instance = new Supplier();
        boolean expResult = true;
        boolean result = instance.isProductAvailability();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProductAvailability method, of class Supplier.
     */
    @Test
    public void testSetProductAvailability() {
        System.out.println("setProductAvailability");
        boolean productAvailability = true;
        Supplier instance = new Supplier();
        instance.setProductAvailability(productAvailability);
        
    }

    

    
}
