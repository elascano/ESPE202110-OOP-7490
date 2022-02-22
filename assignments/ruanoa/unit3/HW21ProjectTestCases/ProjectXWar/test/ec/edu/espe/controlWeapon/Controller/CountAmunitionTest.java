
package ec.edu.espe.controlWeapon.Controller;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Alexander Ruano, DEEL-ESPE
 */
public class CountAmunitionTest {
    
    public CountAmunitionTest() {
    }

    /**
     * Test of inventory method, of class CountAmunition.
     */
    @Test
    public void testInventory1() {
        System.out.println("inventory");
        float addend1 = 3000.0F;
        float addend2 = 5000.0F;
        CountAmunition instance = new CountAmunition();
        float expResult = 8000.0F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory2() {
        System.out.println("inventory");
        float addend1 = 278.8F;
        float addend2 = 825.0F;
        CountAmunition instance = new CountAmunition();
        float expResult = 1103.8F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory3() {
        System.out.println("inventory");
        float addend1 = -852.2F;
        float addend2 = 8526.04F;
        CountAmunition instance = new CountAmunition();
        float expResult = 7673.84F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory4() {
        System.out.println("inventory");
        float addend1 = 524.32F;
        float addend2 = 785.63F;
        CountAmunition instance = new CountAmunition();
        float expResult = 1309.95F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory5() {
        System.out.println("inventory");
        float addend1 = 5874.26F;
        float addend2 = 845.63F;
        CountAmunition instance = new CountAmunition();
        float expResult = 6719.89F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.01);

    }
        @Test
    public void testInventory6() {
        System.out.println("inventory");
        float addend1 = 1100.52F;
        float addend2 = 52036.036F;
        CountAmunition instance = new CountAmunition();
        float expResult = 53136.556F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory7() {
        System.out.println("inventory");
        float addend1 = 8975.36F;
        float addend2 = 85423.6F;
        CountAmunition instance = new CountAmunition();
        float expResult = 94398.96F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory8() {
        System.out.println("inventory");
        float addend1 = 8569.36F;
        float addend2 = 0.2685F;
        CountAmunition instance = new CountAmunition();
        float expResult = 8569.6285F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory9() {
        System.out.println("inventory");
        float addend1 = 5783.56F;
        float addend2 = 28.458F;
        CountAmunition instance = new CountAmunition();
        float expResult = 5812.018F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
        @Test
    public void testInventory10() {
        System.out.println("inventory");
        float addend1 = -54692.32F;
        float addend2 = -589.20F;
        CountAmunition instance = new CountAmunition();
        float expResult = -55281.52F;
        float result = instance.inventory(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
}
