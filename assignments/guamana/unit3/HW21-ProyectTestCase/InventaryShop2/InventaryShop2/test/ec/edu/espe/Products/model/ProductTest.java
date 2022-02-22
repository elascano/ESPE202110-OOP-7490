/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.Products.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author --> Angel Guaman <--- , DEEE-ESPE
 */
public class ProductTest {
    
    public ProductTest() {
    }

    /**
     * Test of getId method, of class Product.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Product instance = null;
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Product.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        Product instance = null;
        instance.setId(id);
        
    }

    /**
     * Test of getProductName method, of class Product.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        Product instance = null;
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String productName = "";
        Product instance = null;
        instance.setProductName(productName);
        
    }

    /**
     * Test of getQuantity method, of class Product.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Product instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 25;
        Product instance = null;
        instance.setQuantity(quantity);
        
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = null;
        float expResult = 2.5F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 3.F;
        Product instance = null;
        instance.setPrice(price);
       
    }

    /**
     * Test of isAvailability method, of class Product.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        Product instance = null;
        boolean expResult = false;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAvailability method, of class Product.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean availability = false;
        Product instance = null;
        instance.setAvailability(availability);
       
    }

    /**
     * Test of getExpirationDate method, of class Product.
     */
    @Test
    public void testGetExpirationDate() {
        System.out.println("getExpirationDate");
        Product instance = null;
        String expResult = "";
        String result = instance.getExpirationDate();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setExpirationDate method, of class Product.
     */
    @Test
    public void testSetExpirationDate() {
        System.out.println("setExpirationDate");
        String expirationDate = "";
        Product instance = null;
        instance.setExpirationDate(expirationDate);
       
    }
    
}
