
package ec.edu.espe.house.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class TelevisionDimensionTest {
    
    public TelevisionDimensionTest() {
    }

    /**
     * Test of calculateHighOfTv method, of class TelevisionDimensions.
     */
    
            @Test
    public void testCalculateHighOfTvZero() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 0;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 0.00F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
            @Test
    public void testCalculateHighOfTvOne() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 1;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 2.21F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
    @Test
    public void testCalculateHighOfTvLowIntegers1() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 32;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 70.72F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
        @Test
    public void testCalculateHighOfTvLowIntegers2() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 50;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 110.50F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
            @Test
    public void testCalculateHighOfTvHighIntegers1() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 6500;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 14365.00F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
            @Test
    public void testCalculateHighOfTvHighIntegers2() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 125653;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 277693.13F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
    
            @Test
    public void testCalculateHighOfTvLowFloat1() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = 60.45;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 133.59F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
      
        @Test
    public void testCalculateHighOfTvNegativeLowIntegers1() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = -45;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = -99.45F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
      
    
        @Test
    public void testCalculateHighOfTvnegativeLowFloat() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = -15.63;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = -34.54F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }
      
  
        @Test
    public void testCalculateHighOfTvNegativeHighFloat() {
        System.out.println("calculateHighOfTv");
        double diagonalSize = -1516651.65;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = -3351800.15F;
        double result = instance.calculateHighOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01); 
    }

    /**
     * Test of calculateWidthOfTv method, of class TelevisionDimensions.
     */
    @Test
    public void testCalculateWidthOfTvLowIntegers1() {
        System.out.println("calculateWidthOfTv");
        double diagonalSize = 32;
        TelevisionDimensions instance = new TelevisionDimensions();
        double expResult = 39.84F;
        double result = instance.calculateWidthOfTv(diagonalSize);
        assertEquals(expResult, result, 0.01);        
    }
    
}
