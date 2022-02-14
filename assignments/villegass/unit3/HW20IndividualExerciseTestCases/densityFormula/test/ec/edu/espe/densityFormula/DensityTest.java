
package ec.edu.espe.densityFormula;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class DensityTest {
    
    public DensityTest() {
    }

    /**
     * Test of divide method, of class Density.
     */
    @Test
    public void testDensity1() {
        System.out.println("Density decimal - integer");
        float mass = 15.7F;
        float volume = 12F;
        Density instance = new Density();
        float expResult = 1.308333F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
    @Test
    public void testDensity2() {
        System.out.println("Density decimal - decimal ");
        float mass = 10.6F;
        float volume = 8.01F;
        Density instance = new Density();
        float expResult = 1.323346F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
        @Test
    public void testDensity3() {
        System.out.println("Density decimal 1 < decimal 2");
        float mass = 8.3F;
        float volume = 15.2F;
        Density instance = new Density();
        float expResult = 0.546053F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
        @Test
    public void testDensity4() {
        System.out.println("Density decimal 1 > decimal 2");
        float mass = 210.6F;
        float volume = 0.96F;
        Density instance = new Density();
        float expResult = 219.375000F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
        @Test
    public void testDensity5() {
        System.out.println("Density decimal 1 < decimal 2");
        float mass = 0.36F;
        float volume = 18.3F;
        Density instance = new Density();
        float expResult = 0.019672F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
        @Test
    public void testDensity6() {
        System.out.println("Density decimal without zeros");
        float mass = 7.89F;
        float volume = 4.29F;
        Density instance = new Density();
        float expResult = 1.839161F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
   
        @Test
    public void testDensity7() {
        System.out.println("Density multiples of 100");
        float mass = 200F;
        float volume = 6.32F;
        Density instance = new Density();
        float expResult = 31.645570F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.01);
     
    }
    
    @Test
    public void testDensity8() {
        System.out.println("Density same decimals");
        float mass = 17.5F;
        float volume = 17.5F;
        Density instance = new Density();
        float expResult = 1F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.00);

    }
    
        @Test
    public void testDensity9() {
        System.out.println("Density decimal starting with zeros");
        float mass = 16F;
        float volume = 0.00007F;
        Density instance = new Density();
        float expResult = 228571.4286F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.00);
     
    }
    
        @Test
    public void testDensity10() {
        System.out.println("Density division with zero ");
        float mass = 0F;
        float volume = 7.08F;
        Density instance = new Density();
        float expResult = 0F;
        float result = instance.divide(mass, volume);
        assertEquals(expResult, result, 0.00);
     
    }
    
}
