package ec.edu.espe.area;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dylan Asumaza
 */
public class AreaTest {

    public AreaTest() {
    }

    /**
     * Test of add method, of class Area.
     */
    @Test
    public void testAdd() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 2.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 78.5F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddPostives1() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 6.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 530.66F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testAddPositives2() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 12.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 1962.5F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddPositives3() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 2.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 78.5F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAddPositives4() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 11.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 1661.06F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAddPositives5() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 5.5F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 379.94F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAddPositives6() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 100.2F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 126102.90F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAddPositives7() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 2.1F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 55.3896F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testAddPositives8() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 4.3F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 232.2344F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testAddPositives9() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 2.7F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 91.5624F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testAddPositives10() {
        System.out.println("Area");
        float pi = 3.14F;
        float radious = 5.7F;
        int constant = 4;
        Area instance = new Area();
        float expResult = 422.5184F;
        float result = instance.add(pi, radious, constant);
        assertEquals(expResult, result, 0.0001);
    }
}
