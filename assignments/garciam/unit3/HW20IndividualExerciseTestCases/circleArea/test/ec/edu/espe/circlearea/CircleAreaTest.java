
package ec.edu.espe.circlearea;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayerly Garcia
 */
public class CircleAreaTest {
    
    public CircleAreaTest() {
    }

    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testArea() {
        System.out.println("Area");
        double radio = 2.0;
        CircleArea instance = new CircleArea();
        double expResult = 12.566;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 1.0);
       
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaTwo() {
        System.out.println("Area");
        double radio = 1.0;
        CircleArea instance = new CircleArea();
        double expResult = 3.1415;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 1.1);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreathree() {
        System.out.println("Area");
        double radio = 0.5;
        CircleArea instance = new CircleArea();
        double expResult = 0.7853;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaFour() {
        System.out.println("Area");
        double radio = 8.0;
        CircleArea instance = new CircleArea();
        double expResult = 201.061;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
     /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaFive() {
        System.out.println("Area");
        double radio = 16.0;
        CircleArea instance = new CircleArea();
        double expResult = 804.224;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaSix() {
        System.out.println("Area");
        double radio = 4.0;
        CircleArea instance = new CircleArea();
        double expResult = 50.264;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaSeven() {
        System.out.println("Area");
        double radio = 1.54;
        CircleArea instance = new CircleArea();
        double expResult = 7.45;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaEigth() {
        System.out.println("Area");
        double radio = 5.0;
        CircleArea instance = new CircleArea();
        double expResult = 78.5375;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaNine() {
        System.out.println("Area");
        double radio = 6.0;
        CircleArea instance = new CircleArea();
        double expResult = 113.094;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    }
    /**
     * Test of Area method, of class CircleArea.
     */
    @Test
    public void testAreaTen() {
        System.out.println("Area");
        double radio = 100.0;
        CircleArea instance = new CircleArea();
        double expResult = 31415.9265;
        double result = instance.Area(radio);
        assertEquals(expResult, result, 0.2);
        
    
    }
}
