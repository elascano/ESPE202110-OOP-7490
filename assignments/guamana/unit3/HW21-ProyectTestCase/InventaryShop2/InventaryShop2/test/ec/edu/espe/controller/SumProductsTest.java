/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author --> Angel Guaman <--- , DEEE-ESPE
 */
public class SumProductsTest {
    
    public SumProductsTest() {
    }

    /**
     * Test of add method, of class SumProducts.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        double Product1 = 2.25;
        double Product2 = 2.25;
        double Product3 = 2.25;
        SumProducts instance = new SumProducts();
        double expResult = 6.75;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct1() {
        System.out.println("add");
        double Product1 = 1.50;
        double Product2 = 1.50;
        double Product3 = 2.0;
        SumProducts instance = new SumProducts();
        double expResult = 5.0;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct2() {
        System.out.println("add");
        double Product1 = 2.50;
        double Product2 = 2.50;
        double Product3 = 0.50;
        SumProducts instance = new SumProducts();
        double expResult = 5.50;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct3() {
        System.out.println("add");
        double Product1 = 0.80;
        double Product2 = 0.50;
        double Product3 = 3.00;
        SumProducts instance = new SumProducts();
        double expResult = 4.30;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct4() {
        System.out.println("add");
        double Product1 = 1.80;
        double Product2 = 1.80;
        double Product3 = 1.00;
        SumProducts instance = new SumProducts();
        double expResult = 4.60;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct5(){
        System.out.println("add");
        double Product1 = 10.50;
        double Product2 = 2.50;
        double Product3 = 0.85;
        SumProducts instance = new SumProducts();
        double expResult = 13.85;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct6() {
        System.out.println("add");
        double Product1 = 14.50;
        double Product2 = 0.50;
        double Product3 = 4.00;
        SumProducts instance = new SumProducts();
        double expResult = 19.0;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testSumProduct7() {
        System.out.println("add");
        double Product1 = 0.25;
        double Product2 = 12.50;
        double Product3 = 25.50;
        SumProducts instance = new SumProducts();
        double expResult = 38.25;
        double result = instance.add(Product1, Product2, Product3);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
}
