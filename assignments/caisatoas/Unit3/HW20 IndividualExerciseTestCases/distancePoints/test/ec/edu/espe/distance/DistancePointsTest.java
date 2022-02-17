
package ec.edu.espe.distance;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Caisatoa
 */
public class DistancePointsTest {
    
    public DistancePointsTest() {
    }

    /**
     * Test of distance method, of class DistancePoints.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        int x1 = -1;
        int x2 = 1;
        int y1 = 0;
        int y2 = -2;
        int z1 = 4;
        int z2 = -3;
        DistancePoints instance = new DistancePoints();
        float expResult = 7.54F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testDistance2() {
        System.out.println("distance");
        int x1 = 3;
        int x2 = 2;
        int y1 = 4;
        int y2 = 5;
        int z1 = 2;
        int z2 = 4;
        DistancePoints instance = new DistancePoints();
        float expResult = 2.44F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.1);
    }@Test
    public void testDistance3() {
        System.out.println("distance");
        int x1 = 4;
        int x2 = -3;
        int y1 = -2;
        int y2 = -3;
        int z1 = 1;
        int z2 = -7;
        DistancePoints instance = new DistancePoints();
        float expResult =10.67F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance4() {
        System.out.println("distance");
        int x1 = -3;
        int x2 = 4;
        int y1 = -6;
        int y2 = 6;
        int z1 = -5;
        int z2 = 9;
        DistancePoints instance = new DistancePoints();
        float expResult = 19.72F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance5() {
        System.out.println("distance");
        int x1 = 4;
        int x2 = -7;
        int y1 = 6;
        int y2 = 5;
        int z1 = 3;
        int z2 = 6;
        DistancePoints instance = new DistancePoints();
        float expResult = 11.44F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance6() {
        System.out.println("distance");
        int x1 = 9;
        int x2 = 4;
        int y1 = 4;
        int y2 = -6;
        int z1 = 5;
        int z2 = -2;
        DistancePoints instance = new DistancePoints();
        float expResult = 13.19F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance7() {
        System.out.println("distance");
        int x1 = 2;
        int x2 = 3;
        int y1 = 4;
        int y2 = 2;
        int z1 = 1;
        int z2 = 4;
        DistancePoints instance = new DistancePoints();
        float expResult = 3.74F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance8() {
        System.out.println("distance");
        int x1 = 5;
        int x2 = 8;
        int y1 = 8;
        int y2 = 7;
        int z1 = 2;
        int z2 = 4;
        DistancePoints instance = new DistancePoints();
        float expResult = 3.74F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.01);
    }@Test
    public void testDistance9() {
        System.out.println("distance");
        int x1 = 2;
        int x2 = 6;
        int y1 = -9;
        int y2 = 7;
        int z1 = -4;
        int z2 = 4;
        DistancePoints instance = new DistancePoints();
        float expResult = 18.33F;
        float result = instance.distance(x1, x2, y1, y2, z1, z2);
        assertEquals(expResult, result, 0.001);
    }
}
