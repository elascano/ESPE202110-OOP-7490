/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.mathOperations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class mathOperationTest {
    
    public mathOperationTest() {
    }

    /**
     * Test of main method, of class mathOperation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 5;
        double perimeter = 2*pi*radius;
        double expResult = 31.4;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);

    }
    
    @Test
    public void testMainCero() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 0;
        double perimeter = 2*pi*radius;
        double expResult = 0;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testMainGreaterThaHundred() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 200;
        double perimeter = 2*pi*radius;
        double expResult = 1256;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);

    }
    
     @Test
    public void testNegative() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= -2;
        double perimeter = 2*pi*radius;
        double expResult = 12.56;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }

     @Test
    public void testMainTwoDecimals() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 14.22;
        double perimeter = 2*pi*radius;
        double expResult = 89.3016;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.01);
    }
    
   @Test
    public void testMainThreeDecimals() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 19.234;
        double perimeter = 2*pi*radius;
        double expResult = 120.78952;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }
    
        @Test
    public void testMainRadiusSix() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 6;
        double perimeter = 2*pi*radius;
        double expResult = 37.68;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }
    
        @Test
    public void testMaiRadiusEight() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 8;
        double perimeter = 2*pi*radius;
        double expResult = 50.24;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }
    
        @Test
    public void testMainRadiusNine() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 9;
        double perimeter = 2*pi*radius;
        double expResult = 56.52;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testMainfFourDigitNumbers() {
        System.out.println("main");
        String[] args = null;
        double pi=3.14;
        double radius= 4456;
        double perimeter = 2*pi*radius;
        double expResult = 27983.68;
        double result = mathOperation.main(args, perimeter, (float) radius);
        assertEquals(expResult, result, 0.001);
    }
}

