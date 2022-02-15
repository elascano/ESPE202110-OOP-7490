
package ec.edu.espe.distanceoperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author --> Angel Guaman <--- , DEEE-ESPE
 */
public class distanceMultiplicationTest {
    
    public distanceMultiplicationTest() {
    }

    /**
     * Test of add method, of class distanceMultiplication.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double time = 10.25;
        double speed = -3.248;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = -33.292;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
     
    }
    @Test
    public void testPositiveDistance() {
        System.out.println("add");
        double time = 1050.0;
        double speed = 25.8;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 27090.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testNegativeDistance() {
        System.out.println("add");
        double time = 400.0;
        double speed = 60.900;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 24360.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testNeutralDistance() {
        System.out.println("add");
        double time = 100;
        double speed = 72.58;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 7258.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDistance() {
        System.out.println("add");
        double time = 80.0;
        double speed = -25.25;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = -2020.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testDistance5() {
        System.out.println("add");
        double time = 40.0 ;
        double speed = 10.20;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 408.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testDistanicaTravel() {
        System.out.println("add");
        double time = -20.0;
        double speed = -14.56;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 291.2;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testDistanceofaBall() {
        System.out.println("add");
        double time = -22.2;
        double speed = -25.8;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult =  572.76 ;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testProjectileDistance() {
        System.out.println("add");
        double time = 9.81;
        double speed = 0.0;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 0.0;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testCarriageDistance() {
        System.out.println("add");
        double time = -42.2558;
        double speed = -0.1;
        distanceMultiplication instance = new distanceMultiplication();
        double expResult = 4.22558;
        double result = instance.add(time, speed);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
