
package ec.edu.espe.Products.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author --> Angel Guaman <--- , DEEE-ESPE
 */
public class InventoryTest {
    
    public InventoryTest() {
    }

    /**
     * Test of getId method, of class Inventory.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Inventory instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Inventory.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Inventory instance = null;
        instance.setId(id);
        
    }

    /**
     * Test of getProductName method, of class Inventory.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        Inventory instance = null;
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setProductName method, of class Inventory.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String productName = "";
        Inventory instance = null;
        instance.setProductName(productName);
        
    }

    /**
     * Test of getQuantity method, of class Inventory.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Inventory instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuantity method, of class Inventory.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Inventory instance = null;
        instance.setQuantity(quantity);
     
    }

    /**
     * Test of getPrice method, of class Inventory.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Inventory instance = null;
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of setPrice method, of class Inventory.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Inventory instance = null;
        instance.setPrice(price);
        
    }

    /**
     * Test of isAvailability method, of class Inventory.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAvailability method, of class Inventory.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean availability = false;
        Inventory instance = null;
        instance.setAvailability(availability);
        
    }

    /**
     * Test of getExpirationDate method, of class Inventory.
     */
    @Test
    public void testGetExpirationDate() {
        System.out.println("getExpirationDate");
        Inventory instance = null;
        String expResult = "";
        String result = instance.getExpirationDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExpirationDate method, of class Inventory.
     */
    @Test
    public void testSetExpirationDate() {
        System.out.println("setExpirationDate");
        String expirationDate = "";
        Inventory instance = null;
        instance.setExpirationDate(expirationDate);
      
    }
    
}
