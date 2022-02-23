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
public class NewProductTest {
    
    public NewProductTest() {
    }

    /**
     * Test of view method, of class NewProduct.
     */
    @Test
    public void testView() {
        System.out.println("view");
        NewProduct instance = new NewProduct();
        instance.view();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class NewProduct.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        String id = "25";
        NewProduct instance = new NewProduct();
        boolean expResult = false;
        boolean result = instance.Delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewProduct.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewProduct.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
