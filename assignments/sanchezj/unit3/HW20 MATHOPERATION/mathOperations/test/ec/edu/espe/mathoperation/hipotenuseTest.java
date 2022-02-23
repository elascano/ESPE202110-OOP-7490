/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.mathoperation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Sanchez, DEEL-ESPE
 */
public class hipotenuseTest {
    
    public hipotenuseTest() {
    }

    /**
     * Test of calculate method, of class hipotenuse.
     */
    @Test
    public void testCalculatewithcero() {
        System.out.println("calculate");
        double opoleg = 6.0;
        double adjleg = 0.0;
        hipotenuse instance = new hipotenuse();
        double expResult = 6.0;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    }
    
   
     
    @Test
    public void testCalculatewithdecimal() {
        System.out.println("calculate");
        double opoleg = 2.30;
        double adjleg = 20.0;
        hipotenuse instance = new hipotenuse();
        double expResult = 20.131815616083912;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
     
    }
     @Test
    public void testCalculatewithdecimal3() {
        System.out.println("calculate");
        double opoleg = 10.0;
        double adjleg = 9.0 ;
        hipotenuse instance = new hipotenuse();
        double expResult = 13.45362404707371;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    }
     
    @Test
    public void testCalculatewithdecimala() {
        System.out.println("calculate");
        double opoleg = 100.0;
        double adjleg = 8.00;
        hipotenuse instance = new hipotenuse();
        double expResult = 100.31948963187563;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    }
     
  
     @Test
    public void testCalculatewithdecimalb() {
        System.out.println("calculate");
        double opoleg = 5.876;
        double adjleg = 126.9787 ;
        hipotenuse instance = new hipotenuse();
        double expResult = 127.11458464586194;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
       
    }
   
    @Test
    public void testCalculatewithdecimalc() {
        System.out.println("calculate");
        double opoleg = -6.0;
        double adjleg = 23.0;
        hipotenuse instance = new hipotenuse();
        double expResult = 23.769728648009426;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    }
    
   
     @Test
    public void testCalculatewithdecimald() {
        System.out.println("calculate");
        double opoleg = 20.0;
        double adjleg = 5.0 ;
        hipotenuse instance = new hipotenuse();
        double expResult = 20.615528128088304;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
    }
    
   
    
        @Test
    public void testCalculatewithdecimale() {
        System.out.println("calculate");
        double opoleg = 0.0;
        double adjleg = 0.0;
        hipotenuse instance = new hipotenuse();
        double expResult = 0.0;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    }
    
     @Test
    public void testCalculatewithdecimalf() {
        System.out.println("calculate");
        double opoleg = -9.0;
        double adjleg = 5.2 ;
        hipotenuse instance = new hipotenuse();
        double expResult = 10.394229168149026;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
}
    
    
    @Test
    public void testCalculatewithdecimalj() {
        System.out.println("calculate");
        double opoleg = 1.0;
        double adjleg = 1.0;
        hipotenuse instance = new hipotenuse();
        double expResult = 1.4142135623730951;
        double result = instance.calculate(opoleg, adjleg);
        assertEquals(expResult, result, 0.0);
      
    } 
}
