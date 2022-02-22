package ec.edu.espe.areaTriangle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander Ruano, DEEL-ESPE
 */
public class AreaTriangleTest {

    public AreaTriangleTest() {
    }

    /**
     * Test of area method, of class AreaTriangle.
     */
    @Test
    public void testArea1() {
        System.out.println("area b=4.56 ; h=852.22");
        float base = 4.56F;
        float height = 852.22F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 1943.0616F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea2() {
        System.out.println("area b=40485.2; h=52.00");
        float base = 40485.2F;
        float height = 52.0F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 1052615.125F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea3() {
        System.out.println("area b=523.20 ; h=526.3");
        float base = 523.20F;
        float height = 526.3F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 137680.08F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea4() {
        System.out.println("area b=-4502.05 ; h=2589.00");
        float base = -4502.05F;
        float height = 2589.00F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = -5827903.725F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea5() {
        System.out.println("area b=4528280.63 ; h=-98524.4 ");
        float base = 4528280.63F;
        float height = -98524.4F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = -2.230730661e11F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea6() {
        System.out.println("area b= 545698.0 ; h=-0.25896");
        float base = 545698.0F;
        float height = -0.25896F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = -70656.97704F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testArea7() {
        System.out.println("area b=54365.52 ; h=20.5");
        float base = 54365.52F;
        float height = 20.5F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 557246.58F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea8() {
        System.out.println("area b= -98505.36 ; h=-98752.55");
        float base = -98505.36F;
        float height = -98752.55F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 4863827744F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.0001);

    }

    @Test
    public void testArea9() {
        System.out.println("area b=-9875.00 ; h=0.2582");
        float base = -9875.00F;
        float height = 0.2582F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = -1274.8625F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

    @Test
    public void testArea10() {
        System.out.println("area b=8582.528 ; h=28.00");
        float base = 8582.528F;
        float height = 28.00F;
        AreaTriangle instance = new AreaTriangle();
        float expResult = 120155.392F;
        float result = instance.area(base, height);
        assertEquals(expResult, result, 0.01);

    }

}
