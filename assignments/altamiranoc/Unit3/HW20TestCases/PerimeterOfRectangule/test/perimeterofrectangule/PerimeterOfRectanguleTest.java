package perimeterofrectangule;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Altamirano Cristhian
 */
public class PerimeterOfRectanguleTest {
    
    public PerimeterOfRectanguleTest() {
    }

    /**
     * Test of main method, of class PerimeterOfRectangule.
     */
    @Test
    public void testAdd() {
        System.out.println("Perimeter");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float addend3 = 0.0F;
        float addend4 = 0.0F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd1() {
        System.out.println("Perimeter");
        float addend1 = 10.2F;
        float addend2 = 10.2F;
        float addend3 = 6.5F;
        float addend4 = 6.5F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 33.4F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd2() {
        System.out.println("Perimeter");
        float addend1 = 7.5F;
        float addend2 = 7.5F;
        float addend3 = 8.3F;
        float addend4 = 8.3F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 31.6F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd3() {
        System.out.println("Perimeter");
        float addend1 = 19.7F;
        float addend2 = 19.7F;
        float addend3 = 13.4F;
        float addend4 = 13.4F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 66.2F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd4() {
        System.out.println("Perimeter");
        float addend1 = 17.2F;
        float addend2 = 17.2F;
        float addend3 = 12.5F;
        float addend4 = 12.5F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 59.4F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd5() {
        System.out.println("Perimeter");
        float addend1 = 20.3F;
        float addend2 = 20.3F;
        float addend3 = 15.6F;
        float addend4 = 15.6F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 71.8F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd6() {
        System.out.println("Perimeter");
        float addend1 = 23.5F;
        float addend2 = 23.5F;
        float addend3 = 19.7F;
        float addend4 = 19.7F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 86.4F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd7() {
        System.out.println("Perimeter");
        float addend1 = 28.1F;
        float addend2 = 28.1F;
        float addend3 = 20.8F;
        float addend4 = 20.8F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 97.8F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd8() {
        System.out.println("Perimeter");
        float addend1 = 12.3F;
        float addend2 = 12.3F;
        float addend3 = 9.8F;
        float addend4 = 9.8F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 44.2F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd9() {
        System.out.println("Perimeter");
        float addend1 = 100.5F;
        float addend2 = 100.5F;
        float addend3 = 89.7F;
        float addend4 = 89.7F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 380.4F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd10() {
        System.out.println("Perimeter");
        float addend1 = 500.8F;
        float addend2 = 500.8F;
        float addend3 = 300.9F;
        float addend4 = 300.9F;
        PerimeterOfRectangule instance = new PerimeterOfRectangule();
        float expResult = 1603.4F;
        float result = instance.add(addend1, addend2, addend3, addend4);
        assertEquals(expResult, result, 0.0);
    }
}
