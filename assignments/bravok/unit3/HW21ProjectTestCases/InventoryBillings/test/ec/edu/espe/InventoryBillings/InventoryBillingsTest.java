
package ec.edu.espe.InventoryBillings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Katherin Bravo DEEL ESPE
 */
public class InventoryBillingsTest {
    
    public InventoryBillingsTest() {
    }

    /**
     * Test of add method, of class BasicOperation add product.
     */
    @Test
    public void testInventoryBillings1() {
        System.out.println("add product");
        float product1 = 7.5F;
        float product2 = 7.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 14.7F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testInventoryBillings2() {
        System.out.println("add product");
        float product1 = 16.2F;
        float product2 = 58.27F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 74.47F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings3() {
        System.out.println("add product");
        float product1 = 745F;
        float product2 = 7.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 752.2F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings4() {
        System.out.println("add product");
        float product1 = 12.2F;
        float product2 = 2.78F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 14.98F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings5() {
        System.out.println("add product");
        float product1 = 112.2F;
        float product2 = 22.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 134.4F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings6() {
        System.out.println("add product");
        float product1 = 58.785F;
        float product2 = 1.48F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 60.265F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings7() {
        System.out.println("add product");
        float product1 = 1.2F;
        float product2 = 2.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 3.4F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings8() {
        System.out.println("add product");
        float product1 = 7.1F;
        float product2 = 2.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 9.3F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings9() {
        System.out.println("add product");
        float product1 = 1.4F;
        float product2 = 2.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 3.6F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
    
    @Test
    public void testInventoryBillings10() {
        System.out.println("add product");
        float product1 = 1.2F;
        float product2 = 2.2F;
        InventoryBillings instance = new InventoryBillings();
        float expResult = 3.4F;
        float result = instance.add(product1, product2);
        assertEquals(expResult, result, 0.0);
}
}
