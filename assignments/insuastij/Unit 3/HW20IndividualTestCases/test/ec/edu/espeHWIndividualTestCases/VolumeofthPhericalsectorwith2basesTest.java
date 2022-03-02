
package ec.edu.espeHWIndividualTestCases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
 */
public class VolumeofthPhericalsectorwith2basesTest {
    
    public VolumeofthPhericalsectorwith2basesTest() {
    }

    /**
     * Test of add method, of class VolumeofthPhericalsectorwith2bases.
     */
    @Test
    public void testAdd() {
        System.out.println("Volume");
        double addend1 = 2.0;
        double addend2 = 3.0;
        double addend3 = 1.5;
        VolumeofthPhericalsectorwith2bases instance = new VolumeofthPhericalsectorwith2bases();
        double expResult = 57.14;
        double result = instance.add(addend1, addend2, addend3);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add1 method, of class VolumeofthPhericalsectorwith2bases.
     */
    @Test
    public void testAdd1() {
        System.out.println("Volume2");
        double addend1 = 3.0;
        double addend2 = 4.0;
        double addend3 = 2.0;
        VolumeofthPhericalsectorwith2bases instance = new VolumeofthPhericalsectorwith2bases();
        double expResult = 229.33;
        double result = instance.add1(addend1, addend2, addend3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add2 method, of class VolumeofthPhericalsectorwith2bases.
     */
    @Test
    public void testAdd2() {
        System.out.println("Volume3");
        double addend1 = 0.4;
        double addend2 = 0.6;
        double addend3 = 1.0;
        VolumeofthPhericalsectorwith2bases instance = new VolumeofthPhericalsectorwith2bases();
        double expResult = 0.8168;
        double result = instance.add2(addend1, addend2, addend3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add3 method, of class VolumeofthPhericalsectorwith2bases.
     */
    @Test
    public void testAdd3() {
        System.out.println("Volume4");
        double addend1 = 54.0;
        double addend2 = 23.0;
        double addend3 = 19.0;
        VolumeofthPhericalsectorwith2bases instance = new VolumeofthPhericalsectorwith2bases();
        double expResult = 5786523.071;
        double result = instance.add3(addend1, addend2, addend3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add4 method, of class VolumeofthPhericalsectorwith2bases.
     */
    @Test
    public void testAdd4() {
        System.out.println("Volume5");
        double addend1 = 11.0;
        double addend2 = 0.0;
        double addend3 = 5.0;
        VolumeofthPhericalsectorwith2bases instance = new VolumeofthPhericalsectorwith2bases();
        double expResult = 950.332;
        double result = instance.add4(addend1, addend2, addend3);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
