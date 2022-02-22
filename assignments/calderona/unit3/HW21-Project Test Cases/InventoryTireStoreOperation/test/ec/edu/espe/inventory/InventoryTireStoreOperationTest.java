/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.inventory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andy Calderon, DEEE-ESPE
 */
public class InventoryTireStoreOperationTest {
    
    public InventoryTireStoreOperationTest() {
    }

    /**
     * Test of add method, of class InventoryTireStoreOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("total");
        float Price = 28F;
        float Iva = 3.36F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 31.36F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd2() {
        System.out.println("total");
        float Price = 98F;
        float Iva = 11.76F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 109.76F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd3() {
        System.out.println("total");
        float Price = 48F;
        float Iva = 3.36F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 51.36F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd4() {
        System.out.println("total");
        float Price = 25F;
        float Iva = 3F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 28F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd5() {
        System.out.println("total");
        float Price = 52F;
        float Iva = 6.24F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 58.24F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd6() {
        System.out.println("total");
        float Price = 23F;
        float Iva = 2.76F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 25.76F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd7() {
        System.out.println("total");
        float Price = 15F;
        float Iva = 1.8F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 16.8F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd8() {
        System.out.println("total");
        float Price = 30F;
        float Iva = 3.6F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 33.6F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd9() {
        System.out.println("total");
        float Price = 71F;
        float Iva = 8.52F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 79.52F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }
        @Test
    public void testAdd10() {
        System.out.println("total");
        float Price = 56F;
        float Iva = 6.72F;
        InventoryTireStoreOperation instance = new InventoryTireStoreOperation();
        float expResult = 62.72F;
        float result = instance.add(Price, Iva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

}
