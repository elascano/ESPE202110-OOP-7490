
package ec.edu.espe.volume;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier Paucar
 */
public class VolumeCylinderTest {
    
    public VolumeCylinderTest() {
    }

    /**
     * Test of calculateVolume method, of class VolumeCylinder.
     */
    @Test
    public void testCalculateVolumeInteger() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 2.0F;
        float radio = 8.0F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 157.904356F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeDecimals() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 9.4F;
        float radio = 9.8F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 909.134329F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeIntegerDecimal() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 4.0F;
        float radio = 9.14F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 360.811453F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeDecimalInteger() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.5F;
        float radio = 8.0F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 39.476089F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeNegative() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.5F;
        float radio = -8.0F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = -39.476089F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeHundredths() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.59F;
        float radio = 8.19F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 47.688095F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
    @Test
    public void testCalculateVolumeThousandths() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.589F;
        float radio = 2.123F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 12.3406877F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
   
     @Test
    public void testCalculateVolumeIntegerThousandths() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 2.0F;
        float radio = 2.123F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 41.903865F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
     @Test
    public void testCalculateVolumeHundredthsThousandths() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.589F;
        float radio = 2.123F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 12.3406877F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
    
     @Test
    public void testCalculateVolumeThousandthsHundredths() {
        System.out.println("calculateVolume");
        float pi1 = 3.1415F;
        float pi2 = 3.1415F;
        float height = 0.589F;
        float radio = 2.123F;
        VolumeCylinder instance = new VolumeCylinder();
        float expResult = 12.3406877F;
        float result = instance.calculateVolume(pi1, pi2, height, radio);
        assertEquals(expResult, result, 0.000000);
    }
}
