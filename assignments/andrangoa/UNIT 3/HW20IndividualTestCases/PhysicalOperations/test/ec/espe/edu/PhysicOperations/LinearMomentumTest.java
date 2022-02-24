
package ec.espe.edu.PhysicOperations;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Alex Andrango
 */
public class LinearMomentumTest {
    
    public LinearMomentumTest() {
    }

    @Test
    public void testLienarMomentumInt1() {
        System.out.println("lienarMomentum");
        float mass = 3.0F;
        float speed = 4.0F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 12.0F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testLienarMomentumInt2() {
        System.out.println("lienarMomentum");
        float mass = 8.0F;
        float speed = 5.0F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 40.0F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.0);

    }
     @Test
    public void testLienarMomentumTwoNegatives() {
        System.out.println("lienarMomentum");
        float mass = -10.4F;
        float speed = -20.9F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 217.36F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.001);

    }
     @Test
    public void testLienarMomentumHundreds() {
        System.out.println("lienarMomentum");
        float mass = 710.7F;
        float speed = 113.2F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 80451.24F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.02);

    }
     @Test
    public void testLienarMomentumThousands() {
        System.out.println("lienarMomentum");
        float mass = 3001.0F;
        float speed = 680.8F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 2043080.8F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.001);

    }
     @Test
    public void testLienarMomentum() {
        System.out.println("lienarMomentum");
        float mass = 4.137F;
        float speed = 59.14F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 244.66218F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.0);

    }
     @Test
    public void testLienarMomentumNegative() {
        System.out.println("lienarMomentum");
        float mass = -39.18F;
        float speed = 1.11F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = -43.98F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.001);

    }
     @Test
    public void testLienarMomentumLow() {
        System.out.println("lienarMomentum");
        float mass = 0.1F;
        float speed = 0.1F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 0.0100F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.001);

    }
     @Test
    public void testLienarMomentumCeroSpeed() {
        System.out.println("lienarMomentum");
        float mass = 500.1F;
        float speed = 0.0F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 0.0F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.0);

    }
     @Test
    public void testLienarMomentumCeroMass() {
        System.out.println("lienarMomentum");
        float mass = 0.0F;
        float speed = 415.1F;
        LinearMomentum instance = new LinearMomentum();
        float expResult = 0.0F;
        float result = instance.lienarMomentum(mass, speed);
        assertEquals(expResult, result, 0.0);

    }    
}
