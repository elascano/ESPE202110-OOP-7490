package ec.edu.espe.perimeterrhomboid;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class PerimeterOperationTest {
    
    public PerimeterOperationTest() {
    }

    /**
     * Test of perimeter method, of class PerimeterOperation.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter float");
        float sideA = 12.3F;
        float sideB = 10.9F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = 46.4F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterNegativeAndPositiveFloat() {
        System.out.println("perimeter negative and positive float");
        float sideA = 4.05F;
        float sideB = -6.99F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult =Math.round(-5.87F);
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    
    @Test
    public void testPerimeterBigFloat() {
        System.out.println("perimeter big float");
        float sideA = 7234.19F;
        float sideB = 6.05F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = Math.round(14480.48F);
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, Math.round(result), 0.0);
        
    }
    
    @Test
    public void testPerimeterZeroAndNegativeFloat() {
        System.out.println("perimeter zero and negative float");
        float sideA = 0.0F;
        float sideB = -19.85F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = -39.7F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterSmallFloat() {
        System.out.println("perimeter small float");
        float sideA = 2.0F;
        float sideB = 4.7F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = 13.4F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterTenFloat() {
        System.out.println("perimeter ten float");
        float sideA = 10.115F;
        float sideB = 10.99F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = 42.21F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterNegatives() {
        System.out.println("perimeter negatives float");
        float sideA = -25.07F;
        float sideB = -14.80F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = -79.74F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterBigSides() {
        System.out.println("perimeter big sides");
        float sideA = 2222.2F;
        float sideB = 894.0F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = 6232.4F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterBigNegativeSides() {
        System.out.println("perimeter big negative sides");
        float sideA = -15798.77F;
        float sideB = -1788.09F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = -35173.72F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testPerimeterNegativeAndZero() {
        System.out.println("perimeter negative and zero");
        float sideA = -984.55F;
        float sideB = 0.0F;
        PerimeterOperation instance = new PerimeterOperation();
        float expResult = -1969.1F;
        float result = instance.perimeter(sideA, sideB);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
